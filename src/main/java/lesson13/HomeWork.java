package lesson13;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gdv on 11.11.2016.
 */
public class HomeWork {


    @Test
    public void testList() {
        List<String> arrayListList = new ArrayList<>();// обьявли колекцию ерейл лист первый знает о последнем елементе
        arrayListList.add("1");
        arrayListList.add("2");
        arrayListList.add("3");
        arrayListList.add("4");
        arrayListList.add("5");
        arrayListList.add("6");
        arrayListList.add("7");
        arrayListList.add("8");
        arrayListList.add("9");
        arrayListList.add("10");

        for (String text:arrayListList){
            System.out.println(text);
        }

    }
}