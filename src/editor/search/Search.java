package editor.search;

public class Search {

    public static void search(String str, String searchStr) {
        // Repository searchRepository = new SearchRepository();
        Repository strToSearchRepository = new Repository(str);
        
        for(SIterator i = strToSearchRepository.getIterator(); i.hasNext();) {
            String s = (String)i.next();
            if (searchStr.equals(s)) {
                System.out.println(s);
            }
        }
    }
}

