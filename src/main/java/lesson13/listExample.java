package lesson13;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by gdv on 11.11.2016.
 */
public class listExample {
    @Test
    public void testList(){
        List<String> arrayListList = new ArrayList<>();// обьявли колекцию ерейл лист первый знает о последнем елементе
        arrayListList.add("Jack");
        arrayListList.add("Jack");
        arrayListList.add("Jack2");
        arrayListList.add("Jack2");
        arrayListList.add("Jack2");

        List<String> collect = arrayListList.stream().filter(s -> s.contains("2")).collect(Collectors.toList());

        List<String> linkedList = new LinkedList<>(); // обьявили колекцию линкед лист
        List<String> list = new ArrayList<String>();
        list.add("jack");
        list.add("d.gorbachenko@gmail.com");
        list.add("Test");

        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String text = iterator.next();
            System.out.println(text);
        }

        for (String text:list){
            System.out.println(text);
        }

    }

}
