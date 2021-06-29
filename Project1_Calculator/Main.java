package Project1_Calculator;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        char operator;
        Double number1, number2, result;

        Scanner input = new Scanner(System.in);

        System.out.println("Welcome to the Scientific Calculator! \\(*_*)/ ");
        System.out.println("===============================================");
        System.out.println("Enter first number:");
        number1 = input.nextDouble();

        String newLine = System.getProperty("line.separator");
        System.out.println("Choose an operator from the list below:" + newLine + "(a). + " + newLine + "(b). -" + newLine + "(c). *" + newLine + "(d). /" + newLine + "" +
                "(e). ^" + newLine + "(f). Sqrt" + newLine + "(g). sin" + newLine + "(h). cos" + newLine + "(i). tan" + newLine + "" +
                "(j). log" + newLine + "(k). Min" + newLine + "(l). Max" + newLine + "(m). Abs" + newLine + "(n).Floor" + newLine + "(q). Ceil");
        System.out.println("===============================================");
        System.out.println("Enter it in a line below:");
        operator = input.next().charAt(0);

        switch (operator) {
            case 'a':
                System.out.println("Enter second number");
                number2 = input.nextDouble();
                result = number1 + number2;
                System.out.println("Result: " + result);
                break;
            case 'b':
                System.out.println("Enter second number");
                number2 = input.nextDouble();
                result = number1 - number2;
                System.out.println("Result: " + result);
                break;
            case 'c':
                System.out.println("Enter second number");
                number2 = input.nextDouble();
                result = number1 * number2;
                System.out.println("Result: " + result);
                break;
            case 'd':
                System.out.println("Enter second number");
                number2 = input.nextDouble();
                result = number1 / number2;
                System.out.println("Result: " + result);
                break;
            case 'e':
                System.out.println("Enter second number");
                number2 = input.nextDouble();
                result = Math.pow(number1, number2);
                System.out.println("Result: " + result);
                break;
            case 'f':
                result = Math.sqrt(number1);
                System.out.println("Result: " + result);
                break;
            case 'g':
                result = Math.sin(number1);
                System.out.println("Result: " + result);
                break;
            case 'h':
                result = Math.cos(number1);
                System.out.println("Result: " + result);
                break;
            case 'i':
                result = StrictMath.tan(number1);
                System.out.println("Result: " + result);
                break;
            case 'j':
                result = Math.log(number1);
                System.out.println("Result: " + result);
                break;
            case 'k':
                System.out.println("Enter second number");
                number2 = input.nextDouble();
                result = Math.min(number1, number2);
                System.out.println("Result: " + result);
                break;
            case 'l':
                System.out.println("Enter second number");
                number2 = input.nextDouble();
                result = Math.max(number1, number2);
                System.out.println("Result: " + result);
                break;
            case 'm':
                result = Math.abs(number1);
                System.out.println("Result: " + result);
                break;
            case 'n':
                result = Math.floor(number1);
                System.out.println("Result: " + result);
                break;
            case 'o':
                result = Math.ceil(number1);
                System.out.println("Result: " + result);
                break;
            default:
                System.out.println("Invalid operators input, try again!");
                break;
        }
        input.close();
    }
}
