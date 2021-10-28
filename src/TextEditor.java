import javax.swing.*;
import java.awt.*;

class TextEditor extends JFrame {
    JTextArea text_area;
    JFrame frame;

    TextEditor() {
        frame = new JFrame("Editor");
        text_area = new JTextArea();
        JMenuBar menu_bar = MenuBar.init(this);
        frame.setJMenuBar(menu_bar);
        frame.add(text_area);
        frame.setSize(900, 600);
        frame.show();
    }

    public void setTheme(Color background, Color foreground) {
        text_area.setBackground(background);
        text_area.setForeground(foreground);
    }

    // public static void main(String args[]){
    //     Windows windows = new Windows();
    //     windows.NewEditor();
    // }
}
