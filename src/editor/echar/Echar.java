package editor.echar;

//Flyweight Pattern
//Concrete Flyweight
class Echar implements Echaracter {
    //內在狀態
    private final String str;
    
    //例如輸入M，設定M到str
    public Echar(String str){ 
        this.str=str;
    }

    @Override
    public String getCharacter(){
        return this.str;
    };
}