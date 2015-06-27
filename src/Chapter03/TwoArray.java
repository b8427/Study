package Chapter03;

/**
 * Created by Boris on 27.06.2015.
 */
public class TwoArray {
    public static void main(String[] args) {
        int array[] = {1, 2, 31, 9, 12};
        int x = 10;
        int min = Math.abs(x - array[0]);
        int difference;
        int count = 0;

        for (int i = 0; (i < array.length) && (min != 0); i++) {
            difference = Math.abs(x - array[i]);
            if (min > difference) {
                min = difference;
                count = i;
            }
        }
        System.out.println(array[count]);
    }
}

