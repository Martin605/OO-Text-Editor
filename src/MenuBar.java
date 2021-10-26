import javax.swing.*;

public class MenuBar {

    public static class FileMenu extends JMenu {
        FileMenu() {
            super("File");
            JMenuItem newMenuItem = new JMenuItem("New");
            JMenuItem newWindowMenuItem = new JMenuItem("New Window");
            JMenuItem openMenuItem = new JMenuItem("Open");
            JMenuItem saveMenuItem = new JMenuItem("Save");
            this.add(newMenuItem);
            this.add(newWindowMenuItem);
            this.add(openMenuItem);
            this.add(saveMenuItem);
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

    public static JMenuBar init() {
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new FileMenu();
        JMenu editMenu = new EditMenu();
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        return menuBar;
    }
}
