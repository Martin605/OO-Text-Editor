package editor.echar;

import java.util.ArrayList;
import java.util.HashMap;

//CharacterFactory 用來建立 flyweight 的物件:Character
public class EcharacterFactory{
    //<String:key,Character:value>=>用get()取
    private static final HashMap<String,Echaracter> characterMap= new HashMap<String,Echaracter>();
    public static Echaracter getCharacter(String word){
        Echaracter character=null;

    //    從characterMap.get(word)if get(null)->new Char->丟入map
        character = (Echaracter)characterMap.get(word);
        if(character==null){
            character=new Echar(word);
            characterMap.put(word,character);
        }
        return character;
    }

    public static ArrayList<Echaracter> stringToCharacter(String word){
        ArrayList<Echaracter> wordChar = new ArrayList<Echaracter>();
        for(int i=0; i<word.length();i++) {
            wordChar.add(getCharacter(word.substring(i,i+1)));
        }
        return wordChar;
    }

    public static String arrayListToString(ArrayList<Echaracter> word){
        String str = new String();
        for(Echaracter i:word) {
            str = str + i.getCharacter();
        }
        return str;
    }

}
