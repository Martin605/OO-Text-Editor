package editor;

import java.awt.*;
import java.util.ArrayList;


//Observer Pattern，同時也有Singleton Pattern
//擔任Observer Pattern中的Subject角色
public class EditorGroup{ //此不設定為abstract的類別，是因為我們目前不需要有concrete類別?

    // Singleton Pattern (only can new one EditorGroup)
    private static EditorGroup uniqueEditorGroup = new EditorGroup();
    //建立一個EditorGroup的物件uniqueEditorGroup，獨立唯一的編輯組，確保都是從這裡來編輯?

    // Observer Pattern (list)
    private static ArrayList<TextEditor> editorGroupList = new ArrayList<TextEditor>();
    //建立一個TextEditor型態的陣列物件，用來儲存新增或刪除的編輯組?

    public static EditorGroup getEditorGroup() { //取得編輯組
        return uniqueEditorGroup;
    }

    public void addEditor(TextEditor textEditor){ //新增編輯組
        editorGroupList.add(textEditor);
    };//?

    public void removeEditor(TextEditor textEditor){ //移除編輯組
        editorGroupList.remove(textEditor);
    }

    // Observer Pattern (loop) //Strategy Pattern有用到此方法
    public void setTheme(Color background, Color foreground) { //設定編輯器樣式
        //background背景，foreground字體顏色

        for (TextEditor textEditor : editorGroupList) {
            textEditor.setTheme(background, foreground);
        }
    };

    public void setFont(Font font) { //設定編輯器字體大小
    	for (TextEditor textEditor : editorGroupList) {
            textEditor.setFont(font);
        }
    }

    public void createEditor() { //建立新的編輯器
        new TextEditor();
    }

} 