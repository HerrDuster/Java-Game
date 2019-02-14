import java.util.Scanner;

    public class Controller {

    public Model model;
    public View view;
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }


    public void run() {
        Scanner scanner = new Scanner(System.in);
        model.gameLogic(scanner, view);
    }
}


