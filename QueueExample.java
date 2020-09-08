import java.util.LinkedList;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args){
        //Normal linked list maintains insertion order
        Queue<Student> linkedList = new LinkedList<>();
        linkedList.add(new Student("kalyan", 10, "Comp"));
        linkedList.add(new Student("subhankar", 20, "Comp"));
        linkedList.add(new Student("soumen", 1, "Comp"));
        //print linkedList
        //linkedList.forEach(System.out::println);

        //Priority Queue maintain natural order, or comparable order
        Queue<Student> priorityQueue = new PriorityQueue<Student>();
        priorityQueue.add(new Student("kalyan", 10, "Comp"));
        priorityQueue.add(new Student("subhankar", 20, "Comp"));
        priorityQueue.add(new Student("soumen", 1, "Comp"));
        priorityQueue.add(new Student("suman", 15, "Comp"));
        priorityQueue.add(new Student("ashmita", 21, "Comp"));
        priorityQueue.add(new Student("mondal", 5, "Comp"));
        //print priorityQueue
        //priorityQueue.forEach(System.out::println); // This doesn't show the order. Remember this is queue
        while (!priorityQueue.isEmpty()) {
            System.out.println(priorityQueue.remove());
        }
    }
}

class Student implements Comparable<Student> {
    private String name;
    private int rollno;
    private String dept;

    public Student(String name, int rollno, String dept) {
        this.name = name;
        this.rollno = rollno;
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    @Override
    public String toString() {
        return this.name + ", " + this.rollno + ", " + this.dept;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Integer.compare(student.rollno, rollno) == 0 &&
                Objects.equals(name, student.name);
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, rollno);
    }

    @Override
    public int compareTo(Student o) { // ascending order
        if(this.rollno < o.rollno){
            return -1;
        }
        else if(this.rollno > o.rollno){
            return 1;
        } else {
            return 0;
        }
    }
}