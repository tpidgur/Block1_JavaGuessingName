package updatedVariant;

/**
 * A view generates an output presentation to the user based on changes in the model.
 *
 * @author Pidhurska Tetiana
 * @version 2 (updated on 14.05.16)
 */
public class View {

    // Text's constants
    public static final String INPUT_INT_DATA = "Please enter the INT value, lying in the range: ";
    public static final String WRONG_INPUT_INT_DATA = "Wrong input! Repeat please! ";
    public static final String WRONG_INPUT_INT_IN_RANGE = "Wrong input! Your integer is behind the required range! Repeat please! ";
    public static final String OUR_INT = "Congratulations! You guessed the correct INT value = ";

    //print methods with messages and values
    public void printMessage(String message) {
        System.out.println(message);
    }


}
