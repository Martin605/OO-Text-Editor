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

    //    從characterMap.get(word)if get(null)->new Char->丟入map
        character = (Echaracter)characterMap.get(word);
        //設定character等於拿出來的物件

        if(character==null){ //如果character物件沒有創出來過
            character=new Echar(word);
            //創建此字母物件

            characterMap.put(word,character);
            //放入characterMap儲存，前面輸入的字，後面是建立好的物件來對應
        }
        return character;
        //如果character物件有創出來過，則回傳
    }

    public static Estring stringToCharacter(String word){ //將字串轉為字元，用意為節省空間
        ArrayList<Echaracter> wordChar = new ArrayList<Echaracter>();

        for(int i=0; i<word.length();i++) {
            wordChar.add(getCharacter(word.substring(i,i+1))); //存進陣列裡
        }
        return new Estring(wordChar);
    }

    public static String arrayListToString(Estring word){ //將字元變回String
        return word.getCharacter();
    }

}
