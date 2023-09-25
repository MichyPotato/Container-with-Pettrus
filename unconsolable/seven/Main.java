/* Michelle Luo and Pettrus Konnoth
 * AP CSA
 * UnConsolable: unconsolable.seven.Main
 * September 24th
 * Period 7
 */

// imports
package unconsolable.seven;
import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        //create new ConsoleShelf with FULL constructor (Michelle Luo)
        Console noBrandConsole = new Console();
        Console[] noBrandConsoles = {noBrandConsole, noBrandConsole, noBrandConsole, noBrandConsole, noBrandConsole, noBrandConsole, noBrandConsole, noBrandConsole, noBrandConsole, noBrandConsole, noBrandConsole, noBrandConsole};
        ConsoleShelf shelfOfMichelle = new ConsoleShelf(1.8, 6, false, "perwrinkle blue", noBrandConsoles);

        //Initial Menu user input reader (Michelle Luo)
        Scanner userInputScanner1 = new Scanner(System.in);
        System.out.println("Choose a Menu Option for the Shelf:\n1. Print Shelf Attributes\n2. CRUD on Consoles on the Shelf\n3. Quit Application");
        int userInput1 = userInputScanner1.nextInt();
        switch (userInput1) {
            case 1:
                //Case 1: toString of Console Shelf
                System.out.println(shelfOfMichelle);
                break;
            case 2:
                //Case 2: go to CRUD
                //CRUD user input reader (Michelle Luo)
                Scanner userInputScanner2 = new Scanner(System.in);
                System.out.println("Choose a CRUD Option for the Container:\n1. Create a new Console to be added to the shelf\n2. Read off all the Consoles on the Shelf\n3. Update a specific Console on the shelf\n4. Delete a Console from the shelf");
                int userInput2 = userInputScanner2.nextInt();
                switch (userInput2) {
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
                userInputScanner2.close();
                break;
            case 3:
                //Case 3: QUIT APPLICATION
                break;
            default:
                break;
        }
        userInputScanner1.close();

    }
}
