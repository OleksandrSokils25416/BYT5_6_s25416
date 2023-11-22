package BuilderPattern;

public class ComputerDirector {
    public void buildComputer(ComputerBuilder builder) {
        builder.buildCpu();
        builder.buildMemory();
        builder.buildStorage();
    }
}