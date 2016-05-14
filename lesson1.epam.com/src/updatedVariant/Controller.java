package updatedVariant;

import java.util.Scanner;

/**
 * Class controller can send commands to the model to update the model's state.
 * It can also send commands to its associated view to change the view's presentation of the model
 *
 * @author Pidhurska Tetiana
 * @version 2 (updated on 14.05.16)
 */
public class Controller {

    /**
     * The {@code oldVariant.Model2} and  {@code oldVariant.View} represent the instances of the mentioned classes
     * in order to involve model and view objects in oldVariant.Controller class
     */
    Model2 model;
    View view;

    /**
     * Constructs a new {@code oldVariant.Controller} through initialization of  instances of oldVariant.Model2 and oldVariant.View classes
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
    public void processUser(){
        Scanner sc = new Scanner(System.in);

        model.setMinMaxRangeValues(Constants.PRIMARY_MIN_BARRIER,
                Constants.PRIMARY_MAX_BARRIER);
        model.generateRandomValue();

        while (!model.checkValue(inputIntValueWithScanner(sc))){}

        view.printMessage(View.OUR_INT + model.getValueMaschine());
    }



    // The Utility methods

    /**
     * Checks whether the entered value is an integer and belongs to the required range
     *
     * @param sc opens the read stream from the console
     * @return the integer value
     */


    public int inputIntValueWithScanner(Scanner sc) {
        int res=0;
        view.printMessage(View.INPUT_INT_DATA +
                model.getMin() +"-" + model.getMax());

        while( true ) {
            // check int - value
            while (!sc.hasNextInt()) {
                view.printMessage(View.WRONG_INPUT_INT_DATA
                        + View.INPUT_INT_DATA);
                sc.next();
            }
            // check value in range
            if ((res = sc.nextInt()) <= model.getMin() ||
                    res >= model.getMax()) {
                view.printMessage(View.WRONG_INPUT_INT_IN_RANGE
                        + View.INPUT_INT_DATA);
                continue ;
            }
            break;
        }
        return res;
    }
}
