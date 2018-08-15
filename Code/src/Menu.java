/**
 * Menu
 *
 * Classe responsável por criar o(s) menus(s)
 *
 * @author Rei Panda
 * @version 1.0
 */

public class Menu {
    /**
     *
     */
    private void logo(char type) {
        if (type == 'A') {
            System.out.println("+++++++++++++++++++++++++++++++++++++");
            System.out.println("+             Calculator           +");
            System.out.println("+++++++++++++++++++++++++++++++++++++");
        } else if (type == 'S') {
            System.out.println("+++++++++++++++++++++++++++++++++++++");
            System.out.println("+             Calculator           +");
            System.out.println("+++++++++++++++++++++++++++++++++++++");
        } else if (type == 'M') {
            System.out.println("+++++++++++++++++++++++++++++++++++++");
            System.out.println("+             Calculator           +");
            System.out.println("+++++++++++++++++++++++++++++++++++++");
        } else if (type == 'D') {
            System.out.println("+++++++++++++++++++++++++++++++++++++");
            System.out.println("+             Calculator           +");
            System.out.println("+++++++++++++++++++++++++++++++++++++");
        } else if (type == 'C') {
            System.out.println("+++++++++++++++++++++++++++++++++++++");
            System.out.println("+             Calculator           +");
            System.out.println("+++++++++++++++++++++++++++++++++++++");
        } else if (type == 'F'){
            System.out.println("+++++++++++++++++++++++++++++++++++++");
            System.out.println("+             Calculator           +");
            System.out.println("+++++++++++++++++++++++++++++++++++++");
        }
    }

    /**
     *
     */
    private void option() {
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        System.out.print(  "+ Opção >> ");
    }

    /**
     *
     */
    public void menu() {
        logo('F');
        System.out.println("+ 1 - Adição                        +");
        System.out.println("+ 2 - Subtração                     +");
        System.out.println("+ 3 - Multiplicação                 +");
        System.out.println("+ 4 - Divisão                       +");
        System.out.println("+ 5 - Conversor                     +");
        option();
    }

    /**
     *
     */
    public void menuAdd() {
        logo('A');

    }
}
