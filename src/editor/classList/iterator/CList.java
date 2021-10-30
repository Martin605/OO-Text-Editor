package editor.classList.iterator;

public class CList {

    public static void getList(String str) {
        // Repository searchRepository = new SearchRepository();
        Repository strToSearchRepository = new Repository(str);
        
        for(CIterator it = strToSearchRepository.getIterator(); it.hasNext();) {
            // it.next();
            System.out.print(it.next());
        }
        
    }
}

