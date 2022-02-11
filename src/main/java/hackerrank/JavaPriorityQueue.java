package hackerrank;

import java.util.*;
import java.util.stream.Collectors;


class Priorities {
    public List<Student> getStudents(List<String> events) {
        List<Student> students = new ArrayList<>();
        Comparator<Student> compare = Comparator.comparing(Student::getCgpa, Comparator.reverseOrder()).thenComparing(Student::getName).thenComparing(Student::getId);
        PriorityQueue<Student> queue = new PriorityQueue<>(compare);

        for (int i = 0; i < events.size(); i++) {
            if ("SERVED".equals(events.get(i))) {
                queue.poll();
            } else {
                String[] line = events.get(i).split(" ");
                Student s = new Student( line[1],
                        Double.valueOf(line[2]).doubleValue(),
                        Integer.valueOf(line[3]).intValue());
                queue.add(s);
            }
        }
        students = queue.stream().collect(Collectors.toList());
        Collections.sort(students, compare);

        return students;
    }
}

class Student {
    int id;
    String name;
    double cgpa;

    public int getId() {
        return id;
    }

    public double getCgpa() {
        return cgpa;
    }

    public Student(String name, double cgpa, int id) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }
    public String getName() {
        return name;
    }

}


public class JavaPriorityQueue {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities priorities = new Priorities();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st: students) {
                System.out.println(st.getName());
            }
        }
    }

}