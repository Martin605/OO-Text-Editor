package editor.search;

public class Search {

    public static void search(String str, String searchStr) {
        // Repository searchRepository = new SearchRepository();
        Repository strToSearchRepository = new Repository(str);
        //新增一個名字為strToSearchRepository然後new一個Repository帶入參數str
        for(SIterator it = strToSearchRepository.getIterator(); it.hasNext();) {
            it.next();
        }
        //
    }
}

