package editor.echar;

import java.util.ArrayList;

//Flyweight Pattern
//Concrete Flyweight
public class Estring implements Echaracter {

    private final ArrayList<Echaracter> str; 

    //把輸入的連續動作(字母)，儲存進Array陣列裡
    public Estring(ArrayList<Echaracter> wordChar){
        this.str=wordChar;
    }
    
    @Override 
    public String getCharacter(){
        String ostr = new String();
        //將存進陣列裡的字串一個個拿出，
        //設定ostr字串為拿出的字串
        for(Echaracter i:this.str) { 
            ostr = ostr + i.getCharacter();
        }
        return ostr;
    }

    public int size() { 
        //字串長度
        return str.size();
    }

    public Object get(int i) { 
        //拿其中一個出來
        return str.get(i);
    };

    public String toString() { 
        return this.getCharacter();
    }
}