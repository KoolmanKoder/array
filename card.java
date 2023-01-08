public class card {
    String card;
    int number;
    String type;
    String[] names = new String[10]; 
    int numberofNames=0;
    String[] typs = new String[10]; 
    public card(String cardName, int number){ 
        String card;
        card = cards; 
        number = 1; 
    }
    
    public void number(){
        
    } 
    public void changecard(String newCard){
        names[numberofNames]=card;
        numberofNames++;
        card=newCard;
    }
    public String toString(){
        return card + number + type ;
    }}
