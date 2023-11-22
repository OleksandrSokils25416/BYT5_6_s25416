package MediatorPattern;

public class Main {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();

        ConcreteStudent student1 = new ConcreteStudent(mediator, "MediatorPattern.Student 1");
        ConcreteStudent student2 = new ConcreteStudent(mediator, "MediatorPattern.Student 2");
        ConcreteStudent student3 = new ConcreteStudent(mediator, "MediatorPattern.Student 3");

        student1.sendMessage("Hello, students!");
        student2.sendMessage("Hi there!");

    }
}