package HW;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedList;

public class HW_04 {
    public static void main(String[] args) {
        
        ArrayList<String> family = new ArrayList<>();
        ArrayList<String> name = new ArrayList<>();
        ArrayList<String> soname = new ArrayList<>();
        ArrayList<Integer> age = new ArrayList<>();
        ArrayList<Boolean> gender = new ArrayList<>();
        LinkedList<Integer> index = new LinkedList<>();


        String str = "";
        try {
            FileWriter fw = new FileWriter("mybd.sql", true);
            fw.append("Кутузова Инна Петровна 35 Ж \r\n");
            fw.append("Степанова Алла Анатольевна 19 Ж \r\n");
            fw.append("Иванов Сергей Викторович 28 М \r\n");
            fw.flush();

            FileReader fr = new FileReader("mybd.sql");
            while (fr.ready()) {
                str += (char) fr.read();

            }


        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        String[] string = str.split(" \r\n");
        for (int i = 0; i < string.length; i++) {
            String[] ts = string[i].split(" ");
            // System.out.println(ts[0] + " " + ts[1].charAt(0) + "." + ts[2].charAt(0) + "." + " " + ts[3] + " " + ts[4]);

            family.add(ts[0]);
            name.add(ts[1]);
            soname.add(ts[2]);
            age.add(Integer.valueOf(ts[3]));
            gender.add(ts[4].equals("М") ? true : false);
            index.add(i);

        }
        System.out.println();
        System.out.println(family);
        System.out.println(name);
        System.out.println(soname);
        System.out.println(age);
        System.out.println(gender);
        System.out.println(index);

        for (int j = 0; j < index.size(); j++) {
            System.out.printf(family.get(index.get(j)));
            System.out.printf(name.get(index.get(j)));
            System.out.printf(soname.get(index.get(j)));
            System.out.printf(age.get(index.get(j)).toString());
            System.out.printf(gender.get(index.get(j)) ? " М" : " Ж");
            System.out.println();

        }


    }
    
}
