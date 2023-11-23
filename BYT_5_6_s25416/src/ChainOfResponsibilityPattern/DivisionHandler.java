package ChainOfResponsibilityPattern;

public class DivisionHandler implements OperationHandler {
    private OperationHandler nextHandler;

    @Override
    public void setNextHandler(OperationHandler nextHandler) {
        this.nextHandler = nextHandler;
    }

    @Override
    public void performOperation(Operation operation) {
        if (operation.getOperator().equals("/")) {
            if (operation.getNumber2() != 0) {
                int result = operation.getNumber1() / operation.getNumber2();
                System.out.println("Division Result: " + result);
            } else {
                System.out.println("Cannot divide by zero.");
            }
        } else if (nextHandler != null) {
            nextHandler.performOperation(operation);
        }
    }
}
