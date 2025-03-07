import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;
//Imports ArrayLists, Comparators, and Random
//Comparators are used for .sort() and Random for shuffling

public class Library {
    //Private class variable for the song list
    private ArrayList<String> queue;

    public Library(){
        //Class constructor, setting up a new ArrayList that can hold strings
        queue = new ArrayList<String>();
    }

    public void addItem(String item){
        //Uses .add() to add a user submitted item
        queue.add(item);
    }

    public void removeItem(String item){
        //Uses .remove() to remove a user submitted item
        queue.remove(item);
    }

    public String getNextItem(){
        //Uses .getFirst() to show the user the first song in the list
        return queue.getFirst();
    }

    public void skipNextItem(){
        //Uses .removeFirst() to "skip" the next song (item)
        queue.removeFirst();
    }

    public void sortAlphabetically(){
        //Uses the .sort() method of ArrayLists to compare strings s1 and s2. which are each
        //one respective item. It then specifically compares s1 to s2, ignoring uppercase or lowercase
        queue.sort((s1, s2) -> s1.compareToIgnoreCase(s2));
    }

    public ArrayList<String> shuffle(){
        //This is almost the exact same shuffle method from my Game of Cut
        Random rand = new Random();
        //Makes a new random variable
        for(int k = 0; k<=queue.size(); k++){
            //Selects two random cards and swaps their position using a temporary variable
            int random = rand.nextInt(queue.size());
            int random2 = rand.nextInt(queue.size());
            String temp = queue.get(random);
            String temp2 = queue.get(random2);
            //The main difference is, because ArrayLists are actually mutable, I can just use
            //the .set() method to switch around spots.
            queue.set(random, temp2);
            queue.set(random2, temp);
        }
        return queue;
    }

    public Integer findItem(String item){
        //Checks if the queue contains an item. If it does, return the position of that item in the queue.
        //If it doesn't, return null so the main program can tell the user that the song doesnt exist.
        if (!queue.contains(item))
            return null;
        else
            return queue.indexOf(item)+1;
    }

    public String toString(){
        //Makes a library return the same thing as an ArrayList would, instead of the memory address of the Library
        return queue.toString();
    }

}
