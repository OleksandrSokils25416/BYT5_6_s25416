package MediatorPattern;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator {
    private List<Student> students;

    public ConcreteMediator() {
        this.students = new ArrayList<>();
    }
    @Override
    public void addStudent(Student student) {
        students.add(student);
    }

    @Override
    public void sendMessage(String message, Student student) {
        for (Student c : students) {
            if (c != student) {
                c.receiveMessage(message);
            }
        }
    }
}
