import java.io.*;

public class BookReader {
    public String book = "";
    public static MyLinkedList<String> words = new MyLinkedList<String>();

    public BookReader(String theBook) throws IOException {
        readBook(theBook);
        parseBook();
    }


    public void parseBook() {
        long start, finish, difference;
        start = System.currentTimeMillis();    // Starts timer.
        int size = 0;
        StringBuffer sb = new StringBuffer();
        String[] text = book.split("[^a-zA-Z0-9']+");
        for (String w : text) {
            words.addBefore(w);
        }
        System.out.println(words.size() + " words read.");
        finish = System.currentTimeMillis(); // Ends timer.
        difference = finish - start; // Calculates the time to process.
        System.out.println("Time to process: " + difference + " milliseconds.");
    }


    public void readBook(String theBook) throws IOException {
            File file = new File(String.valueOf(theBook));
            long start, finish, difference;
            start = System.currentTimeMillis();    // Starts timer.
            BufferedReader br = new BufferedReader(new FileReader(file));
            StringBuilder sb = new StringBuilder();
            int c = 0;
            int size = 0;
            while ((c = br.read()) != -1) {
                sb.append((char) c);
                size++;
            }
            br.close();
            book = sb.toString();
            System.out.println(size + " characters read.");
            finish = System.currentTimeMillis(); // Ends timer.
            difference = finish - start; // Calculates the time to process.
            System.out.println("Time to process: " + difference + " milliseconds.");
        }

}
