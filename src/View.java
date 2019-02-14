public class View {

    public final String SET_MIN_VALUE_RANGE = "Задайте минимальное значение для диапазона  ";
    public final String SET_MAX_VALUE_RANGE = "Задайте максимальное значение для диапазона ";
    public final String INPUT_NUMBER = "Угадайте число в диапазоне ";
    public final String INPUT_NO_INT = "Вы ввели не число";
    public final String YOU_ARE_WIN = "Поздравляю Вы выиграли! Правильный ответ: ";
    public final String MORE_VALUE = "Больше";
    public final String LESS_VALUE = "Меньше";
    public final String WENT_ABROAD = "Вы вышли за границы значений";
    public final String HISTORY_INPUT = "История неверных ответов: ";


    public void write(String message) {
        System.out.println(message);
    }

    public void write(String message, String message_two) {
        System.out.println(message + " " + message_two);
    }

    public void writeRange(String message, int min, int max) {
        System.out.println(message + min + " до " + max);
    }
}
