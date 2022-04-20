import java.io.IOException;
public class UniqueWords {
    private BookReader book = new BookReader("WarAndPeace.txt");

    public UniqueWords() throws IOException {
        addUniqueWordsToArrayList();
        addUniqueWordsToLinkedList();
        addUniqueWordsToOrderedList();
    }

    public void addUniqueWordsToOrderedList() {
        long start, finish,  difference;
        start = System.currentTimeMillis();
        System.out.println("Adding unique words using OrderedList");
        String words = book.getWords().first();
        int size = 0;
        MyOrderedList<String> uniqueWords = new MyOrderedList<>();
        while (words != null) {
            if (!uniqueWords.binarySearch(words)) {
                uniqueWords.add(words);
            }
            words = book.getWords().next();
        }
        System.out.println("Array list unique words: " + uniqueWords.size());
        System.out.println("Array List comparisons: " + uniqueWords.getComparisons());
        finish = System.currentTimeMillis();
        difference = finish - start;
        System.out.println("Time to process: " + difference / 1000 + " seconds.");
        System.out.println();
    }

    public void addUniqueWordsToArrayList() {
        long start, start2, finish, finish2, difference, difference2;
        start = System.currentTimeMillis();
        System.out.println("Adding unique words using linkedList");
        String words = book.getWords().first();
        int size = 0;
        MyArrayList<String> uniqueWords = new MyArrayList<>();
        while (words != null) {
            if (!uniqueWords.contains(words)) {
                uniqueWords.insert(words, size++);
            }
            words = book.getWords().next();
        }
        System.out.println("Array list unique words: " + uniqueWords.size());
        System.out.println("Array List comparisons: " + uniqueWords.getComparisons());
        finish = System.currentTimeMillis();
        difference = finish - start;
        System.out.println("Time to process: " + difference / 1000 + " seconds.");
        start2 = System.currentTimeMillis();
        uniqueWords.sort();
        finish2 = System.currentTimeMillis();
        difference2 = finish2 - start2;
        System.out.println("Time to bubble sort: " + difference2 / 1000 + " seconds.");
        System.out.println();
    }

    public void addUniqueWordsToLinkedList() {
        long start, start2, finish, finish2, difference, difference2;
        start = System.currentTimeMillis();
        System.out.println("Adding unique words using linkedList");
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
        start2 = System.currentTimeMillis();
        uniqueWords.sort();
        finish2 = System.currentTimeMillis();
        difference2 = finish2 - start2;
        System.out.println("Time to bubble sort: " + difference2 / 1000 + " seconds.");
        System.out.println();
    }

}
