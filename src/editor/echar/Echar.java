package editor.echar;

class Echar implements Echaracter {
    private final String str;
    
    public Echar(String str){
        this.str=str;
    }
    @Override //(複寫interface 的public void show();)
    public String getCharacter(){
        return this.str;
    };
}