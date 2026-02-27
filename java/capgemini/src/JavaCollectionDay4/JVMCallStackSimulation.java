package JavaCollectionDay4;
import java.util.Stack;

public class JVMCallStackSimulation {

    private static Stack<String> callStack = new Stack<>();

    public static void main(String[] args) {
        enterMethod("main");
        login();
        exitMethod();
    }

    private static void login() {
        enterMethod("login");
        validate();
        exitMethod();
    }

    private static void validate() {
        enterMethod("validate");
        exitMethod();
    }

    private static void enterMethod(String methodName) {
        callStack.push(methodName);
        printStack("CALL " + methodName);
    }

    private static void exitMethod() {
        String methodName = callStack.pop();
        printStack("RETURN " + methodName);
    }

    private static void printStack(String action) {
        System.out.println(action);
        System.out.println("Current Call Stack: " + callStack);
        System.out.println("--------------------------------");
    }
}
