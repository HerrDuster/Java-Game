import java.util.ArrayList;
import java.util.Scanner;

public class Model {
    private int randomInt;
    private int minValue;
    private int maxValue;
    private int inputValue;
    ArrayList historyInput = new ArrayList();


    public void setMinValue(Scanner scanner, View view){
        view.write(view.SET_MIN_VALUE_RANGE);
        while (!scanner.hasNextInt()) {
            view.write(view.INPUT_NO_INT);
            view.writeRange(view.INPUT_NUMBER, getMinValue(), getMaxValue());
            scanner.next();
        }
        minValue=scanner.nextInt();
    }
    public void setMaxValue(Scanner scanner, View view){
        view.write(view.SET_MAX_VALUE_RANGE);
        while (!scanner.hasNextInt()) {
            view.write(view.INPUT_NO_INT);
            view.writeRange(view.INPUT_NUMBER, getMinValue(), getMaxValue());
            scanner.next();
        }
        maxValue= scanner.nextInt();
    }

    public int randomInt() {
        randomInt = (int) (Math.random() * maxValue);
        return randomInt;

    }
    public int inputIntValueWithScanner(Scanner scanner,View view) {
        view.writeRange(view.INPUT_NUMBER, getMinValue(), getMaxValue());
        while (!scanner.hasNextInt()) {
            view.write(view.INPUT_NO_INT);
            view.writeRange(view.INPUT_NUMBER, getMinValue(), getMaxValue());
            scanner.next();
        }
        return scanner.nextInt();
    }


    public void gameLogic(Scanner scanner, View view) {
        setMinValue(scanner, view);
        setMaxValue(scanner, view);
        randomInt();
        while (getRandomInt() != inputValue) {
            inputValue = inputIntValueWithScanner(scanner,view);
            if (inputValue > getMinValue() && inputValue < getMaxValue()) {
                if (inputValue == getRandomInt()) {
                    view.write(view.YOU_ARE_WIN+inputValue);
                    view.write(view.HISTORY_INPUT,historyInput.toString());
                } else {
                    answerHistory(inputValue);
                    if (inputValue > getRandomInt()) {
                        view.write(view.LESS_VALUE);
                        setMaxValue(inputValue);
                    } else {
                        view.write(view.MORE_VALUE);
                        setMinValue(inputValue);
                    }
                }
            } else {
                view.write(view.WENT_ABROAD);
            }
        }
    }


    public void answerHistory(int inputInt) {
        historyInput.add(inputInt);
    }

    public int getRandomInt() {
        return randomInt;
    }

    public void setRandomInt(int randomInt) {
        this.randomInt = randomInt;
    }

    public int getMinValue() {
        return minValue;
    }

    public void setMinValue(int minValue) {
        this.minValue = minValue;
    }

    public int getMaxValue() {
        return maxValue;
    }

    public void setMaxValue(int maxValue) {
        this.maxValue = maxValue;
    }
}
