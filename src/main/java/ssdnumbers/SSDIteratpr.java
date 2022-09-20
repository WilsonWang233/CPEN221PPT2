package ssdnumbers;

import java.util.List;

public class SSDIteratpr implements SSDNumberIterator {
    private final List<String> data;

    public SSDIteratpr(List<String> da){
        this.data=da;
    }

    @Override
    public boolean hasNext() {
        return data.size()>0;
    }

    @Override
    public String next() throws SSDIteratorDoneException {
        try {
            return data.remove(0);

        }catch (Exception e){
            throw new SSDIteratorDoneException();
        }
    }
}
