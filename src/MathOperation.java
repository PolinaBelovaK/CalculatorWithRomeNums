import java.util.InputMismatchException;

class MathOperation
{
    //метод матем-х операций, принимающий два числа и символ. По символу метод определит какую операцию с этими числами ему произвести. +проверка допустимых значений.
    static String mathOperationResult(int number1, int number2, char operation)
    {
        if (number1 >= 1 && number1 <= 10 && number2 >= 1 && number2 <= 10)
        {
                int result = 0;
                if (operation == '+')
                {
                    result = number1 + number2;
                }
                else if (operation == '-')
                {
                    result = number1 - number2;
                }
                else if (operation == '*')
                {
                    result = number1 * number2;
                }
                else if (operation == '/')
                {
                    try
                    {
                        result = number1 / number2;
                    } catch (ArithmeticException | InputMismatchException wrongException)
                    {
                        System.out.println("Exception : " + wrongException);
                        System.out.println("Допустим только целочисленный тип данных, больше нуля");
                    }
                }
                return String.valueOf(result);
        }
        return "Неверно указанный формат данных";
    }
}