package javalambdasandstreams;

import java.util.*; 
import java.util.stream.IntStream; 
public class avg {
	public static void main(String[] args) 
    {
	 IntStream stream = IntStream.of(1,2,3,4,5,6,7,8,9,10); 
        OptionalDouble obj = stream.average(); 
        if (obj.isPresent()) { 
            System.out.println(obj.getAsDouble()); 
        } 
        else { 
            System.out.println("Invalid"); 
        } 
    } 
}
