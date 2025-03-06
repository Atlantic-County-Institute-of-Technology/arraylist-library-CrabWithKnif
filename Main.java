import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Library songList = new Library();
        Scanner scan = new Scanner(System.in);
        boolean running = true;
        songList.addItem("Just Lean");
        songList.addItem("Plazma");
        songList.addItem("a");
        songList.addItem("b");
        songList.addItem("c");
        System.out.println(songList);
        while(running){
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
            int choice = scan.nextInt();
            if(choice==1) {
                System.out.println("Now playing: " + songList.getNextItem());
                songList.skipNextItem();
            }
            else if (choice==5) {
                System.out.println(songList + "\n");
            }
            else if (choice==6) {
                songList.sortAlphabetically();
            }
            else if (choice == 0)
                running = false;
        }
    }
}
