package com.Generics;

import java.util.*;

public class HashMapKey {

  public static void printMapKeyValues(Map<? extends Number,?> hmap) {
 Iterator trav=hmap.entrySet().iterator();
      while(trav.hasNext())
      {
         Map.Entry record=(Map.Entry)trav.next();
   
         System.out.println("Value="+record.getValue()  + "  Key= "+record.getKey() );
      }
 
  }
public static void main(String[] args) {
Map<Double,String> hmap=new HashMap<Double,String>();
Map<Integer,Double> hmap1=new HashMap();
hmap.put(1.3,"Abc");
hmap.put(2.9,"Xyz");
hmap.put(3.3,"Pqr");
printMapKeyValues(hmap);

System.out.println();
hmap1.put(1,12.0);
hmap1.put(2,13.3);
hmap1.put(3,14.4);
printMapKeyValues(hmap1);
       
}

}
