import javax.swing.*;

import java.awt.Color;
import java.awt.event.ActionEvent;


public class MenuBar {

    public static class FileMenu extends JMenu {
        FileMenu(TextEditor textEditor) {
            super("File");
            JMenuItem newMenuItem = new JMenuItem("New");
            JMenuItem newWindowMenuItem = new JMenuItem(
                new AbstractAction("New Window"){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        new Windows().NewEditor();
                    }
                });
            JMenuItem openMenuItem = new JMenuItem(
                new AbstractAction("Open"){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        JFileChooser chooser = new JFileChooser(".");
                        chooser.showOpenDialog(textEditor.frame);
                        // ....
                    }
                });
            JMenuItem saveMenuItem = new JMenuItem("Save");
            JMenuItem themeMenuItem = new JMenuItem(
                    new AbstractAction("Theme"){
                        @Override
                        public void actionPerformed(ActionEvent e) {
                            new Windows().setTheme();
                            // textEditor.setTheme(
                            //         new Color(61, 61, 61),
                            //         new Color(255, 255, 255)
                            // );
                        }
                    });
            this.add(newMenuItem);
            this.add(newWindowMenuItem);
            this.add(openMenuItem);
            this.add(saveMenuItem);
            this.add(themeMenuItem);
        }
    }

    public static class EditMenu extends JMenu {
        EditMenu() {
            super("Edit");
            JMenuItem cutMenuItem = new JMenuItem("cut");
            JMenuItem copyMenuItem = new JMenuItem("copy");
            JMenuItem pasteMenuItem = new JMenuItem("paste");
            this.add(cutMenuItem);
            this.add(copyMenuItem);
            this.add(pasteMenuItem);
        }
    }

    public static JMenuBar init(TextEditor textEditor) {
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new FileMenu(textEditor);
        JMenu editMenu = new EditMenu();
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        return menuBar;
    }
}
