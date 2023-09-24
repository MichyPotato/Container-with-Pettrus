/* Michelle Luo and Pettrus Konnoth
 * AP CSA
 * UnConsolable: unconsolable.seven.Main
 * September 14th
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


    //default constructor console shelf (Pettrus Konnoth)
    public ConsoleShelf(){
        this.height = 0;
        this.availableSpace = 0;
        this.isFull = false;
        this.color = "black";
        this.consoleArray = new Console[shelfSize];
    }

    //partial constructor console shelf (Pettrus Konnoth)
    public ConsoleShelf(double height){
        this.height = height;
        this.availableSpace = 0;
        this.isFull = false;
        this.color = "black";
        this.consoleArray = new Console[shelfSize];
    }

    //full constructor console shelf (Michelle Luo)
    public ConsoleShelf(double height, int availableSpace, boolean isFull, String color, Console[] consoleArray){
        this.height = height;
        this.availableSpace = availableSpace;
        this.isFull = isFull;
        this.color = color;
        this.consoleArray = new Console[shelfSize];
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