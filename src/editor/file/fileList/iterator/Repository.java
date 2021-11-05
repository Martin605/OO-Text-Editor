package editor.file.fileList.iterator;

import java.util.*;
import editor.file.fileList.*;

//Iterator Pattern
public class Repository implements FLContainer {

    //新增一個陣列類別為FLFile名字為fileList
    private List<FLFile> fileList = new ArrayList<FLFile>();

    Repository(FLDirectory dir) { 
        //建構值 FLDirectory取名為dir
        //設定陣列 內容為文件夾的物件
        this.fileList = dir.get_item();
    }

    @Override
    public FLIterator getIterator() {
        //回傳新的SFLIterator方法
        return new SFLIterator();
    }

    private class SFLIterator implements FLIterator {
        int i;

        @Override
        public boolean hasNext() {
            //陣列長度判斷有沒有下一個
            if(i<fileList.size())
            {
                return true;
            }
            return false;
        }

        @Override
        public Object next(){
            //回傳陣列目前位置
            if(this.hasNext())
            {
                return fileList.get(i++);
            }
            return null;
        }

    }
}
