package Study_Lab_1;

import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * Created by Piotr Smuga on 28.02.2017.
 */
public class Circle extends Figure implements IPrint
{
    private double _radius;
    public Circle(double ... radius)
    {
        _radius = radius.length > 0 ? radius[0] : 0;
    }

    @Override
    public void Print() {
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);
        System.out.println(this.getClass().getSimpleName()+ "\t" + " Radius: " + _radius + " Area: " +
                df.format(calculateArea()) + " Perimeter: " + df.format(calculatePerimeter()));
    }

    @Override
    protected double calculateArea() {
        return Math.PI * Math.pow(_radius,2);
    }

    @Override
    protected double calculatePerimeter() {
        return  2 * Math.PI * _radius;
    }
}
