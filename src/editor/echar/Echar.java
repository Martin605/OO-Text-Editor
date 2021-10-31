package editor.echar;

//Flyweight Pattern
//Concrete Flyweight
class Echar implements Echaracter {
    private final String str;//內在狀態
    
    public Echar(String str){ //例如輸入M，設定M到str
        this.str=str;
    }

    @Override
    public String getCharacter(){
        return this.str;
    };
}