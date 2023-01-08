//Simple horse class created by Kim Gross
//for CTE Software Development class 2022

public class card {
    String name;
    int number;
    String[] names = new String[10]; 
    int numberofNames=0; 
    public void cards(String cardsName, int number, String type, int cardsNumber){
        name=cardsName; 
        number = cardsNumber;
    }
    
    public void number(){
        
    } 
    public void changeName(String newName){
        names[numberofNames]=name;
        numberofNames++;
        name=newName;
    }
    public String toString(){
        return name + number;
    }


    
}