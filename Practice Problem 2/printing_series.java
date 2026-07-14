import java.util.Scanner;

public class printing_series{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Using for loop:");
        for(int i=2;i<=20;i+=2){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Using while loop:");
        int j=2;
        while(j%2==0 && j<=20){
            System.out.print(j +" ");
            j+=2;
        }
        System.out.println();

        System.out.println("Using do-while loop");
        int k=2;
        do{
            System.out.print(k+ " ");
            k+=2;
        } while ( k<=20);
        System.out.println();

        System.out.println();
        System.out.println();
        System.out.println("Using for loop:");
        for(int i=1;i<=19;i+=2){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Using while loop:");
        int l=1;
        while(l%2==1 && l<=19){
            System.out.print(l +" ");
            l+=2;
        }
        System.out.println();

        System.out.println("Using do-while loop");
        int m=1;
        do{
            System.out.print(m+ " ");
            m+=2;
        } while ( m<=19);
        System.out.println();

    }
}