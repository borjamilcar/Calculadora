import java.util.Scanner;

/**
 * Calculator
 *
 * Classe principal que conecta todas as demais classes
 * Exibe o menu  da classe Menu e chama os operadores da classe Operator
 *
 * @author Rei Panda
 * @version 1.0
 */

public class Calculator {
    public static void main(String[] args) {

        while (true) {
            calcRun();
        }

    }

    private static void calcRun() {
        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();

        do {
            menu.menu();
            switch (input.nextInt()) {
                case 1:
                    normalCacl();
                    break;
                case 2:
                    converter();
                    break;
                case 0:
                    System.exit(1);
                    break;
                default:
                    System.out.println("Error!");
                    break;
            }
        } while (input.nextInt() != 0);
    }

    private static void converter() {
        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();

        do {
            menu.menuConvert();
            switch (input.nextInt()) {
                case 1:
                    convertCoin();
                    break;
                case 2:
                    convertTime();
                    break;
                case 3:
                    convertTemp();
                    break;
                case 4:
                    convertLength();
                    break;
                case 5:
                    convertVelocity();
                    break;
                case 0:
                    calcRun();
                    break;
                default:
                    System.out.println("Error!");
                    break;
            }
        } while (input.nextInt() != 0);
    }

    private static void convertVelocity() {
        Menu menu = new Menu();
    }

    private static void convertLength() {

    }

    private static void convertTemp() {
        
    }

    private static void convertTime() {

    }

    private static void convertCoin() {
        
    }

    private static void normalCacl() {
        Menu menu = new Menu();
        menu.menuCalc();
    }
}
