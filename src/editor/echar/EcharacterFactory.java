package editor.echar;

import java.util.ArrayList;
import java.util.HashMap;

//Flyweight Pattern
//FlyweightFactory
//CharacterFactory 用來建立 flyweight 的物件:Character
public class EcharacterFactory{
    //<String:key,Character:value>=>用get()取
    private static final HashMap<String,Echaracter> characterMap= new HashMap<String,Echaracter>();
    
    public static Echaracter getCharacter(String word){
        Echaracter character=null;

        //從characterMap.get(word)
        //if get(null)->new Char->丟入map
        //設定character等於拿出來的物件
        character = (Echaracter)characterMap.get(word);

        //如果character物件沒有創出來過
        if(character==null){ 
            //創建此字母物件
            character=new Echar(word);

            //放入characterMap儲存，前面輸入的字，
            //後面是建立好的物件來對應
            characterMap.put(word,character);
        }
        //如果character物件有創出來過，則回傳
        return character;
    }

    //將字串轉為字元，用意為節省空間
    public static Estring stringToCharacter(String word){ 
        ArrayList<Echaracter> wordChar = new ArrayList<Echaracter>();

        for(int i=0; i<word.length();i++) {
            //存進陣列裡
            wordChar.add(getCharacter(word.substring(i,i+1))); 
        }
        return new Estring(wordChar);
    }

    //將字元變回String
    public static String arrayListToString(Estring word){ 
        return word.getCharacter();
    }

}
