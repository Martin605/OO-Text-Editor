package editor;

import java.awt.*;
import java.util.ArrayList;


//Observer Pattern，同時也有Singleton Pattern
//擔任Observer Pattern中的Subject角色
//可能用戶會開多個文字編輯器視窗，使用observer pattern確保當一個視窗改主題時，其他視窗也會更動
public class EditorGroup{ //此不設定為abstract的類別，是因為我們目前不需要有concrete類別?

    // Singleton Pattern (only can new one EditorGroup)
    private static EditorGroup uniqueEditorGroup = new EditorGroup();
    //建立一個EditorGroup的物件uniqueEditorGroup，獨立唯一的編輯組，確保都是從這裡來編輯?

    // Observer Pattern (list)
    private static ArrayList<Editor> editorList = new ArrayList<Editor>();

    public static EditorGroup getEditorGroup() { //取得編輯組
        return uniqueEditorGroup;
    }

    public void addEditor(Editor textEditor){ //新增編輯組
        editorList.add(textEditor);
    };

    public void removeEditor(Editor textEditor){ //移除編輯組
        editorList.remove(textEditor);
    }

    // Observer Pattern (loop)
    public void setTheme(Color background, Color foreground) {
        //設定編輯器樣式，透過在Light class等其他設定樣式的class來輸入背景顏色和字體顏色，並傳送到?，使不同用戶開的多個小視窗一起改變樣式
        //background背景，foreground字體顏色
        for (Editor textEditor : editorList) {
            textEditor.update_theme(background, foreground);
        }
    };
    public void setFont(Font font) { //設定編輯器字體大小
    	for (Editor textEditor : editorList) {
            textEditor.setFont(font);
        }
    }

    public void createEditor() { //建立新的編輯器
        new TextEditor();
    }

} 