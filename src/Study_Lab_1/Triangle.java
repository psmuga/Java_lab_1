package Study_Lab_1;

import java.math.RoundingMode;
import java.text.DecimalFormat;

/**
 * Created by Piotr Smuga on 28.02.2017.
 */
public class Triangle extends Figure implements IPrint
{
    double _sideA =0, _sideB=0, _sideC = 0;

    public Triangle(double sideA, double sideB, double sideC) throws Exception {
        _sideA = sideA;
        _sideB = sideB;
        _sideC = sideC;
        checkData();
    }
    private void checkData() throws Exception {
        if(_sideB + _sideA <= _sideC || _sideB + _sideC <= _sideA || _sideA + _sideC <= _sideB)
            throw new Exception("You cannot build triangle with this parameters");
    }
    @Override
    public void Print() {
        DecimalFormat df = new DecimalFormat("#.##");
        df.setRoundingMode(RoundingMode.CEILING);
        System.out.printf("%s\t Side A: %s Side B: %s Side C: %s Area: %s Perimeter: %s%n",
                this.getClass().getSimpleName(), _sideA, _sideB, _sideC,
                df.format(calculateArea()), df.format(calculatePerimeter()));
    }

    @Override
    protected double calculateArea() {
        double halfPerimeter = calculatePerimeter()/2;
        return Math.sqrt(halfPerimeter*(halfPerimeter - _sideA)*(halfPerimeter - _sideB)*(halfPerimeter - _sideC));
    }

    @Override
    protected double calculatePerimeter() {
        return _sideA + _sideB + _sideC;
    }
}
