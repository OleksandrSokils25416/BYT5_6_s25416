package ChainOfResponsibilityPattern;

public interface OperationHandler {
    void setNextHandler(OperationHandler nextHandler);
    void performOperation(Operation operation);
}
