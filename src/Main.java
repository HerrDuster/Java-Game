public class Main {

    public static void main(String[] args) {
        /**
         * in
         */

        Model model = new Model();
        View view = new View();
        Controller controller = new Controller(model, view);

        /**
         * run app
         */
        controller.run();
    }


}
