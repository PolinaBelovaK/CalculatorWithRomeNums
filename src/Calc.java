import java.util.Scanner;

public class Calc
{
    static char sign;
    static int num1, num2;
    static String result;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Введите математическое выражение только арабскими или только римскими цифрами, значениями от 1 до 10 включительно");
        calc(sc.nextLine());
        System.out.println(result);
    }

    //метод принимающий строку и возвращающий результат этой строки
    public static String calc(String input)
    {
        char[] chars = new char[10];
        for (int i = 0; i < input.length(); i++)
        {
            chars[i] = input.charAt(i);
            if (chars[i] == '+')
            {
                sign = '+';
            }
            if (chars[i] == '-')
            {
                sign = '-';
            }
            if (chars[i] == '/')
            {
                sign = '/';
            }
            if (chars[i] == '*')
            {
                sign = '*';
            }
        }
        String Line = String.valueOf(chars);
        String[] parts = Line.split("[+-/*]");
        String value1 = parts[0];
        String value2 = parts[1].trim();
        num1 = RomeNumbersToArabic.romeNumToArabicNum(value1);
        num2 = RomeNumbersToArabic.romeNumToArabicNum(value2);
        if (num1 < 0 && num2 < 0)
        {
            result = String.valueOf(0);
        }
        else
        {
            String RomeRes = MathOperation.mathOperationResult(num1, num2, sign);
            int numToConv = Integer.parseInt(RomeRes);
            result = Converter.convertArabiantoRome(numToConv);
            return result;
        }
        num1 = ArabicNums.stringToNum(value1);
        num2 = ArabicNums.stringToNum(value2);
        String ArabRes = MathOperation.mathOperationResult(num1, num2, sign);
        int num = Integer.parseInt(ArabRes);
        result = String.valueOf(num);
        return result;
    }
}
