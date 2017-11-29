package controller;
public  class Calculator
{
     public double calc ( double n1, String sing, double n2)
    {
        double indentificatorValue = 0;
        switch (sing)
        {
            case "+":
                indentificatorValue = n1+n2;
                break;
            case "-":
                indentificatorValue = n1-n2;
                break;
            case "*":
                indentificatorValue = n1*n2;
                break;
            case "/":
                indentificatorValue = n1/n2;
                break;
            default:
                indentificatorValue = 0;
                break;
        }
        return indentificatorValue;
    }
}
