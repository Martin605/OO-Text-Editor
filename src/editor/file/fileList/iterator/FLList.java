package editor.file.fileList.iterator;

import editor.file.fileList.*;

public class FLList {

    public static String getList(String str) {
        return iteratorAction(0,new FLDirectory(str));
    }

    public static String iteratorAction(int i,FLDirectory o) {
        Repository cRepository = new Repository(o);
        String output = "";
        for(FLIterator it = cRepository.getIterator(); it.hasNext();) {
            FLFile a = (FLFile)it.next();
            if ( a != null) {
                if (a.get_type() == "directory") {
                    output = output + "  ".repeat(i)+"↪[DIR]"+a.get_name()+"\n";
                    output = output + iteratorAction(i+1,(FLDirectory)a);
                } else if (a.get_type() == "file") {
                    output = output + "  ".repeat(i)+"↪"+a.get_name()+"\n";
                }
            }
        }
        return output;
    }

    public class getList {
    }
}

