package lesson_2;

public class Task14 {
    public static int[] twoArguments(int len, int initialValue) {
        int[] arrTwoArgs = new int[len];
        for (int i = 0; i < len; i++){
            arrTwoArgs[i] = initialValue;
        }
        return arrTwoArgs;
    }
}
