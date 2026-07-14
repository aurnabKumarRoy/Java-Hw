import java.util.Scanner;

public class Leap_year{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the Year: ");
        int year=sc.nextInt();

        if((year%400)==0 || ((year%100)!=0 && (year%4)==0)){
            System.out.println( year +" is leap year");
        }
        else{
            System.out.println(year + " is not a leap year");
        }
    }
}