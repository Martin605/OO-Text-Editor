package editor.search;

public class Function {
String[] func = new String[5];
    
    String key;
    {
    func[0] = "public";
    func[1] = "private";
    func[2] = "class";
    func[3] = "interface";
    func[4] = "this";
    }

    public Function(String keyWord){
        
        for(int i=0;i<func.length;i++){

            if (keyWord == func[i]){
                this.key = func[i];
            }
        }
    }
}
