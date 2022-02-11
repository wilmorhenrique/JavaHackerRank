package testes;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class JavaHashMapTest {
    public static void main(String[] args) {
        HashMap<String, String> results = new HashMap<>();
        results.put("CLARK", "Pass");
        results.put("SMITH", "Pass");
        results.put("FORD", "Pass");
        results.put("KING", "Fail");
        results.put("BLAKE", "Pass");
        results.put("WARD", "Pass");
        results.put("JONES", "Pass");

        for (String result : results.keySet()) {

            System.out.println(result + " => " + results.get(result));
        }
    }

}
