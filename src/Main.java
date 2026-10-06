import java.util.Scanner;

public class Main{
    public static void main(String[]args){
        var scanner = new Scanner(System.in);

        System.out.println("Digite a sua altura:" );
        double alt = scanner.nextDouble();
        System.out.println("Digite o seu peso:");
        double peso = scanner.nextDouble();

        double imc = peso / (alt * alt);
        System.out.printf("Seu IMC é: %.2f%n",imc);

        if (imc  <=18.5) {
            System.out.println("Abaixo do peso" );
        }
        else if ( imc <= 24.9) {
            System.out.println("Peso ideal");
        }
        else if (imc <= 29.9) {
            System.out.println("Levemente acima do peso");
        }
        else if (imc <= 34.9) {
            System.out.println("Obesidade grau I");
        }
        else if ( imc <= 39.9) {
            System.out.println("Obesidade grau II (Severa)");
        }
        else {
            System.out.println("Obesidade morbida");
        }
        }

    }
