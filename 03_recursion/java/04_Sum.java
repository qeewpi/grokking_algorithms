import java.util.*;

class Main {
    public static void main(String[] args) {
        int total = sum(new ArrayList<>(Arrays.asList(2, 4, 6)), 0);
        
        System.out.println(total);
    }

    public static int sum(ArrayList<Integer> list, int index) {
        if (list.size() == index) {
            return 0;
        } else {
            return list.get(index) + sum(list, index + 1);
        }
    }
}