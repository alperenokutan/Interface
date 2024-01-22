public interface CalculatorOperation {

    double Operation(double num1, double num2);

}

class additionOperation implements CalculatorOperation {
    @Override
    public double Operation(double num1, double num2) {
        return num1 + num2;
    }
}

class subtractionOperation implements CalculatorOperation {
    @Override
    public double Operation(double num1, double num2) {
        return num1 - num2;
    }
}

class multiplicationOperation implements CalculatorOperation {
    @Override
    public double Operation(double num1, double num2) {
        return num1 * num2;
    }
}

class divisionOperation implements CalculatorOperation {
    @Override
    public double Operation(double num1, double num2) {
        if (num2 == 0) {
            System.out.println("Numbers cannot be divided by 0!");
            return Double.NaN;
        } else {
            return num1 / num2;
        }
    }
}


