package epamm;

import java.util.*;
import java.util.stream.Collectors;

public class B {
    public static void main(String args[]) {
        List<String> l1 = new ArrayList<String>();
        l1.add("aba");
        l1.add("abc");
        l1.add("abcdefaaa");
        l1=search(l1);
        for(String i:l1)
            System.out.println(i);
    }
    static List<String> search(List<String> l1)
    {
        return l1.stream().filter(s -> s.startsWith("a")).filter(s -> s.length()==3).collect(Collectors.toList());
    }
}