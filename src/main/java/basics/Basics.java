package basics;

class Shape {
    public int sides;

    public Shape(int i) {
        sides = i;
    }

    @Override
    public boolean equals(Object obj) {
        System.out.println(this.sides == ((Shape)obj).sides);
        return this.sides == ((Shape)obj).sides;
    }

    @Override
    public int hashCode() {
        System.out.println("ola");
        return this.sides;
    }
}

public class Basics {
    public static void main(String[] args) {
        Shape a = new Shape(2);
        Shape b = new Shape(2);
        System.out.println(a==b);
        System.out.println(a.equals(b));

    }

}