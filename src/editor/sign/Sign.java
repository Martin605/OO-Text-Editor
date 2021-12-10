package editor.sign;

// Bridge pattern (Abstraction)
public abstract class Sign {
    protected AddSignAPI addSign;

    protected Sign(AddSignAPI addSign){       
        this.addSign = addSign;    
    }

    public abstract void add();

}
