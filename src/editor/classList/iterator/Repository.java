package editor.classList.iterator;

public class Repository implements CContainer {

    String[] str;
    String key;
    int i = -1;

    Repository(String str) {
        this.str = str.split(" |\n");
    }

    @Override
    public CIterator getIterator() {
        return new SearchIterator();
    }

    private class SearchIterator implements CIterator {
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
