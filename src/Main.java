public class Main {
    public static void main(String[] args) {

        Calculator calculator = new Calculator(10,5);

        System.out.println("a+b= " + calculator.addition());
        System.out.println("a-b= " + calculator.subtraction());

    }
}