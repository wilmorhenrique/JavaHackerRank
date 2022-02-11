package hackerrank;

public class Split_ {

    static boolean splitIt(String a) {
        a = a.trim();
        String[] array = a.split("[ !,?._'@]+");

        System.out.println(array.length);

        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);

        }
        return true;
    }

    public static void main(String[] args) {
        boolean ret = splitIt("He is a very very good boy, isn't he?");
    }
}