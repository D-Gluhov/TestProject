import java.util.Arrays;

public class Start {
    public static void main(String[] args) {
        int[] array = {32, 1, 233, 4, 31, 43, 22, 10};
        boolean flag = false;
        int temp;
        while (!flag) {
            flag = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] < array[i + 1]) {
                    flag = false;
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(array));
    }
}
