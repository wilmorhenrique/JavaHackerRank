package hackerrank;

import java.util.HashMap;
import java.util.Map;

public class Map_ {

    public static void main(String[] args) {
        String name ="Joao";
        Integer phone = 654654;
        Map<String, Integer> phones = new HashMap();
        phones.put(name, phone);

        name ="Maria";
        phone = 12345;
        phones.put(name, phone);

        String s = "Maria";
        Integer number = phones.get(s);
        System.out.println(s + number);

        number = phones.get("Pedro");
        if (number == null) {
            System.out.println("Not found");
        } else {
            System.out.println(s+"="+number);
        }

    }


}
