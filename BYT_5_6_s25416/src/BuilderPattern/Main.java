package BuilderPattern;

public class Main {
    public static void main(String[] args) {
        ComputerDirector director = new ComputerDirector();

        ComputerBuilder gamingBuilder = new GamingComputerBuilder();
        director.buildComputer(gamingBuilder);
        Computer gamingComputer = gamingBuilder.getComputer();

        System.out.println("Gaming Computer: " + gamingComputer);
    }
}
