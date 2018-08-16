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
        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();

        do {
            menu.menuConvertVelocity();
            switch (input.nextInt()) {
                case 1:
                    mpsToAllVelocity();
                    break;
                case 2:
                    kphToAllVelocity();
                    break;
                case 0:
                    converter();
                    break;
                default:
                    System.out.println("Erro");
                    break;
            }
        } while (input.nextInt() != 0);
    }

    private static void kphToAllVelocity() {

    }

    private static void mpsToAllVelocity() {

    }

    private static void convertLength() {
        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();

        do {
            menu.menuConvertLength();
            switch (input.nextInt()) {
                case 1:
                    meterToAllLength();
                    break;
                case 2:
                    kmToAllLength();
                    break;
                case 0:
                    converter();
                    break;
                default:
                    System.out.println("Erro!");
                    break;
            }
        } while (input.nextInt() != 0);
    }

    private static void kmToAllLength() {

    }

    private static void meterToAllLength() {

    }

    private static void convertTemp() {
        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();

        do {
            menu.menuConvertTemp();
            switch (input.nextInt()) {
                case 1:
                    celsiusToAllTemp();
                    break;
                case 2:
                    fahrenheitToAllTemp();
                    break;
                case 0:
                    converter();
                    break;
                default:
                    System.out.println("Erro!");
                    break;
            }
        } while (input.nextInt() != 0);
    }

    private static void celsiusToAllTemp() {

    }

    private static void fahrenheitToAllTemp() {

    }

    private static void convertTime() {
        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();

        do {
            menu.menuConvertTime();
            switch (input.nextInt()) {
                case 1:
                    secondToAllTime();
                    break;
                case 2:
                    minuteToAllTime();
                    break;
                case 3:
                    hourToAllTime();
                    break;
                case 0:
                    converter();
                    break;
                default:
                    System.out.println("Erro!");
                    break;
            }
        } while (input.nextInt() != 0);
    }

    private static void hourToAllTime() {

    }

    private static void minuteToAllTime() {

    }

    private static void secondToAllTime() {

    }

    private static void convertCoin() {
        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();

        do {
            menu.menuConvertCoin();
            switch (input.nextInt()) {
                case 1:
                    dollarToAllCoin();
                    break;
                case 2:
                    euroToAllCoin();
                    break;
                case 3:
                    libraToAllCoin();
                    break;
                case 0:
                    converter();
                    break;
                default:
                    System.out.println("Erro!");
                    break;
            }
        } while (input.nextInt() != 0);
    }

    private static void libraToAllCoin() {

    }

    private static void euroToAllCoin() {

    }

    private static void dollarToAllCoin() {

    }

    private static void normalCacl() {
        Menu menu = new Menu();
        menu.menuCalc();
    }
}
