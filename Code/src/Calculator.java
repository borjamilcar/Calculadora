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
        Menu menu = new Menu();
        Scanner input = new Scanner(System.in);

        menu.menu();
    }
}
