import java.util.InputMismatchException;

class RomeNumbersToArabic {
    //конвертер римских допустимых значений
    static int romeNumToArabicNum (String RomeNum)
    {
        try
        {
            if (RomeNum.equals("I"))
            {
                return 1;
            }
            else if (RomeNum.equals("II"))
            {
                return 2;
            }
            else if (RomeNum.equals("III"))
            {
                return 3;
            }
            else if (RomeNum.equals("IV"))
            {
                return 4;
            }
            else if (RomeNum.equals("V"))
            {
                return 5;
            }
            else if (RomeNum.equals("VI"))
            {
                return 6;
            }
            else if (RomeNum.equals("VII"))
            {
                return 7;
            }
            else if (RomeNum.equals("VIII"))
            {
                return 8;
            }
            else if (RomeNum.equals("IX"))
            {
                return 9;
            }
            else if (RomeNum.equals("X"))
            {
                return 10;
            }
        }
        catch (InputMismatchException wrongException)
        {
            throw new InputMismatchException("Неверно указанный формат данных, пожалуйста, введите число от I до X.");
        }
        return -1;
    }
}
