import java.util.InputMismatchException;

public class ArabicNums
{
    static int stringToNum (String arabicNum)
    {
        try
        {
            if (arabicNum.equals("1"))
            {
                return 1;
            } else if (arabicNum.equals("2"))
            {
                return 2;
            } else if (arabicNum.equals("3"))
            {
                return 3;
            } else if (arabicNum.equals("4"))
            {
                return 4;
            } else if (arabicNum.equals("5"))
            {
                return 5;
            } else if (arabicNum.equals("6"))
            {
                return 6;
            } else if (arabicNum.equals("7"))
            {
                return 7;
            } else if (arabicNum.equals("8"))
            {
                return 8;
            } else if (arabicNum.equals("9"))
            {
                return 9;
            } else if (arabicNum.equals("10"))
            {
                return 10;
            }
        }
        catch (InputMismatchException wrongException)
        {
            throw new InputMismatchException("Неверно указанный формат данных, пожалуйста, введите число от 1 до 10");
        }
        return -1;
    }
}
