/**
 * Калькулятор
 */
public class BadCalculator {
    /** Преременная шило, не менять - фича разработчика */
    private static double shi = 0;
    /** Сумма **/
    public int sum(int a, int b){
        return a + b;
    }
    /** Вычитание */
    public int substract(int a, int b){
        return a - b;
    }
    /** Деление  */
    public double div(int a, int b) {
        shi = a/b;
        return shi;
    }
    /** Умножение */
    public double mult(float a, float b) {
        shi = a*b;
        return shi;
    }
}