// Write a program which accepts two integers and an arithmetic operator from the
// command line and performs the operation. Check the following user defined
// exceptions:
// i. If the number of arguments are less than 3 then throw
// “FewArgumentsException”.
// ii. If the operator is not an Arithmetic operator, throw
// “InvalidOperatorException”.
// iii. If result is –ve, then throw “NegativeResult” exception

class FewArgumentsException extends Exception {
    public FewArgumentsException() {
        super("FewArgumentsException: Insufficient number of arguments.");
    }
}

class InvalidOperatorException extends Exception {
    public InvalidOperatorException() {
        super("InvalidOperatorException: Invalid arithmetic operator.");
    }
}

class NegativeResultException extends Exception {
    public NegativeResultException() {
        super("NegativeResultException: Result is negative.");
    }
}

class q2 {

    public static int performOperation(int operand1, int operand2, char operator) throws InvalidOperatorException, NegativeResultException {
        int result;
        
        switch (operator) {
            case '+':
                result = operand1 + operand2;
                break;
            case '-':
                result = operand1 - operand2;
                break;
            case '*':
                result = operand1 * operand2;
                break;
            case '/':
                result = operand1 / operand2;
                break;
            default:
                throw new InvalidOperatorException();
        }
        
        if (result < 0) {
            throw new NegativeResultException();
        }
        
        return result;
    }
    public static void main(String[] args) {
        try {
            if (args.length < 3) {
                throw new FewArgumentsException();
            }
            
            int operand1 = Integer.parseInt(args[0]);
            int operand2 = Integer.parseInt(args[2]);
            char operator = args[1].charAt(0);
            
            int result = performOperation(operand1, operand2, operator);
            
            System.out.println("Result: " + result);
        } catch (FewArgumentsException e) {
            System.out.println(e.getMessage());
        } catch (InvalidOperatorException e) {
            System.out.println(e.getMessage());
        } catch (NegativeResultException e) {
            System.out.println(e.getMessage());
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Invalid operand. Please enter valid integers.");
        }
    }
    
    
}

