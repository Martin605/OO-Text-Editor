import javax.swing.*;

class TextEditor extends JFrame {
    JTextArea text_area;
    JFrame frame;

    TextEditor() {
        frame = new JFrame("Editor");
        text_area = new JTextArea();
        frame.add(text_area);
        frame.setSize(900, 600);
        frame.show();
    }

    public static void main(String args[]){
        TextEditor te = new TextEditor();
    }
}