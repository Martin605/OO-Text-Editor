package editor.file.fileList.iterator;

import editor.file.fileList.*;

public class FLList {

    public static String getList(String str) {
        //從0開始 建立FLDirectory資料夾物件
        return iteratorAction(0,new FLDirectory(str));
    }

    public static String iteratorAction(int i,FLDirectory o) {
        //建立一個Repository資料夾物件
        Repository cRepository = new Repository(o);
        String output = "";

        //FLIterator取名為it cRepository的getIterator方法 
        //FLIterator的hasNext方法
        for(FLIterator it = cRepository.getIterator(); it.hasNext();) {
            //FLFile取名為a 等於FLIterator的next方法
            FLFile a = (FLFile)it.next();

            //建立顯示的文字再回傳自己
            //判斷FLFile的get_type是否等於"directory"字串
            if (a.get_type() == "directory") {
                output = output + "  ".repeat(i)+"↪[DIR]"+a.get_name()+"\n";
                //(FLDirectory)a是強制轉換類別
                output = output + iteratorAction(i+1,(FLDirectory)a);
            } else if (a.get_type() == "file") { 
                //如果type是file的話，回傳自己
                output = output + "  ".repeat(i)+"↪"+a.get_name()+"\n";
            }
        }
        return output;
    }
}

