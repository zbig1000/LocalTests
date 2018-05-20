package Storeware;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class OperationFactory {
    public Operation createOperation(String intruction, double value, Operation existingOperation) {
        char firstLetter = intruction.toUpperCase().charAt(0);
        intruction = firstLetter + intruction.substring(1);
        String name = "Storeware." + intruction;
        Operation nextOperation = null;

        if (intruction.equals("Apply")) return new Apply(value);

        else {
            try {
                Class<?> newClass = Class.forName(name);
                Constructor<?> constructor = newClass.getConstructor(Operation.class, Double.TYPE);
                Object[] arguments = new Object[2];
                arguments[0] = existingOperation;
                arguments[1] = new Double(value);
                nextOperation = (Operation) createObject(constructor, arguments);

            } catch (ClassNotFoundException ex) {
                System.out.println("bad instruction " + ex.getMessage());
            } catch (NoSuchMethodException ex) {
                System.out.println("class cannot instantiate " + ex.getMessage());
            }
        }
        return nextOperation;
    }

    public static Object createObject(Constructor constructor, Object[] arguments) {
        Object object = null;

        try {
            object = constructor.newInstance(arguments);
            return object;

        } catch (InstantiationException e) {
            System.out.println(e.getMessage());
        } catch (IllegalAccessException e) {
            System.out.println(e.getMessage());

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());

        } catch (InvocationTargetException e) {
            System.out.println(e.getMessage());

        }
        return object;
    }
}


