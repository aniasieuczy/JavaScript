public class SimpleCalculator {

    private double firstNumber;
    private double secondNumber;

    public void getFirstNumber() {
        this.firstNumber = firstNumber;
    }

    public void getSecondNumber () {
        this.secondNumber = secondNumber;
    }

    public double setFirstNumber(double firstNumber) {
        return this.firstNumber;
    }

    public double setSecondNumber (double secondNumber) {
        return this.secondNumber;
    }

    public double getAdditionResult(){
        return (firstNumber + secondNumber);
    }

    public double getSubtractionResult() {
        return (firstNumber - secondNumber);
    }

    public double getMultiplicationResult() {
        return firstNumber * secondNumber;
    }


    public double getDivisionResult () {
        return firstNumber/secondNumber;
    }

}
