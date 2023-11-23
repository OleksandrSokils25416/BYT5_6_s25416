package ChainOfResponsibilityPattern;

public class Main {
    public static void main(String[] args) {

        AdditionHandler additionHandler = new AdditionHandler();
        SubtractionHandler subtractionHandler = new SubtractionHandler();
        MultiplicationHandler multiplicationHandler = new MultiplicationHandler();
        DivisionHandler divisionHandler = new DivisionHandler();

        additionHandler.setNextHandler(subtractionHandler);
        subtractionHandler.setNextHandler(multiplicationHandler);
        multiplicationHandler.setNextHandler(divisionHandler);

        
        Operation addOperation = new Operation(5, 3, "+");
        Operation subtractOperation = new Operation(10, 4, "-");
        Operation multiplyOperation = new Operation(6, 8, "*");
        Operation divideOperation = new Operation(15, 3, "/");

        additionHandler.performOperation(addOperation);
        additionHandler.performOperation(subtractOperation);
        additionHandler.performOperation(multiplyOperation);
        additionHandler.performOperation(divideOperation);
    }
}
