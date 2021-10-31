package editor;

import java.awt.*;
import javax.swing.*;

//Observer Pattern
//擔任抽象Observer角色
public abstract class Editor extends JFrame {

    protected Editor(String name) { //加入目前開啟的視窗到編輯視窗組，並取得目前編輯視窗組(所有開啟的視窗)
        super(name);
        EditorGroup.getEditorGroup().addEditor(this);
    }

    public abstract void update_theme(Color background, Color foreground); //更新主題(背景顏色和字體顏色)
    public abstract void update_Font(Font font); //更新字體(粗體或一般體)

}
