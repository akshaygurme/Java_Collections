package collection_examples;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;


public class ArrayListExample {

    private static final Logger log = Logger.getLogger(ArrayListExample.class.getName());
    public static void main(String[] args) {



        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(2);
        log.info("Array List : " + arrayList);
        log.info(arrayList.get(1).toString());


        for (int i = 0; i < 2; i++) {
            log.info("For Loop : " + arrayList.get(i));
        }

        for (Object number : arrayList) {
            log.info("For Each Loop : " + number);
        }
    }
}
