import java.util.Scanner;
public class Main
{
    public static void main(String[] args) {
        // The scanner is the port of the input
        Scanner input = new Scanner(System.in);

        System.out.println("Type your age:");
        //Then the variable stores the Scanner data
        String numDigitado = input.nextLine();

        //The Variable is converting to Integer
        int numConvert = Integer.parseInt(numDigitado);
        //Condition to know, if age to voting or not
        if(numConvert == 16){
            System.out.println("Okay! Than you can voting!");
        }else{
            System.out.println("Sorry! You can aren't voting");
        }
    }
}