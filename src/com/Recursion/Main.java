package com.Recursion;
import java.util.*;
public class Main {

    public static void main(String[] args) {
        // it is same as hashset but in this order is maintained.
	LinkedHashSet <Integer> ls = new LinkedHashSet<>();
	ls.add(78);
	ls.add(89);
	ls.add(90);
	ls.add(99);
        System.out.println(ls);

    }
}
