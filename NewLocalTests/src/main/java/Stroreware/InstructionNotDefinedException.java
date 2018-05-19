package Stroreware;

public class InstructionNotDefinedException extends Exception {
    public InstructionNotDefinedException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "instruction " + super.getMessage() + " not defined";
    }
}
