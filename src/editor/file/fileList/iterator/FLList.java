package editor.file.fileList.iterator;

import editor.file.fileList.*;

public class FLList {

    public static String getList(String str) {
        return iteratorAction(0,new FLDirectory(str));//從0開始 建立FLDirectory資料夾物件
    }

    public static String iteratorAction(int i,FLDirectory o) {
        Repository cRepository = new Repository(o);//建立一個Repository資料夾物件
        String output = "";
        for(FLIterator it = cRepository.getIterator(); it.hasNext();) {
        	//FLIterator取名為it cRepository的getIterator方法 FLIterator的hasNext方法
            FLFile a = (FLFile)it.next();//FLFile取名為a 等於FLIterator的next方法
            if ( a != null) {//如果a有值的話
                if (a.get_type() == "directory") { //判斷FLFile的get_type是否等於"directory"字串
                    output = output + "-----".repeat(i)+"[DIR]"+a.get_name()+"\n";
                    output = output + iteratorAction(i+1,(FLDirectory)a);//(FLDirectory)a是強制轉換類別
                  //建立顯示的文字再回傳自己
                } else if (a.get_type() == "file") { //如果type是file的話，回傳自己
                    output = output + "-----".repeat(i)+a.get_name()+"\n";
                }
            }
        }
        return output;
    }
}

