import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        Iterator<Integer> iterator = intList.iterator();
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next % 2 != 0 || next < 0) {
                iterator.remove();
            }

        }
        Collections.sort(intList);
        System.out.println(intList);
    }
}