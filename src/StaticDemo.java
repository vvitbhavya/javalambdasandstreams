package javalambdasandstreams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
public class StaticDemo {
	public static void main(String[] args) {
        List<String> a = Arrays.asList("pip","pop","abba","aba","geethu","abcdfg");
        List<String> palindromes = StaticDemo.findPal(a, 
                (st) -> StaticDemo.isPal((String) st));
 
        System.out.println("Palindromes:" + palindromes);
    }
 
    public static boolean isPal(String str) {
    	StringBuffer newStr =new StringBuffer();
    	for(int i = str.length()-1; i >= 0 ; i--) {
    	newStr = newStr.append(str.charAt(i));
    	}
    	return str.equalsIgnoreCase(newStr.toString());
        } 
    public static List<String> findPal(List<String> list, Predicate<String> predicate) { 
    	List<String> sortedpal = new ArrayList<String>(); 
    	list
    	.stream()
    	.filter((i) -> (predicate.test((String) i))).forEach((i) -> {
            sortedpal.add((String) i);
        });
        return sortedpal;
 
    }
}
