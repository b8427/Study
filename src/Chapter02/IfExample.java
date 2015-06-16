package Chapter02;

/**
 * Created by Boris on 16.06.2015.
 */
public class IfExample {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;

        if (x < y) {
            System.out.println("X меньше У");
        }
        x=x*2;
        if (x == y) {
            System.out.println("X теперь равен У");
        }
        x=x*2;
        if (x > y) {
            System.out.println("X теперь больше У");
        }
        if(x==y){
            System.out.println("Вы не увидите этого");
        }
    }
}
