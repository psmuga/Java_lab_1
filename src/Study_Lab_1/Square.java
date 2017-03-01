package Study_Lab_1;

import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * Created by Piotr Smuga on 28.02.2017.
 */
public class Square extends Figure implements IPrint {
    double _height =0, _width = 0;

    public Square(double width, double height)
    {
        _height = height;
        _width = width;
    }
    @Override
    public void Print() {
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);
        System.out.printf("%s\t Width: %s Height: %s Area: %s Perimeter: %s%n",
                this.getClass().getSimpleName(), _width, _height,
                df.format(calculateArea()), df.format(calculatePerimeter()));
    }

    @Override
    protected double calculateArea() {
        return _height * _width;
    }

    @Override
    protected double calculatePerimeter() {
        return 2 * (_height + _width);
    }
}
