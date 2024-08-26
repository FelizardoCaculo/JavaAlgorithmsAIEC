import java.util.Scanner;

public class Exercise001 {

    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);
        int number1, number2, sumResult;

        //Input Datas
        System.out.println("\nDigite o 1º número: ");
        number1 = userInput.nextInt();
        System.out.println("\nDigite o 2º número: ");
        number2 = userInput.nextInt();

        //Data Processing
        sumResult = number1 + number2;

        //Program Outputs
        System.out.println("\nCalculando ... ... ...");
        System.out.println("\nResultado ==> " + number1 + " + " + number2 + " = " + sumResult);
        System.out.println();

        userInput.close();

    }

}