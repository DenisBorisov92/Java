/*Разработать программу, имитирующую поведение коллекции 
HashSet. В программе содать метод add добавляющий элемент,
 и метод позволяющий выводить эллементы коллекции в консоль.
 Формат данных Integer. */
package HW;

import java.util.HashMap;
import java.util.Random;

public class HW_06 {
    private static HashMap<Integer, Object> hMap = new HashMap<>();
    private static final Object OBJECT = new Object();
    public static void main(String[] args)  {
        add(12);
        add(27);
        add(5);
        add(5);
        add(49);
        add(9);
        add(11);   
        System.out.println(getStr());   
    }

   
    public static String getStr() {
        return hMap.keySet().toString();
    }
    public static void add(Integer numbers) {
        hMap.put(numbers, OBJECT);

    }
}
