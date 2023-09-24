
//package unconsolable.seven;


public class ConsoleShelf{

    //fields for the shelf variable def (Michelle Luo)
    private double height; //in meters
    private int availableSpace; //total number of console box spaces on shelf
    private boolean isFull; //is it full?
    private String color; //color of the shelf
    private Console[] consoleArray; //information about the consoles on the shelf

    //default constructor console shelf (Michelle Luo)
    public ConsoleShelf(){
        this.height = 2.6;
        this.availableSpace = 8;
        this.isFull = false;
        this.color = "gray";
        this.consoleArray = // INSERT AN ARRAY FULL OF NULL VALUES SOMEHOW;
    }
    
    //partial constructor console shelf (Michelle Luo)
    public ConsoleShelf(int availableSpace, boolean isFull, Console[] consoleArray){
        this.height = 2.6;
        this.availableSpace = availableSpace;
        this.isFull = isFull;
        this.color = "gray";
        this.consoleArray = consoleArray;
    }

    //full constructor console shelf (Michelle Luo)
    public ConsoleShelf(double height, int availableSpace, boolean isFull, String color, Console[] consoleArray){
        this.height = height;
        this.availableSpace = availableSpace;
        this.isFull = isFull;
        this.color = color;
        this.consoleArray = consoleArray;
    }    
}