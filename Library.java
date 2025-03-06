import java.util.ArrayList;
import java.util.Collections;

public class Library {
    private ArrayList<String> queue;

    public Library(){
        queue = new ArrayList<String>();
    }

    public void addItem(String item){
        queue.add(item);
    }

    public void removeItem(String item){
        queue.remove(item);
    }

    public String getNextItem(){
        return queue.getFirst();
    }

    public void skipNextItem(){
        queue.removeFirst();
    }

    public void sortAlphabetically(){
        queue.sort(null);
    }

    public int findItem(String item){
        /*if (!queue.contains(item))
            return "No song with this name in queue.";
        else*/
            return queue.indexOf(item);
    }

    public String toString(){
        return queue.toString();
    }

}
