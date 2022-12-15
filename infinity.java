// For: Week #11
//By: Michael Koomler
// Date: 12/14/2022
// This code prevents the world from exploding
class infinity{
    public static void main(String[] args) {
    int num1 = 5;
    int num2 = 0;
    try{
// trying to divide by 0 doesn't work
        System.out.print(num2/num1);
        System.out.print(num1/num2);
        System.out.println(" Look what you did >:(!" ); //criticism
        }
//so we cach the explision before it well... you know what? Lets not go there.
    catch(Exception e){
        System.out.println(" now you did it!" );  // more criticism
        }
//Another attempt at blowing up the world
    int [] array = {8,2,3,9,1};
        for(int i = 0; i < 6; i++){
            try{
             System.out.println(array[i]);
            }
//so we cach the explision again.
            catch(Exception e){
                System.out.println(" What did you do now?!" );  // most criticism    
             }
        }
    }
}
