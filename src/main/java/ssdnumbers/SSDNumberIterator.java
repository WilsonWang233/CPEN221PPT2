package ssdnumbers;

public interface SSDNumberIterator {

    /**
     * Is there another SSDNumber to iterate over?
     *
     * @return true if the iterator has not exhausted all the SSDNumbers it is
     *              iterating over and false if all SSDNumbers it is iterating
     *              over have been exhausted.
     *
     */
    public boolean hasNext();

    /**
     * Obtain the next SSDNumber.
     *
     * @return the next SSDNumber that needs to be iterated over.
     * @throws SSDIteratorDoneException if there are not further SSDNumbers.
     */
    public String next() throws SSDIteratorDoneException;

}
