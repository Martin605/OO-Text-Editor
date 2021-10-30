package editor.search;

import editor.echar.Echaracter;
import editor.echar.EcharacterFactory;
import editor.echar.Estring;

public class Repository implements SContainer {

    String[] str;
    String key;
    int i = -1;

    Repository(String str) {
        this.str = str.split(" |\n");
    }

    @Override
    public SIterator getIterator() {
        return new SearchIterator();
    }

    private class SearchIterator implements SIterator {
        int index;

        @Override
        public boolean hasNext() {
            if(i<str.length)
            {
                i+=1;
                return true;
            }
            return false;
        }

        @Override
        public Object next(){
            if(this.hasNext())
            {
                return str[index++];
            }
                 return null;
        }
    }
}
