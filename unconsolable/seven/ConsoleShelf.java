/* Michelle Luo and Pettrus Konnoth
 * AP CSA
 * UnConsolable: unconsolable.seven.Main
 * September 24th
 * Period 7
 */
package unconsolable.seven;

import java.util.Arrays;

public class ConsoleShelf{

    //fields for the shelf variable def (Michelle Luo)
    private double height;
    private int availableSpace;
    private boolean isFull;
    private String color;
    private Console[] consoleArray;

    //set up initial consoleArray with empty values (Michelle Luo)
    public Console[] consoleInitialization(){
        Console[] consoleArray = new Console[12]; //need to fill with empty values maybe??????????????????
        return consoleArray;
    }
    
    //default constructor console shelf (Pettrus Konnoth)
    public ConsoleShelf(){
        this.height = 0;
        this.availableSpace = 0;
        this.isFull = false;
        this.color = "black";
        this.consoleArray = consoleInitialization();
    }

    //partial constructor console shelf (Pettrus Konnoth)
    public ConsoleShelf(double height){
        this.height = height;
        this.availableSpace = 0;
        this.isFull = false;
        this.color = "black";
        this.consoleArray = consoleInitialization();
    }

    //full constructor console shelf (Michelle Luo)
    public ConsoleShelf(double height, int availableSpace, boolean isFull, String color, Console[] consoleArray){
        this.height = height;
        this.availableSpace = availableSpace;
        this.isFull = isFull;
        this.color = color;
        this.consoleArray = consoleInitialization();
    }

    // toString method (Pettrus Konnoth)
    @Override
    public String toString(){
        return "This shelf is " +
                this.height + " inches tall, has " +
                this.availableSpace + " spaces left, is " +
                this.isFull + " and is " +
                this.color + ".";
    }







}