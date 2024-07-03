import entities.Employee;
import entities.Rectangle;
import entities.Student;

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

                System.out.println("Exercicio 02\n" +
                                   "------------");


                System.out.println("""
                        
                        Enter the employee's information
                        --------------------------------""");

                var employee = new Employee();


                System.out.print("\nName: ");
                sc.nextLine();
                employee.name = sc.nextLine();

                System.out.print("Gross salary: ");
                employee.grossSalary = sc.nextDouble();

                System.out.print("Tax: ");
                employee.tax = sc.nextDouble();

                System.out.println("\nEmployee: " + employee);

                System.out.print("Which percentage to increase salary? ");
                employee.increaseSalary(sc.nextDouble());

                System.out.println("\nUpdated data: " + employee);

                break;

            case 3:

                System.out.println("Exercicio 03\n" +
                        "------------");


                System.out.println("""
                        
                        Enter the student's information
                        --------------------------------""");

                var student = new Student();

                System.out.print("\nName: ");
                sc.nextLine();
                student.name = sc.nextLine();

                System.out.print("\nPrimeiro Trimestre: ");
                student.grade1 = sc.nextDouble();

                System.out.print("Segundo Trimestre: ");
                student.grade2 = sc.nextDouble();

                System.out.print("Terceiro Trimestre: ");
                student.grade3 = sc.nextDouble();

                System.out.println(student);

                if (student.sumTrimesters() < 60) {
                    System.out.printf("FAILED\n" +
                                       "MISSING %.2f POINTS", student.missingPoints());
                } else {
                    System.out.print("PASS");
                }

                break;

            default:
                System.out.println("Exercício não encontrado.");
        }

        sc.close();
    }
}