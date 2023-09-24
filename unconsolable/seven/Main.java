/* Michelle Luo and Pettrus Konnoth
 * AP CSA
 * UnConsolable: unconsolable.seven.Main
 * September 24th
 * Period 7
 */
package unconsolable.seven;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){



        //CRUD user input reader (Michelle Luo)
        Scanner userInputObject = new Scanner(System.in);
        System.out.println("Choose a CRUD Option for the Container:\n1. Create a new Console to be added to the shelf\n2. Read off all the Consoles on the Shelf\n3. Update a specific Console on the shelf\n4. Delete a Console from the shelf");
        int userInput = userInputObject.nextInt();
        switch (userInput) {
            case 1:
                //implement ConsoleShelf.create()
                break;
            case 2:
                // implement ConsoleShelf.read()
                break;
            case 3:
                //implement ConsoleShelf.update()
                break;
            case 4:
                //implement ConsoleShelf.delete()
                break;
            default:
                break;
        }


    }
}
