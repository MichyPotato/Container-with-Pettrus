/* Michelle Luo and Pettrus Konnoth
 * AP CSA
 * UnConsolable: unconsolable.seven.Main
 * September 24th
 * Period 7
 */
package unconsolable.seven;
import java.util.Scanner;

public class Main {

    private static int getUserInputForIndex(String message) {
        Scanner inputScanner = new Scanner(System.in);
        System.out.print(message);
        return inputScanner.nextInt();
    }

    public static void main(String args[]) {
        // Create a ConsoleShelf object
        ConsoleShelf consoleShelf = new ConsoleShelf();

        Scanner userInputObject = new Scanner(System.in);
        int userInput;

        do {
            System.out.println("Choose a CRUD Option for the Container:");
            System.out.println("1. Create a new Console to be added to the shelf");
            System.out.println("2. Read off all the Consoles on the Shelf");
            System.out.println("3. Update a specific Console on the shelf");
            System.out.println("4. Delete a Console from the shelf");
            System.out.println("5. Exit");

            userInput = userInputObject.nextInt();

            switch (userInput) {
                case 1 -> {
                    // Implement ConsoleShelf.create()
                    Scanner inputScanner = new Scanner(System.in);

                    System.out.print("Enter the name of the console: ");
                    String name = inputScanner.nextLine();

                    System.out.print("Enter the brand of the console (XBOX, PLAYSTATION, NINTENDO, ATARI, SEGA, META): ");
                    String brandStr = inputScanner.nextLine();

                    Brand brand = Brand.valueOf(brandStr.toUpperCase());

                    System.out.print("Enter the storage capacity of the console: ");
                    double storage = 0;
                    if (inputScanner.hasNextDouble()) {
                        storage = inputScanner.nextDouble();
                    }

                    System.out.print("Enter the energy consumption of the console: ");
                    int energyConsumption = 0;
                    if (inputScanner.hasNextInt()) {
                        energyConsumption = inputScanner.nextInt();
                    }

                    System.out.print("Does it have a color display (true/false): ");
                    boolean hasColorDisplay = false;
                    if (inputScanner.hasNextBoolean()) {
                        hasColorDisplay = inputScanner.nextBoolean();
                    }

                    Console newConsole = new Console(name, brand, storage, energyConsumption, hasColorDisplay);
                    consoleShelf.createConsole(newConsole); // Add the new console to the shelf
                    System.out.println("Console added to the shelf.");
                }

                case 2 -> {
                    // Implement ConsoleShelf.read()
                    consoleShelf.readConsole(); // Display all consoles on the shelf
                }

                case 3 -> {
                    // Implement ConsoleShelf.update()
                    int indexToUpdate = getUserInputForIndex("Enter the index of the console to update: ");
                    if (indexToUpdate >= 0 && indexToUpdate < consoleShelf.getAvailableSpace()) {
                        // Proceed with the update logic here
                    } else {
                        System.out.println("Invalid index. No console updated.");
                    }
                }

                case 4 -> {
                    // Implement ConsoleShelf.delete()
                    int indexToDelete = getUserInputForIndex("Enter the index of the console to delete: ");
                    if (indexToDelete >= 0 && indexToDelete < consoleShelf.getAvailableSpace()) {
                        consoleShelf.delete(indexToDelete); // Delete the console from the shelf
                        System.out.println("Console deleted from the shelf.");
                    } else {
                        System.out.println("Invalid index. No console deleted.");
                    }
                }

                case 5 -> System.out.println("Exiting the program.");

                default -> System.out.println("Invalid choice. Please enter a valid option.");
            }
        } while (userInput != 5);
    }
}
