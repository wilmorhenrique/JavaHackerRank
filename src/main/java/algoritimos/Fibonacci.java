package algoritimos;

public class Fibonacci {

    static int  passadas = 0;
    static String  log = "";
    public static void main(String[] args) {
        int n = 7;
            System.out.println(n + "th fibonacci number is:" + fib(n, "root"));
        System.out.println("calculado em " + passadas + " passadas");
        System.out.println(log);
    }
    static int fib(int n, String origem) {
        passadas++;
        log += " | "+ n + "-"+ origem;
        if (n<= 0 ) return 0;
        if (n==1) return 1;
        return fib(n-1,"um") + fib (n-2, "dois");
    }
}
