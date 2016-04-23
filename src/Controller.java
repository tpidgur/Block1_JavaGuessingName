

import java.util.Scanner;

/**
 * Created by User on 17.03.2016.
 */
public class Controller {
    // The Constants
    public static final double PI = 3.14;

    // The Regex
    // «nick@mail.com»
    public static final String REGEX_MAIL = "^([a-z0-9_-]+\\.)*[a-z0-9_-]+@[a-z0-9_-]+(\\.[a-z0-9_-]+)*\\.[a-z]{2,6}$";

    // «http://www.my-site.com»
    public static final String REGEX_URL = "^((https?|ftp)\\:\\/\\/)?([a-z0-9]{1})((\\.[a-z0-9-])|([a-z0-9-]))*\\.([a-z]{2,6})(\\/?)$";
    // «+38(044)555-55-55»
    public static final String REGEX_PHONE = "^\\+\\d{2}\\(\\d{3}\\)\\d{3}-\\d{2}-\\d{2}$";


    // Constructor
    Model2 model;
    View view;

    public Controller(Model2 model, View view) {
        this.model = model;
        this.view = view;
    }

    // The Work methods

    public void processUser() {
        view.printMessageAndInt(view.RANDOM_INT_DATA,model.getValueMaschine());
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
                //sc = new Scanner(System.in);
                model.setValueUser(inputCorrectValueInRange(sc));
            }
        }

    }


    // The Utility methods
    public int inputIntValueWithScanner(Scanner sc) {
        view.printMessage(view.INPUT_INT_DATA);
        while (!sc.hasNextInt()) {
            view.printMessage(view.WRONG_INPUT_INT_DATA + view.INPUT_INT_DATA);
            sc.next();
        }
        return sc.nextInt();
    }

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
