package ssdnumbers;

import java.util.*;

public class charList {
    private List<Character> chars;
    private Map<Character, Integer> frequency = null;

    /*
    RI
    -- all element of the chars List are not null
    if frequency is not null, then frequency (char) should return the number of time the char occurs
     */
    public charList(List<Character> chars){
        this.chars = chars;
    }

    public void unique(){
        Set<Character> uniqueChar = new HashSet<Character>();
        for(Character c : this.chars) uniqueChar.add(c);
        this.chars = new ArrayList<Character>(uniqueChar);
    }

//    public charList allCapitalized(){
//        List<Character> newChars = new ArrayList<>();
//        for(Character c : this.chars) newChars.add(c.toUpperCase());
//        return new charList(newChars);
//    }
    public charList merge(List<Character> chars){
        for(Character c : chars) chars.add(c);
        return this;
    }

    public Map<Character, Integer> getFrequency(){
        if(this.frequency != null){
            return frequency;
        }
        this.frequency = new HashMap<Character, Integer>();
        for(Character c : this.chars){
            if(! this.frequency.containsKey(c)) this.frequency.put(c, 0);
            int pf = this.frequency.get(c);
            this.frequency.put(c, pf+1);
        }
        return this.frequency;
    }
}
