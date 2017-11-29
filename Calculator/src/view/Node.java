package view;

import controller.Calculator;
import controller.Value;

public class Node implements Comparable<Node> {
    private double numOne;
    private double numTwo;
    private String myActSign;
    private int frequency = 0;
    private int index;
    private double rez = 5;
    double[] mas=new double[2];
    Calculator calculator=new Calculator();

    //Properties
    public int getFrequency() {
        return frequency;
    }

    public double getRez() {
        return rez;
    }

    public void addFrequency() {
        frequency++;
    }

    public Node(Double num1,Double num2,String actSign, int index){
        numOne=num1;
        numTwo=num2;
        myActSign=actSign;
        this.index=index;
        frequency++;
        rez=countUp();
    }
    public boolean equals(Object objNode) {
        Node node = (Node) objNode;
        if (this.numOne == node.numOne && this.numTwo == node.numTwo
                && this.myActSign.equals(node.myActSign)) {
            return true;
        } else {
            return false;
        }
    }

  public Double countUp() {
     return (calculator.calc(numOne,myActSign,numTwo));
  }
        @Override
    public int compareTo(Node node) {
        if (this.numTwo == node.numTwo && this.numOne == node.numOne && this.myActSign.equals(node.myActSign)) {
            return 0;
        }
        if (this.frequency == node.frequency) {
            if (this.index < node.index)
                return 1;
            else return -1;
        } else if (this.frequency > node.frequency)
            return -1;
        else return 1;
    }
}
