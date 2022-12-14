import java.util.*;


// For: Week #8
//By: Michael Koomler
// Date: 11/9/2022
//This code prints out diferent types of cookies
public class CookieJar {
    static cookies cookie1;
    static cookies cookie2;
    static cookies cookie3;
    public static void main(String[] args) { 
        cookie1 = new cookies("chocolate cookie ",2);
        cookie2 = new cookies("white chocolate chip cookie ",5);
        cookie3 = new cookies("peanut butter cookie ",9);
        cookie1.setTaste(" bold ! ");
        cookie2.setTaste("  bold! ");
        cookie3.setTaste("  bold! ");
        System.out.println(cookie1);
        System.out.println(cookie2);
        System.out.println(cookie3);
        cookie1.setTaste("bold! ");
        cookie2.setTaste("sweet ! ");
        cookie3.setTaste("crunchy! ");
        System.out.println(cookie1);
        System.out.println(cookie2);
        System.out.println(cookie3);
final ArrayList listOfCookies = new ArrayList<>();
    listOfCookies.add(cookie1);
    listOfCookies.add(cookie2);
    listOfCookies.add(cookie3);
    System.out.println(listOfCookies);
    Collections.sort(listOfCookies);
    System.out.println(listOfCookies);

//this is  a comment
    }
}