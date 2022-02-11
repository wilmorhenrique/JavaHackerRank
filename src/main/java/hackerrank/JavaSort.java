package hackerrank;

import java.util.*;

class Student__ implements  Comparable{
    private int id;
    private String fname;
    private double cgpa;
    public Student__(int id, String fname, double cgpa) {
        super();
        this.id = id;
        this.fname = fname;
        this.cgpa = cgpa;
    }
    public int getId() {
        return id;
    }
    public String getFname() {
        return fname;
    }
    public double getCgpa() {
        return cgpa;
    }

    @Override
    public int compareTo(Object ob) {
        Student__ o = (Student__)ob;
        if (this.cgpa == o.getCgpa() ) {
            if (this.fname.equals(o.getFname())) {
                return this.id-o.id;
            }
            return this.getFname().compareTo(o.getFname());
        }
        return Double.compare(o.cgpa,this.getCgpa());
    }
}
public class JavaSort {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int testCases = Integer.parseInt(in.nextLine());


        List<Student__> studentList = new ArrayList<Student__>();
        while(testCases>0){
            int id = in.nextInt();
            String fname = in.next();
            double cgpa = in.nextDouble();

            Student__ st = new Student__(id, fname, cgpa);
            studentList.add(st);

            testCases--;
        }


//        Opcao 1
//        Comparator<Student> compare = Comparator.comparing(Student::getCgpa, Comparator.reverseOrder()).thenComparing(Student::getFname).thenComparing(Student::getId);
//        Collections.sort(studentList, compare);


        // Opcao 2 ( fazendo Student implementar Comparable
        Collections.sort(studentList);

        for(Student__ st: studentList){
            System.out.println(st.getFname());
        }
    }
}



