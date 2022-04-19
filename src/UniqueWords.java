import java.io.IOException;
public class UniqueWords {
    private BookReader book = new BookReader("WarAndPeace.txt");
    //BookReader book = new BookReader("Test.txt");
    public static void main(String[] args) {
        try {
            UniqueWords uniqueWords = new UniqueWords();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public UniqueWords() throws IOException {
        addUniqueWordsToLinkedList();
        addUniqueWordsToArrayList();
        addUniqueWordsToOrderedList();
    }

    public static void addUniqueWordsToOrderedList() {
        long start, finish, difference;
        start = System.currentTimeMillis();    // Starts timer.
        finish = System.currentTimeMillis(); // Ends timer.
        difference = finish - start; // Calculates the time to process.
        System.out.println("Time to process: " + difference + " milliseconds.");
    }

    public void addUniqueWordsToArrayList() {
        String words = book.getWords().first();
    }

    public void addUniqueWordsToLinkedList() {
        long start, finish, difference;
        start = System.currentTimeMillis();
        String words = book.getWords().first();
        int size = 0;
        MyLinkedList<String> uniqueWords = new MyLinkedList<>();
        while (words != null) {
            if (!uniqueWords.contains(words)) {
                if(uniqueWords.isEmpty()) {
                    uniqueWords.addBefore(words);
                    uniqueWords.first();
                    size++;
                } else {
                    uniqueWords.addAfter(words);
                    uniqueWords.next();
                }
            }
            words = book.getWords().next();
        }
        System.out.println("Linked list unique words: " + uniqueWords.size());
        System.out.println("Linked List comparisons: " + uniqueWords.comparisons);
        finish = System.currentTimeMillis();
        difference = finish - start;
        System.out.println("Time to process: " + difference / 1000 + " seconds.");
    }

}
