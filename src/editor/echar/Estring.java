package editor.echar;

import java.util.ArrayList;

public class Estring implements Echaracter {
    private final ArrayList<Echaracter> str;
    
    public Estring(ArrayList<Echaracter> wordChar){
        this.str=wordChar;
    }
    
    @Override //(複寫interface 的public void show();)
    public String getCharacter(){
        String ostr = new String();
        for(Echaracter i:this.str) {
            ostr = ostr + i.getCharacter();
        }
        return ostr;
    }

    public int size() {
        return str.size();
    }

    public Object get(int i) {
        return str.get(i);
    };

    public String toString() {
        return this.getCharacter();
    }
}