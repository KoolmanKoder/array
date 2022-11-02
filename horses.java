//horses code by Michael
//For my beloved teacher Mr Gross
//On 10/13/2022

import java.util.ArrayList;

public class horses { 
  public static void main(String[] args) { 
   horse horse1 = new horse("Volvo",2019);
   horse horse2 = new horse("BMW",2002);
   horse horse3 = new horse("Ford",2021);
   
   
    ArrayList<horse> horses = new ArrayList<horse>();
    horses.add(horse1);
    horses.add(horse2);
    horses.add(horse3);
    System.out.println(horses);
  } 
}