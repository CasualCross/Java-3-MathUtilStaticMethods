import java.util.Scanner;

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        while(true)
        {
            System.out.println(" ");
            System.out.println("MathUtil Class Testing...");
            System.out.println("Choose Function:");
            System.out.println("0) Exit");

            System.out.println("STATIC:");
            System.out.println("1) isPrime");
            System.out.println("2) GCD: Greatest Common Divisor");
            System.out.println("3) LCM: Least Common Multiple");
            System.out.println("4) Fibonacci");
            System.out.println("5) Factorial");

            MathUtil myMathUtil = new MathUtil();
            System.out.println("NON-STATIC:");
            System.out.println("6) isPerfectNumber");
            System.out.println("7) sumOfDigits");
            System.out.println("8) reverseNumber");
            System.out.println("9) isArmstrongNumber");
            System.out.println("10) nextPrime");


            System.out.println(" ");
            int userInputInterface = scanner.nextInt();
            scanner.nextLine();
            if(userInputInterface == 0)
            {
                break;
            }
            else if(userInputInterface == 1)
            {
                System.out.println("(isPrime)");
                System.out.println("Enter number to check for Prime: ");
                int userInput = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Number is prime: " + MathUtil.isPrime(userInput));
            }
            else if(userInputInterface == 2)
            {
                System.out.println("(GCD: Greatest Common Divisor)");
                System.out.println("Enter first number: ");
                int userInput1 = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enter second number: ");
                int userInput2 = scanner.nextInt();
                scanner.nextLine();
                System.out.println("GCD of " + userInput1 + " and " + userInput2);
                System.out.println("GCD: " + MathUtil.gcd(userInput1, userInput2));
            }
            else if(userInputInterface == 3)
            {
                System.out.println("(LCM: Least Common Multiple)");
                System.out.println("Enter first number: ");
                int userInput1 = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Enter second number: ");
                int userInput2 = scanner.nextInt();
                scanner.nextLine();
                System.out.println("LCM of " + userInput1 + " and " + userInput2);
                System.out.println("LCM: " + MathUtil.lcm(userInput1, userInput2));
            }
            else if(userInputInterface == 4)
            {
                System.out.println("(Fibonacci)");
                System.out.println("Enter number for fibonacci: ");
                int userInput = scanner.nextInt();
                scanner.nextLine();
                System.out.println(userInput + "th fibonacci is: " + MathUtil.fibonacci(userInput));
            }
            else if(userInputInterface == 5)
            {
                System.out.println("(Factorial)");
                System.out.println("Enter number for factorial: ");
                int userInput = scanner.nextInt();
                scanner.nextLine();
                System.out.println(userInput + "! is: " + MathUtil.factorial(userInput));
            }
            else if(userInputInterface == 6)
            {
                System.out.println("(isPerfectNumber)");
                System.out.println("Enter number for check: ");
                int userInput = scanner.nextInt();
                scanner.nextLine();
                System.out.println(userInput + " is Perfect: " + myMathUtil.isPerfectNumber(userInput));
            }
            else if(userInputInterface == 7)
            {
                System.out.println("(sumOfDigits)");
                System.out.println("Enter number for sum: ");
                int userInput = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Sum of digits of " + userInput + " is: " + myMathUtil.sumOfDigits(userInput));
            }
            else if(userInputInterface == 8)
            {
                System.out.println("(reverseNumber)");
                System.out.println("Enter number for reverse: ");
                int userInput = scanner.nextInt();
                scanner.nextLine();
                System.out.println(myMathUtil.reverseNumber(userInput));
            }
            else if(userInputInterface == 9)
            {
                System.out.println("(isArmstrongNumber)");
                System.out.println("Enter number for check: ");
                int userInput = scanner.nextInt();
                scanner.nextLine();
                System.out.println(userInput + " is Armstrong: " + myMathUtil.isArmstrongNumber(userInput));
            }
            else if(userInputInterface == 10)
            {
                System.out.println("(nextPrime)");
                System.out.println("Enter number to find next prime: ");
                int userInput = scanner.nextInt();
                scanner.nextLine();
                System.out.println("Next prime is: " + myMathUtil.nextPrime(userInput));
            }
            else
            {
                System.out.println("Error! Invalid Input");
            }

            Scanner waitScanner = new Scanner(System.in);
            System.out.println("\nPress Enter to continue...");
            waitScanner.nextLine();
        }
    }
}