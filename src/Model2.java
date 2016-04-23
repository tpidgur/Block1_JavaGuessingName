
/**
 * Created by User on 17.03.2016.
 */
public class Model2 {

    private int valueMaschine, valueUser, min = 0, max = 100;

    // The Program logic


    // the constructor in which the random value is generated


    public int getValueMaschine() {
        return valueMaschine;
    }

    public Model2() {
        this.valueMaschine = generateRandomValue();
    }

    /**
     * in this method generateRandomValue() the random value is generated between 0 and max=100
     */

    public int generateRandomValue() {
        valueMaschine = (int) Math.round(Math.random() * max);
        return valueMaschine;
    }

    /**
     * in this method valEquals() the  entered by user value is checked whether it equals the random value
     */
    public boolean valEquals() {
        if (valueMaschine != valueUser) {
            return false;
        } else return true;
    }

    /**
     * in this method greaterMashineValue() the random value is compared with the value entered by user on the criterion less or more
     */
    public boolean greaterMashineValue() {
        if (valueMaschine < valueUser) {
            max = valueUser;
            return false;
        } else {
            min = valueUser;
            return true;
        }
    }


    public int getMin() {
        return min;
    }


    public int getMax() {
        return max;
    }


    public int getValueUser() {
        return valueUser;
    }

    public void setValueUser(int valueUser) {
        this.valueUser = valueUser;
    }
}
