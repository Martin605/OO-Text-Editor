package editor.classList.attribute;

public class Cproperty implements CAttribute {

    private String permisstion;
    private String name;
    private String outputType;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getType(){
        return "Property";
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
