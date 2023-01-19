/* Первый семинар.
1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2

Пункты реализовать в методе main */

package HW;

import java.util.Arrays;
import java.util.Random;

public class HW_01 {
    public static void main(String[] args) {

        
        int i = new Random().nextInt(0, 2000);
        System.out.println(i);

        int n = Integer.toBinaryString(i).length();
        System.out.println(n);

        int count = 0;
        for (int j = i; j < Short.MAX_VALUE; j++) {
            if (j%n == 0) {
                count++ ;
            }
            
        }

        int [] m1 = new int[count];
        

        count = 0;
        for (int j = i; j < Short.MAX_VALUE; j++) {
            if (j%n == 0) {
                m1[count++] = j; 
            }    
        }
        System.out.println(Arrays.toString(m1));

        int c = 0;
        for (int j = Short.MIN_VALUE; j < i; j++) {
            if (j%n != 0) {
                c++ ;
            }
            
        }

        int [] m2 = new int[c];

        c = 0;
        for (int j = Short.MIN_VALUE; j < i; j++) {
            if (j%n != 0) {
                m2[c++] = j; 
            }    
        }
        System.out.println(Arrays.toString(m2));
    }

}