package editor.record;
public class Edit {
    String action;

    public Edit(String action)
    {
        this.action = action;
    }

    public String toString()
    {
        return "Edit的action: " + action;
    }

}
