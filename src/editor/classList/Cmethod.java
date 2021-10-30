package editor.classList;

public class Cmethod implements CAttribute {

    private String permisstion;
    private String name;
    private String outputType;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getType(){
        return "Method";
    }

    @Override
    public String getOutputType(){
        return this.outputType;
    }

    @Override
    public String getPermission() {
        return this.permisstion;
    }
    
}
