package editor.classList;

import java.util.*;

public class Fclass implements CAttribute {

    private String name;
    private String outputType;
    private List<CAttribute> attribute = new ArrayList<CAttribute>();
    
    public void addCAttribute(CAttribute a){
        attribute.add(a);
    }

    public void removeCAttribute(CAttribute a){
        attribute.remove(a);
    }

    public String getName() {
        return this.name;
    }

    public String getType(){
        return "Class";
    }

    public String getOutputType(){
        return this.outputType;
    }
    
}
