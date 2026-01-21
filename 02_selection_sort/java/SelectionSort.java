import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Main {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(5, 3, 6, 2, 10));
        
        System.out.println(selectionSort(arr)); //[2, 3, 5, 6, 10]

    }   
    
    public static Integer findSmallest(List<Integer> list) {
        int smallest = list.get(0);
        int smallestIndex = 0;
        int size = list.size();
        
        for (int i = 0; i < size; i++) {
            if (smallest > list.get(i)) {
                smallest = list.get(i);
                smallestIndex = i;
            }
        }
        
        return smallestIndex;
    }
    
    public static List<Integer> selectionSort(List<Integer> list) {
        List<Integer> sortedList = new ArrayList<>();
        int size = list.size();
        
        for (int i = 0; i < size; i++) {
            int smallestIndex = findSmallest(list);
            
            int smallest = list.get(smallestIndex);
            
            sortedList.add(smallest);
            
            list.remove(smallestIndex);
        }
        
        return sortedList;
    }
}