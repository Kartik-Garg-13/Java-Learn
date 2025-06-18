import java.util.ArrayList;
import java.util.List;
class Work {
    String taskName;
    int duration;
    public Work(String taskName, int duration) {
        this.taskName = taskName;
        this.duration = duration;
    }
    public void displayWork() {
        System.out.println("Task: " + taskName + ", Duration: " + duration + " hours");
    }
}
public class Employee {
    String name;
    int id;
    List<Work> workList;
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
        this.workList = new ArrayList<>();
    }
    public void assignWork(Work work) {
        workList.add(work);
    }
    public void showWorks() {
        System.out.println("Work assigned to " + name + ":");
        for (Work w : workList) {
            w.displayWork();
        }
    }
    public static void main(String[] args) {
        Work w1 = new Work("Write Report", 2);
        Work w2 = new Work("Attend Meeting", 1);
        Employee emp1 = new Employee("Kartik", 101);
        emp1.assignWork(w1);
        emp1.assignWork(w2);
        emp1.showWorks();
    }
}
