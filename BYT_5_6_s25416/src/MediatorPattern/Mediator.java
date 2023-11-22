package MediatorPattern;

public interface Mediator {
    void sendMessage(String message, Student student);

    void addStudent(Student student);
}
