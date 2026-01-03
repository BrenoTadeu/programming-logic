import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Type your age:");
        String numDigitado = input.nextLine();

        int numConvert = Integer.parseInt(numDigitado);
        if(numConvert == 16){
            System.out.println("Okay! Than you can voting!");
        }else{
            System.out.println("Sorry! You can aren't voting");
        }
    }
}