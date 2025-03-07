import java.util.Scanner;
//Imports the scanner class
public class Main {
    public static void main(String[] args) {
        //Initiates a new library for the song queue
        Library songList = new Library();
        //Sets up a scanner for integers and a scanner for strings
        Scanner scanI = new Scanner(System.in);
        Scanner scanS = new Scanner(System.in);
        //Set up a boolean variable to determine if the program should still be running.
        //Will be set to false if the user chooses to quit
        boolean running = true;
        while(running){
            //Creates a menu for the user using print statements
            System.out.println("1. Play Song");
            System.out.println("2. Skip Song");
            System.out.println("3. Add Song");
            System.out.println("4. Remove Song");
            System.out.println("5. Display Queue");
            System.out.println("6. Sort by Alphabet");
            System.out.println("7. Shuffle Queue");
            System.out.println("8. Find Song");
            System.out.println("0. Exit");
            System.out.println("Welcome to your queue! What would you like to do?");
            //Uses the int scanner to look for user choice
            int choice = scanI.nextInt();
            if(choice==1) {
                //Creates a variable to hold the first song on the list, and then displays it to the user.
                //Then, utilizes the skip code to pop it out of the list
                String currentlyPlaying = songList.getNextItem();
                System.out.println("Now playing: " + currentlyPlaying);
                songList.skipNextItem();
            }
            else if (choice==2){
                //Exact same as above, but just implies skipping instead of playing
                String skipped = songList.getNextItem();
                System.out.println("You skipped: " + skipped);
                songList.skipNextItem();
            }
            else if (choice==3){
                //Lets the user add any string of text as a song
                System.out.println("What song would you like to add?");
                songList.addItem(scanS.nextLine());
            }
            else if (choice==4){
                //Asks the user for a song name to remove, nd just moves on if there is no song by that name
                System.out.println("What song would you like to remove (song name)?");
                songList.removeItem(scanS.nextLine());
            }
            else if (choice==5) {
                //Prints the current queue
                System.out.println(songList + "\n");
            }
            else if (choice==6) {
                //Sorts the list alphabetically
                songList.sortAlphabetically();
            }
            else if (choice==7){
                //Shuffles all current items in the list.
                songList.shuffle();
            }
            else if (choice==8){
                //Initiates an Integer variable to hold the song position, and then checks if it is null.
                //If it returns null, tell the user that there is no song by that name
                System.out.println("What song would you like to know the position of?");
                Integer pos = songList.findItem(scanS.nextLine());
                if (pos == null)
                    System.out.println("That song is not in queue");
                else
                    System.out.println("That song is at position " + pos + " in queue.");
            }
            else if (choice == 0)
                //Sets the running variable to false, stopping the program
                running = false;
            else
                System.out.println("Please choose an option!");
        }
    }
}
