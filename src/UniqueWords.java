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

    public static void addUniqueWordsToArrayList() {
    }

    public static void addUniqueWordsToLinkedList() {
    }

}
