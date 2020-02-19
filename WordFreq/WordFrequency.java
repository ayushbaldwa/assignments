import edu.duke.*;
import java.util.*;

/**
 * Write a description of class WordFrequency here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WordFrequency
{
    // instance variables - replace the example below with your own
    private ArrayList<String> myWords;
    private ArrayList<Integer> frequency;

    /**
     * Constructor for objects of class WordFrequency
     */
    public WordFrequency()
    {
        // initialise instance variables
        myWords = new ArrayList<String>();
        frequency = new ArrayList<Integer>();
    }
    
    public void findUnique(){
        FileResource resource = new FileResource();
        for(String s: resource.words()){
            s=s.toLowerCase();
            int index = myWords.indexOf(s);
            if(index==-1){
            myWords.add(s);
            frequency.add(1);
        }
        else{
            int value = frequency.get(index);
            frequency.set(index,value+1);
        }
    }
    }
    public void tester(){
        findUnique();
        System.out.println("Unique words: "+myWords.size());
        for(int freq=0;freq<myWords.size();freq++)
        System.out.println(frequency.get(freq)+" "+myWords.get(freq));
    }

    
}
