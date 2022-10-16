package ssdnumbers;

import java.util.HashMap;
import java.util.Map;

public class minBag {
    private Map<Integer, Integer> bag = new HashMap<>();
    private Integer min;
    private int size;

    public minBag(){
        this.size = 0;
        this.min = 0;
    }

    //  R1 requires : (?)
    public void add(Integer v){
        if(bag.containsKey(v)){
            bag.put(v, bag.get(v)+1);
        }else {
            bag.put(v, 1);
            if (v < min){
                min = v;
            }
        }
        size += 1;
    }

    //  R2 requires : (?)
    //  R3 effects : (?)
    public void remove(Integer v){ //assume this function might throw a checked exception
        if(! bag.containsKey(v)){
            //throw a checked exception
        }
        Integer count = bag.get(v);
        if(count == 1){
            bag.remove(v);
        }else {
            bag.put(v, count--);
        }
        size -=1;
    }

    // R4 requires: ??
    // R5 returns: the minimum number in this bag
    public Integer getMin() {
        return min;
    }

    // R6 requires: ??
    // R7 returns: the size of this bag
    public int getSize() {
        return size;
    }

    // R8 requires: ??
    // R9 returns: the size of this bag
    public boolean isEmpty(){
        return this.size==0;
    }

}
