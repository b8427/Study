package Chapter03;

/**
 * Created by Boris on 27.06.2015.
 */
public class Matrix {
    public static void main(String[] args) {
        double [][] matrix ={{0*0,0*1,0*2,0*3},
                             {1*0,1*1,1*2,1*3},
                             {2*0,2*1,2*2,2*3},
                             {3*0,3*1,3*2,3*3}};
        for(double[] array:matrix){
            for(double num: array){
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}
