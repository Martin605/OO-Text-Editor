package editor.setting;
import editor.setting.theme.Theme;
import editor.setting.theme.Light;

// Strategy - Context
public class ThemeEditor {

    // Singleton Pattern (only can new one ThemeEditor)
    private static ThemeEditor uniqueThemeEditor = new ThemeEditor();
    private static Theme theme;

    public static ThemeEditor getThemeEditor() {
        return uniqueThemeEditor;
    }

    // Strategy 
    public void change() {
        if (theme == null) {
            theme = new Light();
        }
        theme.setTheme();
    }
    
    public void ChoiceTheme(Theme format) { 
        // 選擇佈景主題 
        theme = format; 
        this.change();
    } 
    
}
