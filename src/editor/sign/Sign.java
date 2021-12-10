package editor.sign;

// Bridge pattern (Abstraction)
public abstract class Sign {
    protected AddSignAPI addSign;

    // set Sign api
    protected Sign(AddSignAPI addSign){       
        this.addSign = addSign;    
    }

    // add Sign
    public abstract void add();

}
