/* 1 Объявить два списка список ArrayList, в каждый добавить по 20 случайных чисел.
 Удалить из первого списка элементы отсутствующие во втором списке. 
 Отсортировать первый список методом sort класса Collections.
2 * Отсортировать второй список методом sort списка и компаратором по уменьшению.
3 **Отсортировать первый список пузырьковой сортировкой самостоятельно, без использования доп методов и классов. */
package HW;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Random;

public class HW_03 {
    public static void main(String[] args) {
        Random rnd = new Random();

        ArrayList<Integer> list1 = new ArrayList<Integer>();
        ArrayList<Integer> list2 = new ArrayList<Integer>();

        for (int i = 0; i < 20; i++) {
            list1.add(rnd.nextInt(0, 50));            
        }
        for (int i = 0; i < 20; i++) {
            list2.add(rnd.nextInt(0, 50));            
        }
        System.out.println(list1);
        System.out.println(list2);

        list1.retainAll(list2);
        System.out.println(list1);

        Collections.sort(list1);
        System.out.println(list1);

        Collections.sort(list1, Collections.reverseOrder());
        System.out.println(list1);
        System.out.println();
        
        list2.sort(new Comparator<Integer>() {   // переворачивает list2  в обратном порядке при помощи метода sort и Comporator
            @Override
            public int compare(Integer t1, Integer t2) {
                
                return t2-t1;
            } 
        });
        System.out.println(list2);
    }

}
