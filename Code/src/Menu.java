/**
 * Menu
 *
 * Classe responsável por criar o(s) menus(s)
 *
 * @author Rei Panda
 * @version 1.0
 */

public class Menu {

    private HeaderType headerType;
    private void header(HeaderType type) {
        if (headerType.CALC.equals(type)) {
            System.out.println("+++++++++++++++++++++++++++++++++++++");
            System.out.println("+             Calculator            +");
            System.out.println("+++++++++++++++++++++++++++++++++++++");
        } else if (headerType.CONVERTER.equals(type)) {
            System.out.println("+++++++++++++++++++++++++++++++++++++");
            System.out.println("+          Converter - Mode         +");
            System.out.println("+++++++++++++++++++++++++++++++++++++");
        } else if (headerType.COIN.equals(type)) {
            System.out.println("+++++++++++++++++++++++++++++++++++++");
            System.out.println("+          Converter - Coin         +");
            System.out.println("+++++++++++++++++++++++++++++++++++++");
        } else if (headerType.TIME.equals(type)) {
            System.out.println("+++++++++++++++++++++++++++++++++++++");
            System.out.println("+          Converter - Time         +");
            System.out.println("+++++++++++++++++++++++++++++++++++++");
        } else if (headerType.TEMPERATURE.equals(type)) {
            System.out.println("+++++++++++++++++++++++++++++++++++++");
            System.out.println("+       Converter - Temperature     +");
            System.out.println("+++++++++++++++++++++++++++++++++++++");
        } else if (headerType.LENGTH.equals(type)) {
            System.out.println("+++++++++++++++++++++++++++++++++++++");
            System.out.println("+          Converter - Length       +");
            System.out.println("+++++++++++++++++++++++++++++++++++++");
        } else if (headerType.VELOCITY.equals(type)) {
            System.out.println("+++++++++++++++++++++++++++++++++++++");
            System.out.println("+         Converter - Velocity      +");
            System.out.println("+++++++++++++++++++++++++++++++++++++");
        } else if (headerType.MAIN.equals(type)){
            System.out.println("+++++++++++++++++++++++++++++++++++++");
            System.out.println("+          Calculator - Mode        +");
            System.out.println("+++++++++++++++++++++++++++++++++++++");
        }
    }

    private void option(boolean putOpBack) {
        if (putOpBack) {
            System.out.println("+ 0 - Back                          +");
        }
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        System.out.print(  "+ Opção >> ");
    }

    public void menu() {
        header(headerType.MAIN);
        System.out.println("+ 1 - Normal Calc                   +");
        System.out.println("+ 2 - Converter                     +");
        System.out.println("+ 0 - Quit                          +");
        option(false);
    }

    public void menuCalc() {
        header(headerType.CALC);
        System.out.println("+  Ex.: 1 + 1 + 1 (Max 10 numbers)  +");
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        System.out.println("+ 0 - Back                          +");
        System.out.println(">> ");
    }

    public void menuConvert() {
        header(headerType.CONVERTER);
        System.out.println("+ 1 - Coin                          +");
        System.out.println("+ 2 - Time                          +");
        System.out.println("+ 3 - Temperature                   +");
        System.out.println("+ 4 - Length                        +");
        System.out.println("+ 5 - Velocity                      +");
        option(true);
    }

    public void menuConvertCoin() {
        header(headerType.COIN);
        System.out.println("+ 1 - DOLLAR ($)                    +");
        System.out.println("+ 2 - EURO (€)                      +");
        System.out.println("+ 3 - LIBRA (£)                     +");
        option(true);
    }

    public void menuConvertTime() {
        header(headerType.TIME);
        System.out.println("+ 1 - Second (s)                    +");
        System.out.println("+ 2 - Minute (m)                    +");
        System.out.println("+ 3 - Hour (h)                      +");
        option(true);
    }

    public void menuConvertTemp() {
        header(headerType.TEMPERATURE);
        System.out.println("+ 1 - Célsius (ºC)                  +");
        System.out.println("+ 2 - Fahrenheit (ºF)               +");
        option(true);
    }

    public void menuConvertLength() {
        header(headerType.LENGTH);
        System.out.println("+ 1 - Meter (m)                     +");
        System.out.println("+ 2 - Kilometer (km)                +");
        option(true);
    }

    public void menuConvertVelocity() {
        header(headerType.VELOCITY);
        System.out.println("+ 1 - Meters per second (m/s)       +");
        System.out.println("+ 2 - Kilometers per hour (km/h)    +");
        option(true);
    }
}
