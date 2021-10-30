package editor.classList.attribute;

import java.util.*;

public class Cclass implements CAttribute {

    private String permission;
    private String name;
    private List<CAttribute> attribute = new ArrayList<CAttribute>();
    
    public void addCAttribute(CAttribute a){
        attribute.add(a);
    }

    public void removeCAttribute(CAttribute a){
        attribute.remove(a);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getType(){
        return "Class";
    }
    
    @Override
    public String getOutputType(){
        return this.name;
    }

    @Override
    public String getPermission() {
        return this.permission;
    }
    
    
}
