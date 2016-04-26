

import java.util.Scanner;

/**
 * Class controller can send commands to the model to update the model's state.
 * It can also send commands to its associated view to change the view's presentation of the model
 *
 * @author Pidhurska Tetiana
 * @version 2 (updated on 26.04.16)
 */
public class Controller {

    /**
     * The {@code Model2} and  {@code View} represent the instances of the mentioned classes
     * in order to involve model and view objects in Controller class
     */
    Model2 model;
    View view;

    /**
     * Constructs a new {@code Controller} through initialization of  instances of Model2 and View classes
     *
     * @param model
     * @param view
     */
    public Controller(Model2 model, View view) {
        this.model = model;
        this.view = view;
    }

    // The Work methods

    /**
     * The method sends commands after the correct value is enterd by user.
     */
    public void processUser() {
        view.printMessageAndInt(view.RANDOM_INT_DATA, model.getValueMaschine());
        Scanner sc = new Scanner(System.in);
        model.setValueUser(inputCorrectValueInRange(sc));
        while (true) {
            if (model.valEquals()) {
                view.printMessageAndInt(view.OUR_INT, model.getValueUser());
                break;
            } else {
                if (model.greaterMashineValue()) {
                    view.printMessage(view.LESS_THAN_MACHINE_VALUE);
                } else {
                    view.printMessage(view.GREATER_THAN_MACHINE_VALUE);
                }
                view.printMessageAndInt(view.INPUT_RANGE_VALUES, model.getMin(), model.getMax());
                model.setValueUser(inputCorrectValueInRange(sc));
            }
        }

    }

    // The Utility methods

    /**
     * Checks whether the entered value is an integer
     *
     * @param sc opens the read stream from the console
     * @return the integer value
     */
    public int inputIntValueWithScanner(Scanner sc) {
        view.printMessage(view.INPUT_INT_DATA);
        while (!sc.hasNextInt()) {
            view.printMessage(view.WRONG_INPUT_INT_DATA + view.INPUT_INT_DATA);
            sc.next();
        }
        return sc.nextInt();
    }

    /**
     * Checks whether the input data belongs to the required range
     *
     * @param sc opens the read stream from the console
     * @return the integer value
     */
    public int inputCorrectValueInRange(Scanner sc) {
        int value = inputIntValueWithScanner(sc);
        while (value <= model.getMin() || value >= model.getMax()) {
            view.printMessage(view.WRONG_INPUT_INT_IN_RANGE);
            view.printMessageAndInt(view.INPUT_RANGE_VALUES, model.getMin(), model.getMax());
            value = inputIntValueWithScanner(sc);
        }
        return value;
    }
}
