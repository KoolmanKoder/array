//By: Michael Koomler
//For My beloved Mr. Gross
//date:10/5/22
// this program prints out an array of the numbers 1-100 and prints outthe sum of the numbers 1-100
public class array{
public static void main(String[] args)
{
    // declares an Array of integers.
    int[] arr;
    int sum = 0;
    // allocating memory for 100 integers.
    arr = new int[100];
    for (int i = 0; i < arr.length; i++){ //assigning values to array
        arr [i] = i + 1;
        sum=sum+arr[i];// adding the value to the sum
    }
    for (int i = 0; i < arr.length; i++){
        if(arr [i]%2==1) //testing if the number is even or odd
    System.out.println(arr[i]+" odd");
    else
    System.out.println(arr[i]+" even");
    }
    System.out.println("The sum is "+ sum);
}
}