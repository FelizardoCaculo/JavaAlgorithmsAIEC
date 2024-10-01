import java.util.Scanner;
import java.text.DecimalFormat;

public class Media {

    public static void main(String[] args) {

        DecimalFormat df = new DecimalFormat(",##0.00");
        Scanner userInput = new Scanner(System.in);
        double soma = 0;
        double notas[] = new double[4];
        double media;

        System.out.println("\nWarning: Utilize vírgulas (,) para separar valores decimais");

        for (int contador = 1; contador < 4; contador++) {
            System.out.print("\nDigite a " + contador + "ª nota: ");
            notas[contador] = userInput.nextDouble();
            soma = soma + notas[contador];
        }

        media = soma / 3;

        System.out.println("\nA média é: " + df.format(media));

        userInput.close();

    }

}