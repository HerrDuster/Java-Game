import java.sql.Array;
import java.util.ArrayList;

public class Model {
    private int randomInt;
    private int minValue;
    private int maxValue = 100;
    private String answersHistory;
    ArrayList historyInput = new ArrayList();


    public String getAnswersHistory() {
        return answersHistory;
    }

    public void setAnswersHistory(String answersHistory) {
        this.answersHistory = answersHistory;
    }

    public int randomInt() {
        randomInt = (int) (Math.random() * maxValue);
        return randomInt;

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
