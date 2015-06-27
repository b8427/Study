package Chapter03;

/**
 * Created by Boris on 23.06.2015.
 */
public class Array {
    public static void main(String []args) {

        int i;
        int j;

        int arrayTest[][] = new int[6][5];

        for (i = 0; i < 6; i++) {
            System.out.print("\n");
            for (j = 0; j < 5; j++) {
                arrayTest[i][j] = j + 1;
                System.out.print(arrayTest[i][j] + " ");
            }
        }

    }
}
