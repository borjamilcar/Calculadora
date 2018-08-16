import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

/**
 * Menu
 *
 * Classe responsável por criar o(s) menus(s)
 *
 * @author Rei Panda
 * @version 1.0
 */

public class Menu {

    private void header(HeaderType type) {
        if (HeaderType.CALC.equals(type)) {
            System.out.println("+++++++++++++++++++++++++++++++++++++");
            System.out.println("+             Calculator            +");
            System.out.println("+++++++++++++++++++++++++++++++++++++");
        } else if (HeaderType.CONVERTER.equals(type)) {
            System.out.println("+++++++++++++++++++++++++++++++++++++");
            System.out.println("+          Converter - Mode         +");
            System.out.println("+++++++++++++++++++++++++++++++++++++");
        } else if (HeaderType.MAIN.equals(type)){
            System.out.println("+++++++++++++++++++++++++++++++++++++");
            System.out.println("+          Calculator - Mode        +");
            System.out.println("+++++++++++++++++++++++++++++++++++++");
        } else {
            System.out.println("+++++++++++++++++++++++++++++++++++++");
            System.out.println("+          Converter - " + type + "         +");
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
        header(HeaderType.MAIN);
        System.out.println("+ 1 - Normal Calc                   +");
        System.out.println("+ 2 - Converter                     +");
        System.out.println("+ 0 - Quit                          +");
        option(false);
    }

    public void headerCalc() {
        header(HeaderType.CALC);
        System.out.println("+  Ex.: 1 + 1 + 1 (Max 10 numbers)  +");
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        System.out.println("+ 0 - Back                          +");
        System.out.println(">> ");
    }

    public void menuConvert() {
        header(HeaderType.CONVERTER);
        System.out.println("+ 1 - Coin                          +");
        System.out.println("+ 2 - Time                          +");
        System.out.println("+ 3 - Temperature                   +");
        System.out.println("+ 4 - Length                        +");
        System.out.println("+ 5 - Velocity                      +");
        option(true);
    }

    public void menuConvertCoin() {
        header(HeaderType.COIN);
        System.out.println("+ 1 - DOLLAR ($)                    +");
        System.out.println("+ 2 - EURO (€)                      +");
        System.out.println("+ 3 - LIBRA (£)                     +");
        option(true);
    }

    public void menuConvertTime() {
        header(HeaderType.TIME);
        System.out.println("+ 1 - Second (s)                    +");
        System.out.println("+ 2 - Minute (m)                    +");
        System.out.println("+ 3 - Hour (h)                      +");
        option(true);
    }

    public void menuConvertTemp() {
        header(HeaderType.TEMPERATURE);
        System.out.println("+ 1 - Célsius (ºC)                  +");
        System.out.println("+ 2 - Fahrenheit (ºF)               +");
        option(true);
    }

    public void menuConvertLength() {
        header(HeaderType.LENGTH);
        System.out.println("+ 1 - Meter (m)                     +");
        System.out.println("+ 2 - Kilometer (km)                +");
        option(true);
    }

    public void menuConvertVelocity() {
        header(HeaderType.VELOCITY);
        System.out.println("+ 1 - Meters per second (m/s)       +");
        System.out.println("+ 2 - Kilometers per hour (km/h)    +");
        option(true);
    }

    public void headerCoin(Coin coin) {
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        System.out.println("+      Converter - Coin - " + coin + "     +");
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        System.out.println("+ Please, insert the amount!        +");
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        System.out.println("+ NOTE: Insert The Number 0 To Quit +");
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        System.out.print("+ >> ");
    }

    public void headerTime(Time time) {
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        System.out.println("+          Converter - Time - " + time + "         +");
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        System.out.println("+ Please, insert the time!          +");
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        System.out.println("+ NOTE: Insert The Number 0 To Quit +");
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        System.out.print("+ >> ");
    }

    public void headerTemp(Temp temp) {
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        System.out.println("+ Converter - Temperature - º" + temp + " +");
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        System.out.println("+ Please, insert the temp!          +");
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        System.out.println("+ NOTE: Insert The Number 0 To Quit +");
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        System.out.print("+ >> ");
    }

    public void headerLength(Length length) {
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        System.out.println("+        Converter - Length - " + length + "       +");
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        System.out.println("+ Please, insert the length!        +");
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        System.out.println("+ NOTE: Insert The Number 0 To Quit +");
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        System.out.print("+ >> ");
    }

    public void headerVelocity(Velocity velocity) {
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        System.out.println("+          Converter - Velocity - " + velocity + "         +");
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        System.out.println("+ Please, insert the velocity!      +");
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        System.out.println("+ NOTE: Insert The Number 0 To Quit +");
        System.out.println("+++++++++++++++++++++++++++++++++++++");
        System.out.print("+ >> ");
    }
}
