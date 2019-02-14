import java.util.Scanner;

public class Controller {

    public Model model;
    public View view;
    int inputValue;
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }


    public void run() {
        Scanner scanner = new Scanner(System.in);
        gameLogic(scanner);
    }



    public int inputIntValueWithScanner(Scanner sc) {
        view.writeRange(view.INPUT_NUMBER, model.getMinValue(), model.getMaxValue());
        while (!sc.hasNextInt()) {
            view.write(view.INPUT_NO_INT);
            view.writeRange(view.INPUT_NUMBER, model.getMinValue(), model.getMaxValue());
            sc.next();
        }
        return sc.nextInt();
    }



    public void gameLogic(Scanner scanner) {
        model.randomInt();
        while (model.getRandomInt() != inputValue) {
            inputValue = inputIntValueWithScanner(scanner);
            if (inputValue > model.getMinValue() && inputValue < model.getMaxValue()) {
                if (inputValue == model.getRandomInt()) {
                    view.write(view.YOU_ARE_WIN+inputValue);
                    view.write(view.HISTORY_INPUT,model.historyInput.toString());
                } else {
                    model.answerHistory(inputValue);
                    if (inputValue > model.getRandomInt()) {
                        view.write(view.LESS_VALUE);
                        model.setMaxValue(inputValue);
                    } else {
                        view.write(view.MORE_VALUE);
                        model.setMinValue(inputValue);
                    }
                }
            } else {
                view.write(view.WENT_ABROAD);
            }
        }
    }
}


