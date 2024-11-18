import java.util.PriorityQueue;

public class CustomPriorityQueue {

    static class Student implements Comparable<Student> {
        String name;
        int age;

        Student(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public int compareTo(Student s1) {
            return this.age - s1.age;
        }
    }

    public static void main(String[] args) {

        PriorityQueue<Student> pq = new PriorityQueue<>();

        pq.add(new Student("A", 24));
        pq.add(new Student("B", 22));
        pq.add(new Student("C", 21));
        pq.add(new Student("D", 23));

        System.out.println(pq.remove().name);
    }

}
