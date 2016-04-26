

/**
 * A view generates an output presentation to the user based on changes in the model.
 *
 * @author Pidhurska Tetiana
 * @version 2 (updated on 26.04.16)
 */
public class View {

    // Text's constants
    public static final String INPUT_INT_DATA = "Input INT value = ";
    public static final String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please! ";
    public static final String WRONG_INPUT_INT_IN_RANGE = "Wrong input! Your integer is behind the required range! Repeat please! ";
    public static final String INPUT_RANGE_VALUES = "The current input range is between ";
    public static final String OUR_INT = "Congratulations! You guessed the correct INT value = ";
    public static final String GREATER_THAN_MACHINE_VALUE = "The entered value is greater than the machine one's";
    public static final String LESS_THAN_MACHINE_VALUE = "The entered value is less than the machine one's";
    public static final String RANDOM_INT_DATA = "The random machine val is ";

    //print methods with messages and values
    public void printMessage(String message) {
        System.out.println(message);
    }

    public void printMessageAndInt(String message, int value) {
        System.out.println(message + value);
    }

    public void printMessageAndInt(String message, int value1, int value2) {
        System.out.println(message + value1 + " and " + value2);
    }


}
