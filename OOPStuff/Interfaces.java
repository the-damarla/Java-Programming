package OOPStuff;
import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.rmi.server.Operation;
import java.util.*;

import static java.lang.Math.abs;

interface bike{
    int getSpeed();
    int breakApply();
    int getNumOfSeats();

}

interface tryingLambdaExp{
    void printMessage(int x);
}

interface applyBreaks extends tryingLambdaExp{
    default int applyBreak(int x, int y)
    {
        return abs(x-y);
    }
}

interface Operations
{
    int operations(int x,int y);
}

class publicBike implements bike, tryingLambdaExp, applyBreaks
{
    int speed = 0;
    int applyBr = 10;
    int numOfSeats = 2;
    publicBike(int speed, int applyBr, int numOfSeats)
    {
        this.speed = speed;
        this.applyBr = applyBr;
        this.numOfSeats = numOfSeats;
    }
    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public int breakApply() {
        applyBr -= speed;
        return abs(applyBr);
    }

    @Override
    public int getNumOfSeats() {
        return numOfSeats;
    }

    @Override
    public void printMessage(int x) {
        System.out.println("Helllloooooo");
    }
}



public class Interfaces {
    public static void main(String[] args) {
        publicBike motorBike = new publicBike(20,10,4);
        tryingLambdaExp print = (int x) -> System.out.println(x);
        print.printMessage(motorBike.getSpeed());
        print.printMessage(motorBike.breakApply());
        motorBike.printMessage(0);
        applyBreaks app = System.out::println; //(int x) -> System.out.println(x);
        print.printMessage(app.applyBreak(motorBike.getSpeed(),motorBike.breakApply()));
        Operations sum = Integer::sum;
        Operations mul = (a, b) -> a * b;
        Interfaces fun = new Interfaces();
        app.printMessage(fun.Operate(motorBike.getSpeed(),motorBike.getNumOfSeats(),sum));
        print.printMessage(fun.Operate(motorBike.getSpeed(),motorBike.getNumOfSeats(),mul));

    }
    private int Operate(int a, int b, Operations op)
    {
        return op.operations(a,b);
    }
}
