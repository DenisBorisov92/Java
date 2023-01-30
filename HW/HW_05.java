package HW;

import java.util.Collection;
import java.util.HashMap;
import java.util.Set;

public class HW_05 {
    public static void main(String[] args) {
        
        HashMap <Integer, String> spisok = new HashMap<>();

        spisok.putIfAbsent(1, "Борисов Демид Семенович 22 м");
        spisok.put(2, "Семенов Игорь Игоревич 25 м" );
        spisok.put(3, "Боровикова Татьяна Николаевна 18 ж");
        spisok.put(4, "Петрова Инна Никифоровна 37 ж");
        spisok.put(5, "Семенов Сергей Анатольевич 45 ж");
        spisok.put(5, "Михайлов Сергей Викторович 18 м");
        spisok.forEach((k, v) -> System.out.println(k+" "+v));
        System.out.println();

        Collection<String> sValues = spisok.values();
        Set<Integer> keySet = spisok.keySet();
        for (int i = 0; i < keySet.size(); i++) {
            String[] tmp = ((String) sValues .toArray()[i]).split(" ");
            System.out.println(tmp[0]+ " " + tmp[1].charAt(0)+ "." + tmp[2].charAt(0));
            spisok.compute((Integer)keySet.toArray()[i], (k, v) -> v = v.replace(" ж"," Ж"));
            spisok.compute((Integer)keySet.toArray()[i], (k, v) -> v = v.replace(" м"," М"));
        }   
        System.out.println();
        spisok.forEach((k, v) -> System.out.println(k+" "+v));
    }
}