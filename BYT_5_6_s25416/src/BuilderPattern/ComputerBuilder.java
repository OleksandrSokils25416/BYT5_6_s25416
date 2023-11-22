package BuilderPattern;

public interface ComputerBuilder {
    void buildCpu();
    void buildMemory();
    void buildStorage();
    Computer getComputer();
}
