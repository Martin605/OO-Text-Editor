package editor.search;

public class Search {

    public static void search(String str, String searchStr) {
        // Repository searchRepository = new SearchRepository();
        Repository strToSearchRepository = new Repository(str);
        
        for(SIterator it = strToSearchRepository.getIterator(); it.hasNext();) {
            it.next();
        }
        
    }
}

