package editor.file.fileList.iterator;

import java.util.*;
import editor.file.fileList.*;

//Iterator Pattern
public class Repository implements FLContainer {

    List<FLFile> fileList = new ArrayList<FLFile>();
    //新增一個陣列類別為FLFile名字為fileList

    Repository(FLDirectory dir) { //Repository方法 FLDirectory取名為dir
        this.fileList = dir.get_item();//設定陣列 內容為文件夾的物件
    }

    @Override
    public FLIterator getIterator() {
        return new SFLIterator();//回傳新的SFLIterator方法
    }

    private class SFLIterator implements FLIterator {
        int i;

        @Override
        public boolean hasNext() {
            if(i<fileList.size())//陣列長度判斷有沒有下一個
            {
                return true;
            }
            return false;
        }

        @Override
        public Object next(){
            if(this.hasNext())//回傳陣列目前位置
            {
                return fileList.get(i++);
            }
            return null;
        }

    }
}
