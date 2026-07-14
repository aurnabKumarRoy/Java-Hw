import java.util.Scanner;

public class sum_of_series{
    public static void main(String[] args) {
        System.out.println("1st loop is :");

        int sum1=0;
        for(int i=2;i<=20;i+=2){
            System.out.print(i + " ");
        }
        System.out.println();

        //Calculating Sum
        for(int i=2;i<=20;i+=2){
            sum1+=i;
        }
        System.out.println("Sum of the 1st series is: "+sum1);

        System.out.println();
        System.out.println();
        System.out.println("2nd loop is :");
        for(int i=1;i<=19;i+=2){
            System.out.print(i + " ");
        }
        System.out.println();

        //Calculating Sum of 2nd series
        int sum2=0;
        for(int i=1;i<=19;i+=2){
            sum2+=i;
        }
        System.out.println("Sum of the 2nd series is: "+sum1);
    }
}