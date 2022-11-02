   //Simple horse class created by Kim Gross
//for CTE Software Development class 2022

public class horse {
    String name;// current name of the horse
    int birthYear;//year the horse was born
    String[] names = new String[10]; //array of old names of the horse
    int numberofNames=0; //how many old names are there.
    public horse(String horseName, int year){ //horse constructor needs its name and birth year.
        name=horseName; //assigns the name of the horse to the horseName which was sent in the construtor.
        birthYear=year; //assigns the year to the birthYear that was sent in the constructor;
    }
    
    public void age(){
        // what should be in a age function?
    } 
    public void changeName(String newName){//change the name but safe the old name
        names[numberofNames]=name;
        numberofNames++;
        name=newName;
    }
    public String toString(){
        return name + " Who was born in " + birthYear;
    }


    
}