import jdk.jfr.Percentage;

import java.sql.SQLOutput;
import java.util.*;
import java.util.Scanner;
public class CalPercentage {
    public static void main(String[] args)
    {
        System.out.print("Calculate percentage of 5 subjects:");
        Scanner sc=new Scanner(System.in);
        System.out.print("English:");
        int sub1=sc.nextInt();
        System.out.print("Sanskrit:");
        int sub2=sc.nextInt();
        System.out.print("Science:");
        int sub3=sc.nextInt();
        System.out.print("Maths:");
        int sub4=sc.nextInt();
        System.out.print("Socialscience:");
        int sub5=sc.nextInt();
        int total=sub1+sub2+sub3+sub4+sub5;
        System.out.println("Total:"+total);
        float percentage= total*100/500;
        System.out.println("Percentage:"+percentage);



    }
}
