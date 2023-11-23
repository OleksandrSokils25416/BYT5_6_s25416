package ChainOfResponsibilityPattern;

public class MultiplicationHandler implements OperationHandler {
    private OperationHandler nextHandler;

    @Override
    public void setNextHandler(OperationHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void performOperation(Operation operation) {
        if (operation.getOperator().equals("*")) {
            int result = operation.getNumber1() * operation.getNumber2();
            System.out.println("Multiplication Result: " + result);
        } else if (nextHandler != null) {
            nextHandler.performOperation(operation);
        }
    }
}