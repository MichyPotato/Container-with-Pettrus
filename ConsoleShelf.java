
//package unconsolable.seven;


public class ConsoleShelf{

    //fields for the shelf variable def (Michelle Luo)
    private double height;
    private int availableSpace;
    private boolean isFull;
    private String color;
    private Console[] consoleArray;

    //full constructor console shelf (Michelle Luo)
    public ConsoleShelf(double height, int availableSpace, boolean isFull, String color, Console[] consoleArray){
        this.height = height;
        this.availableSpace = availableSpace;
        this.isFull = isFull;
        this.color = color;
        this.consoleArray = consoleArray;
    }
}