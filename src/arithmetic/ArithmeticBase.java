/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arithmetic;

/** This class performs arithmetic operations using an enum.
 * The enum encapsulates the logic for each operation.
 * @author sivagamasrinivasan
 */
public class ArithmeticBase {

    // Method that  uses the Operation enum to calculate
    double calculate(double x, double y, Operation operation) {
        return operation.apply(x, y);  // The operation's logic is in the enum
    }
}

// Enum for arithmetic operations
enum Operation {
    PLUS {
        @Override
        public double apply(double x, double y) {
            return x + y;
        }
    },
    MINUS {
        @Override
        public double apply(double x, double y) {
            return x - y;
        }
    },
    TIMES {
        @Override
        public double apply(double x, double y) {
            return x * y;
        }
    },
    DIVIDE {
        @Override
        public double apply(double x, double y) {
            if (y == 0) {
                throw new ArithmeticException("Cannot divide by zero.");
            }
            return x / y;
        }
    };

    // Abstract method that each enum constant must implement
    public abstract double apply(double x, double y);
}

