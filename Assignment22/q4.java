// Define class MyDate with members day, month and year. Define default and
// parameterized constructors. Accept values from the command line and create a
// date object. Throw user defined exceptions – “InvalidDayException” or
// “InvalidMonthException” if the day or month are invalid. If the date is valid,
// display message “Valid Date”.
class InvalidDayException extends Exception {
    public InvalidDayException() {
        super("InvalidDayException: Invalid day.");
    }
}

class InvalidMonthException extends Exception {
    public InvalidMonthException() {
        super("InvalidMonthException: Invalid month.");
    }
}

class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate() {
        System.out.println("You are calling default Constructor");
    }

    public MyDate(int day, int month, int year) throws InvalidDayException, InvalidMonthException {
        setDay(day);
        setMonth(month);
        this.year = year;
    }

    public void setDay(int day) throws InvalidDayException {
        if (day < 1 || day > 31) {
            throw new InvalidDayException();
        }
        this.day = day;
    }

    public void setMonth(int month) throws InvalidMonthException {
        if (month < 1 || month > 12) {
            throw new InvalidMonthException();
        }
        this.month = month;
    }

    public void displayMessage() {
        System.out.println("Valid Date");
    }
}

public class q4 {
    public static void main(String[] args) {
        try {
            int day = Integer.parseInt(args[0]);
            int month = Integer.parseInt(args[1]);
            int year = Integer.parseInt(args[2]);

            MyDate date = new MyDate(day, month, year);
            date.displayMessage();
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException: Invalid input. Please enter valid integers.");
        } catch (InvalidDayException e) {
            System.out.println(e.getMessage());
        } catch (InvalidMonthException e) {
            System.out.println(e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("ArrayIndexOutOfBoundsException: Insufficient number of arguments.");
        }
    }
}

