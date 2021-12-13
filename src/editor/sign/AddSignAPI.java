package editor.sign;

import editor.TextEditor;

// Bridge pattern (Implementor)
//定義如何寫簽名介面
public interface AddSignAPI {
    //定義寫入文字編輯器的方法
    public void add(TextEditor te, String name); 
}
