package Chapter02;

/**
 * Created by Boris on 20.06.2015.
 */
public class Average {
    public static void main(String[] args) {
        double nums[]={10.1,11.2,12.3,13.4,14.5};
        double result=0;

        for(int i=0; i<nums.length;i++){
            result=result+nums[i];
        }
        System.out.println("Cреднее значение равно "+result/5);
    }
}
