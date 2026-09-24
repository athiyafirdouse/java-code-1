import java.util.Scanner;
public class Fahrenheitcelsisus {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Input a degree in Fahrenheit :");
       double Fahrenheit = sc.nextDouble();
        double celsius = ((5*(Fahrenheit - 32))/9);
        System.out.println("the celsius is "+ celsius);

   }

}
