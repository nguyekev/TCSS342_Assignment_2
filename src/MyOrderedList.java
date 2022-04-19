import java.util.ArrayList;

public class MyOrderedList<Type extends Comparable <Type>> {
    private MyArrayList<Type> list = new MyArrayList<>();
    public long comparisons = 0;
    public MyOrderedList(){
    }
    public void add(Type item) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).compareTo(item) > 0) {
                comparisons++;
                list.insert(item, i);
                return;
            }
        }
        list.insert(item, list.size());
        comparisons++;
    }
    public Type remove(Type item) {
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i).compareTo(item) == 0) {
                list.remove(i);
                return item;
            }
        }
        return null;
    }
    public boolean binarySearch(Type item) {
        return binarySearch(item, 0, list.size() - 1);
    }
    private boolean binarySearch(Type item, int start, int end) {
        start = 0;
        end = list.size() - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if(list.get(mid).compareTo(item) == 0) {
                comparisons++;
                return true;
            }
            else if(list.get(mid).compareTo(item) < 0) {
                start = mid + 1;
                comparisons++;
            } else {
                end = mid - 1;
                comparisons++;
            }
            return binarySearch(item, 0, list.size() - 1);
        }
        return false;
    }

    public int size() {
        return list.size();
    }
    public boolean isEmpty() {
        return list.isEmpty();
    }
    public String toString() {
        return list.toString();
    }
}
