import java.sql.SQLOutput;
import java.util.*;
import java.util.Scanner;
public class TakingInput{
    public static void main(String[] args)
    {
        System.out.println("Taking input from the user");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number 1");
        int a=sc.nextInt();
        System.out.println("Enter Number 2:");
        int b=sc.nextInt();
        int sum= a+b;
        System.out.println("Sum of these two numbers:");
        System.out.println(sum);

        boolean b1= sc.hasNextInt();
        System.out.println(b1);


    }}

