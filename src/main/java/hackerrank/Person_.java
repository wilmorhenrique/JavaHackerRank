package hackerrank;

import java.io.*;
import java.util.*;

public class Person_ {
    private int age;

    public Person_(int initialAge) {
        if (initialAge < 0) {
            System.out.println("Age is not valid, setting age to 0.");
            initialAge = 0;
        }
        age = initialAge;
    }

    public void amIOld() {
        // Write code determining if this person's age is old and print the correct statement:
        String comment = "You are old.";
        if (age < 13) {
            comment = "You are young.";
        } else if (age >= 13 && age < 18) {
            comment = "You are a teenager.";
        }
        System.out.println(comment);
    }

    public void yearPasses() {
        age++;
    }

    public static void main(String[] args) {
        System.out.println("teste");
    }

}