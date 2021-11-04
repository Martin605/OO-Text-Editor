package editor.setting;
import editor.setting.theme.Theme;
import editor.setting.theme.Light;

// Strategy Pattern - 擔任Context角色。
//同時也有Singleton Pattern
public class ThemeEditor {

    // Singleton Pattern (only can new one ThemeEditor) 
    private static ThemeEditor uniqueThemeEditor = new ThemeEditor(); 
    //建立一個ThemeEditor的物件uniqueThemeEditor，
    //獨立唯一的主題編輯器，確保都是從這裡來設定主題?

    //宣告一個Theme的變數theme
    private static Theme theme; 

    private ThemeEditor() {};

    public static ThemeEditor getThemeEditor() {
        return uniqueThemeEditor;
    }

    // Strategy 
    public void change() {
        //如果theme是空值，也就是沒有任何設定
        if (theme == null) { 
            //則預設為第一種樣式
            theme = new Light(); 
        }
        //將樣式設定進theme
        theme.setTheme(); 
    }
    
    public void ChoiceTheme(Theme format) { 
        // 選擇佈景主題
        theme = format; 
    } 
    
}
