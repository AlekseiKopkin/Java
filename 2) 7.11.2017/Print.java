package com.company;

import static java.lang.System.out;

class Print {
    void ChoiceFigure() {
        out.print(" 1)Square\n 2)Rectangle\n 3)Triangle\n 4)Circle\n Enter the figure number: ");
    }

    void ChoiceInputData() {
        out.print(" 1)Enter number\n 2)Input by coordinates\n Your choice: ");
    }

    void ChoiceSearch() {
        out.print(" 1)Area\n 2)Perimeter\n Enter the action number: ");
    }

    void SideSize() {
        out.print(" Enter the side size: ");
    }

    void Error() {
        out.println("ERROR");
    }

    void EnterCoordinateX()

    {
        out.print(" Value of X coordinate: ");
    }

    void EnterCoordinateY()

    {
        out.print(" Value of Y coordinate: ");
    }
    void EnterValue (double value){
        out.println(value);
    }
}
