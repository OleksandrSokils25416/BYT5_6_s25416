package MediatorPattern;

public class ConcreteStudent implements Student {
    private Mediator mediator;
    private String name;

    public ConcreteStudent(Mediator mediator, String name) {
        this.mediator = mediator;
        this.name = name;
        mediator.addStudent(this);
    }

    @Override
    public void sendMessage(String message) {
        System.out.println(name + " sends message: " + message);
        mediator.sendMessage(message, this);
    }

    @Override
    public void receiveMessage(String message) {
        System.out.println(name + " receives message: " + message);
    }
}
