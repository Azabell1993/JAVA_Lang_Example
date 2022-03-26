public class CalculatorExample {
    public static void main(String[] args) {
        Calculator myCalc   = new Calculator();
        int a = 20;
        int b = 10;
        System.out.println(myCalc.SUM(a,b));
        System.out.println(myCalc.AVG(a,b));
        System.out.println(myCalc.SUB(a,b));
        System.out.println(myCalc.MUL(a,b));
        System.out.println(myCalc.DIV(a,b));
    }
}