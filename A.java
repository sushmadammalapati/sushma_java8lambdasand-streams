package epamm;

import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class A {
    public static void main(String args[])
    {
        IntStream stream=IntStream.of(10,20,30,40,50,60);
        OptionalDouble obj=stream.average();
        if(obj.isPresent())
        {
            System.out.println(obj.getAsDouble());
        }
        else
        {
            System.out.println(-1);
        }
    }
}