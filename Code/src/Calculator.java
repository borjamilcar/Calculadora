import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

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

        while (true) {
            menu.menu();
            switch (input.next()) {
                case "1":
                    normalCacl();
                    break;
                case "2":
                    converter();
                    break;
                case "0":
                    System.exit(1);
                    break;
                default:
                    System.out.println("Error!");
                    break;
            }
        }
    }

    private static void converter() {
        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();

        while (true) {
            menu.menuConvert();
            switch (input.next()) {
                case "1":
                    convertCoin();
                    break;
                case "2":
                    convertTime();
                    break;
                case "3":
                    convertTemp();
                    break;
                case "4":
                    convertLength();
                    break;
                case "5":
                    convertVelocity();
                    break;
                case "0":
                    calcRun();
                    break;
                default:
                    System.out.println("Error!");
                    break;
            }
        }
    }

    private static void convertVelocity() {
        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();

        while (true) {
            menu.menuConvertVelocity();
            switch (input.next()) {
                case "1":
                    mpsToAllVelocity();
                    break;
                case "2":
                    kphToAllVelocity();
                    break;
                case "0":
                    converter();
                    break;
                default:
                    System.out.println("Erro");
                    break;
            }
        }
    }

    private static void kphToAllVelocity() {

    }

    private static void mpsToAllVelocity() {

    }

    private static void convertLength() {
        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();

        while (true) {
            menu.menuConvertLength();
            switch (input.next()) {
                case "1":
                    meterToAllLength();
                    break;
                case "2":
                    kmToAllLength();
                    break;
                case "0":
                    converter();
                    break;
                default:
                    System.out.println("Erro!");
                    break;
            }
        }
    }

    private static void kmToAllLength() {

    }

    private static void meterToAllLength() {

    }

    private static void convertTemp() {
        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();

        while (true){
            menu.menuConvertTemp();
            switch (input.next()) {
                case "1":
                    celsiusToAllTemp();
                    break;
                case "2":
                    fahrenheitToAllTemp();
                    break;
                case "0":
                    converter();
                    break;
                default:
                    System.out.println("Erro!");
                    break;
            }
        }
    }

    private static void celsiusToAllTemp() {

    }

    private static void fahrenheitToAllTemp() {

    }

    private static void convertTime() {
        Scanner input = new Scanner(System.in);
        Menu menu = new Menu();

        while (true) {
            menu.menuConvertTime();
            switch (input.next()) {
                case "1":
                    secondToAllTime();
                    break;
                case "2":
                    minuteToAllTime();
                    break;
                case "3":
                    hourToAllTime();
                    break;
                case "0":
                    converter();
                    break;
                default:
                    System.out.println("Erro!");
                    break;
            }
        }
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

        while (true) {
            menu.menuConvertCoin();
            switch (input.next()) {
                case "1":
                    dollarToAllCoin();
                    break;
                case "2":
                    euroToAllCoin();
                    break;
                case "3":
                    libraToAllCoin();
                    break;
                case "0":
                    converter();
                    break;
                default:
                    System.out.println("Erro!");
                    break;
            }
        }
    }

    private static void libraToAllCoin() {
        Operator operator = new Operator();
        Menu menu = new Menu();
        Scanner input  = new Scanner(System.in);

        /*while (true) {
            menu.headerCoin(Coin.LIBRA);
        }*/
    }

    private static void euroToAllCoin() {

    }

    private static void dollarToAllCoin() {

    }

    private static void normalCacl() {
        Operator operator = new Operator();
        Menu menu = new Menu();
        Scanner input = new Scanner(System.in);

        do {
            menu.headerCalc();
            //operator.calcResult(input.next());
        } while (input.next().equals("0"));
    }
}
