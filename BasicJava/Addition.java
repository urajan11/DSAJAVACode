import java.util.*;

public class Addition {
    public static void main(String args[]) {
        /*
         * int a=55,b=66; // passsing value
         * int sum=a+b; //store result
         * System.out.println(sum);
         */
        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();// input integert value

        int num2 = sc.nextInt();
        int sum = num1 + num2;
        System.out.println(sum);

    }

}
