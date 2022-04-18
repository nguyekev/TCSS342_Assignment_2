public class Test {
    public static void main(String[] args) {
        MyArrayList<Integer> list = new MyArrayList<>();
        for(int i = 0; i < 10; i++) {
            list.insert(i+1,i);
        }
        System.out.println(list.contains(2));
        System.out.println(list.contains(2));
        System.out.println(list.contains(2));
        System.out.println(list.contains(2));
        System.out.println(list.contains(2));
        System.out.println(list.contains(2));
        System.out.println(list.getComparisons());
        MyLinkedList<String> list2 = BookReader.words;
    }
}
