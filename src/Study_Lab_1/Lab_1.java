package Study_Lab_1;

import java.io.Console;
import java.util.Scanner;

import static Study_Lab_1.CheckInputData.getDouble;

/**
 * Created by Piotr Smuga on 28.02.2017.
 */
public class Lab_1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        char wybor;
        do
        {
            System.out.println("Choose figure:");
            System.out.println("[1] - Circle");
            System.out.println("[2] - Square");
            System.out.println("[3] - Triangle");
            System.out.println("\n[q] - Exit");
            System.out.print("\n\t Your choice: ");
            wybor = scanner.next().charAt(0);
            switch ( wybor)
            {
                case '1':
                    CircleChoice();
                    break;
                case '2':
                    SquareChoice();
                    break;
                case '3':
                    TriangleChoice();
                    break;
                default:
                    break;
            }
        }while(wybor!='q');
    }
    private static void CircleChoice()
    {
        System.out.print("Write value of radius: ");
        Circle circle = new Circle(getDouble());
        System.out.println();
        circle.Print();
    }
    private static void TriangleChoice()
    {
        System.out.print("Write three value of side: ");
        try {
            Triangle triangle = new Triangle(getDouble(), getDouble(), getDouble());
            System.out.println();
            triangle.Print();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
    private static void SquareChoice()
    {
        System.out.print("\nWrite two value of side: ");
        Square square = new Square(getDouble(), getDouble());
        System.out.println();
        square.Print();
    }
}
