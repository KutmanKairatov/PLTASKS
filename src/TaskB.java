import java.util.Scanner;

public class TaskB {
    public static void main (String[] args){
        Scanner i = new Scanner (System.in);
        int num = i.nextInt();

        System.out.println("The next number for the number " + num + " is "+ (num+1) + ".");
        System.out.println("The previous number for the number " + num +" is "+ (num-1) +".");

    }
}