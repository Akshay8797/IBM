package com.Generics;

import java.util.ArrayList;

class NumberTest {

	public static void main(String[] args) {
	ArrayList<Number> n1=new ArrayList<Number>();
	     n1.add(1);
     n1.add(5);
     n1.add(3);
     n1.add(2);
     n1.add(2.3);
    
     print(n1);
	}
     public static <S, T extends Iterable<S>> void print(T list){
         for (Object element : list){
             System.out.println(element);

	}


}



 

  
    }

 	