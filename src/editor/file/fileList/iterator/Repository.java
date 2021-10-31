package editor.file.fileList.iterator;

import java.util.*;
import editor.file.fileList.*;

public class Repository implements FLContainer {

    List<FLFile> fileList = new ArrayList<FLFile>();
    

    Repository(FLDirectory dir) {
        this.fileList = dir.get_item();
    }

    @Override
    public FLIterator getIterator() {
        return new SFLIterator();
    }

    private class SFLIterator implements FLIterator {
        int i;

        @Override
        public boolean hasNext() {
            if(i<fileList.size())
            {
                return true;
            }
            return false;
        }

        @Override
        public Object next(){
            if(this.hasNext())
            {
                return fileList.get(i++);
            }
            return null;
        }

    }
}
