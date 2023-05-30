import java.util.*;
public class basic{
    // pq for objects 
    static class Student implements Comparable<Student> {
        int rank;
        String name;
        public Student(int rank, String name){
            this.rank = rank;
            this.name = name;
        }
        // it gives the classes to compare the classes of the students
       @Override
       public int compareTo(Student s2){
        return this.rank-s2.rank;
       }
    }
    public static void main(String[] args) {
        // for reversing the order
        // PriorityQueue <Integer> pq=new PriorityQueue<Integer>(Comparator.reverseOrder());
        // PriorityQueue <Integer> pq = new PriorityQueue<Integer>();



        PriorityQueue <Student> pq = new PriorityQueue<>();
        pq.add(new Student(12,"sohan"));
        pq.add(new Student(2,"mohan"));
        pq.add(new Student(4,"rohan"));
        pq.add(new Student(1,"aman"));

        while(!pq.isEmpty()) {
            System.out.println(pq.peek().name+"->"+pq.peek().rank);
            pq.remove();
        }
        // System.out.println();
    }
}