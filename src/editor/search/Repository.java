package editor.search;

import editor.echar.Echaracter;
import editor.echar.EcharacterFactory;
import editor.echar.Estring;

public class Repository implements SContainer {

    Estring str;
    String key;

    Repository(String str) {
        this.str = EcharacterFactory.stringToCharacter(str) ;
    }

    @Override
    public SIterator getIterator() {
        return new SearchIterator();
    }

    private class SearchIterator implements SIterator {
        int index;

        @Override
        public boolean hasNext() {
            if(index<str.size())
            {
                return true;
            }
            return false;
        }

        @Override
        public Object next(){
            if(this.hasNext())
            {
                return str.get(index++);
            }
                 return null;
        }
    }
}
