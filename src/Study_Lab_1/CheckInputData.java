package Study_Lab_1;

import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Piotr Smuga on 01.03.2017.
 */
public final class CheckInputData {
    public static double getDouble()
    {
        Scanner scanner = new Scanner(System.in);
        double help =0;
        while (true)
        {
            try
            {
                help = scanner.nextDouble();
            }
            catch (Exception ex)
            {
                System.out.print("Value must be digit! Write once again but correct value: ");

                scanner.nextLine();

            }

            if (help <= 0)
                System.out.print("Value cannot be negative! Write once again but correct value: ");
            else
                break;
        }

        return help;
    }
}
