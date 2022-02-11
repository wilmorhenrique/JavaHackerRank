package algoritimos;

import java.util.*;

public class OrdenandoComJavaApi {
    public static void main(String[] args) {
        List<String> results = new ArrayList<>();
        results.add("FirstYear");
        results.add("SecondYear");
        results.add("FifthYear");
        results.add("ThirdYear" );
        Collections.sort(results);

        System.out.println("Ordenado= " + results);


    }



}
