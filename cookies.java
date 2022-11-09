// For: Week #7
//By: Michael Koomler
// Date: 11/9/2022

public class cookies {
    String typeString;
    int size;
    String tasteString = "unknown ";
    int weight;
    public cookies (String type, int size){
        typeString = type;
        this.size = size;
        
    }
    public void setWeght (int weight){
        this.weight = weight;
    }
    public void setTaste (String taste){
    
        tasteString = taste;
}
public String toString(){
    return "this cooke is " + typeString + " and taste is " + tasteString;
}
}
    

    

