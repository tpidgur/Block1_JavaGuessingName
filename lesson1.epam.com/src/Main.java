

public class Main {

    public static void main(String[] args) {

        // Initialization
        Model2 model = new Model2();
        View view = new View();
        Controller controller = new Controller(model, view);

        // Run
        controller.processUser();

    }

}
