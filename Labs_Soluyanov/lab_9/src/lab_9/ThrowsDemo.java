package lab_9;

public class ThrowsDemo {

    public void printMessage(String key) {
        try {
            String message = getDetails(key);
            System.out.println(message);
        } catch (NullPointerException e) {
            System.out.println("Null parameter in key, should be String");
        }

    }

    public String getDetails(String key) {
        if (key == null) {
            throw new NullPointerException("null key in getDetails");
        }
        return "data for " + key;
    }
    /* Задание 5. Метод getDetails неудобно оборачивать в try-catch,
    ведь непонятно, какую именно часть кода нужно обернуть. Небходима отдельная
    функция printMessage, которая будет вызывать проверку getDetails */
}
