//horses code by Michael
//For my beloved teacher Mr Gross
//On 10/13/2022

import java.util.ArrayList;

public class horses { 
  public static void main(String[] args) { 
   horse horse1 = new horse("Volvo",2019);
   horse horse2 = new horse("BMW",2002);
   horse horse3 = new horse("Ford",2021);
   horse  horse4 = new horse("Honda",2011);
   horse  horse5 = new horse("Toyota",2015);
    ArrayList<horse> horses = new ArrayList<horse>();
    horses.add(horse1);
    horses.add(horse2);
    horses.add(horse3);
    horses.add(horse4);
    horses.add(horse5);
    horses.add(horse3);
    horse1.changeName("Scion");
    horses.add(horse1);
    System.out.println(horses);
  } 
}