import entities.Rectangle;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        var sc = new Scanner(System.in);

        short option;

        System.out.println("""
                Para acessar os enunciados dos exercícios, \

                vá até a pasta 'documentação' e abra o arquivo PDF
                """);

        System.out.println("""
                OPÇÃO        EXERCÍCIO
                ----------------------
                  1              01
                  2              02
                  3              03
                ----------------------
                """);

        System.out.print("Exercício Nº: ");
        option = sc.nextShort();

        for(int i = 0; i < 10; i++) {
            System.out.println();
        }

        switch(option) {
            case 1:

                System.out.println("Exercicio 01\n" +
                                   "------------");

                System.out.println("""

                        Enter rectangle width and height
                        --------------------------------""");

                var rectangle = new Rectangle();

                System.out.print("Width: ");
                rectangle.width = sc.nextDouble();

                System.out.print("Height: ");
                rectangle.height = sc.nextDouble();

                System.out.println(rectangle);

                break;

            case 2:
                break;

            case 3:
                break;

            default:
                System.out.println("Exercício não encontrado.");
        }

        sc.close();
    }
}