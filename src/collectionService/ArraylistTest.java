package collectionService;

import java.util.ArrayList;
import java.util.List;

public class ArraylistTest {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        System.out.println("Elements in the ArrayList:");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        for(Integer sasank:list){
            System.out.println(sasank);
        }

    }
}
