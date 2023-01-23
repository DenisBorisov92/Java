/* 1. Напишите программу, чтобы найти вхождение в строке (содержащей все символы другой строки).
2. Напишите программу, чтобы проверить, являются ли две данные строки вращением друг друга (вхождение в обратном порядке).
3. Дано два числа, например 3 и 56, необходимо составить следующие строки: 3 + 56 = 59 3 – 56 = -53 3 * 56 = 168 
Используем метод StringBuilder.append().
4. Замените символ “=” на слово “равно”. Используйте методы StringBuilder.insert(),StringBuilder.deleteCharAt().
5. *Замените символ “=” на слово “равно”. Используйте методы StringBuilder.replace().
6. **Сравнить время выполнения пунка 6 со строкой содержащей 10000 символов "=" средствами String и StringBuilder. */
package HW;

public class HW_02 {
    static String str1 = "asdasdas";
    static String str2 = "asd";
    public static void main(String[] args) {
        
        contains(str1, str2);
        contains(str1, new StringBuilder(str2).reverse().toString()); // Проверяем вхождение, а вторую строку переворачиваем

        int a1 = 3;
        int a2 = 56;
        int a = a1 + a2;
        int b = a1 - a2;
        int c = a1 * a2;
        
        // String s1 = String.valueOf(a1) + "+" + String.valueOf(a2) + "=" +  String.valueOf(a);
        // System.out.println(s1);
        // String s2 = String.valueOf(a1) + "-" + String.valueOf(a2) + "=" + String.valueOf(b);
        // System.out.println(s2);
        // String s3 = String.valueOf(a1) + "*" + String.valueOf(a2) + "=" + String.valueOf(c);
        // System.out.println(s3);

        StringBuilder sb1 = new StringBuilder();
        StringBuilder sb2 = new StringBuilder();
        StringBuilder sb3 = new StringBuilder();
        StringBuilder sb = new StringBuilder();

        
        sb1.append(String.valueOf(a1)).append(" + ").append(String.valueOf(a2)).append(" = ").append(String.valueOf(a));
        sb2.append(String.valueOf(a1)).append(" - ").append(String.valueOf(a2)).append(" = ").append(String.valueOf(c));
        sb3.append(String.valueOf(a1)).append(" * ").append(String.valueOf(a2)).append(" = ").append(String.valueOf(b));

        // sb.append(s1).append(" ").append(" ").append(s2).append(" ").append(s3).toString();

        System.out.println(sb1); 
        System.out.println(sb2);
        System.out.println(sb3);  
        System.out.println(sb); 

        // sb1.deleteCharAt(7).insert(7, "равно");
        // sb2.deleteCharAt(7).insert(7, "равно");
        // sb3.deleteCharAt(7).insert(7, "равно");

        sb1.replace(7, 8, "равно");
        sb2.replace(7, 8, "равно");
        sb3.replace(7, 8, "равно");

        System.out.println(sb1);
        System.out.println(sb2);
        System.out.println(sb3);

        double begin = System.currentTimeMillis();
        String str = "=";
        str.replace("=", "равно");
        for (int i = 0; i < 10000; i++) {
             str += Character.getName(i);
        }
        
        System.out.println(System.currentTimeMillis()-begin);
 
         begin = System.currentTimeMillis();
         StringBuilder app = new StringBuilder("=").replace(0, 1, "равно");
         for (int i = 0; i < 10000; i++) {
              app.append(Character.getName(i));
         }
        
        System.out.println(System.currentTimeMillis()-begin);
    }
    

    public static void contains(String str1, String str2){  // метод который проверят входит одна строка в другую или нет.
        System.out.println(str1.contains(str2));
    }

}
    

