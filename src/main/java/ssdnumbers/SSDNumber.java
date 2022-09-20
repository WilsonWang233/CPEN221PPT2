package ssdnumbers;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class SSDNumber {

    /********** Task 1 **********/

    public static boolean isSemiSelfDescriptive(String intAsString) {
        //this works if digit  together or (not) together i.e. "33322" together, "32323" not together
        List<Character> value = new ArrayList<>();
        for (int i = 0; i < intAsString.length(); i++) {
            if (!value.contains(intAsString.charAt(i))) {
                value.add(intAsString.charAt(i));
            }
        }
        for(char c : value){
            if(Integer.toString(countOccuranve(intAsString,c)).charAt(0) != c){
                return false;
            }
        }
        return true;
    }
    private static int countOccuranve(String intAsString,Character aChar){
        int count = 0;
        for (int i = 0; i < intAsString.length(); i++) {
            if (intAsString.charAt(i) == aChar) {
                count++;
            }
        }
        return count;
    }


    /********** Task 2 **********/

    /**
     * Obtain the largest SSDNumber (as a String) with {@code numDigits} digits that
     * contains the digit {@code mustContainDigit}.
     * @param numDigits the number of digits in the SSDNumber, {@code numDigits} > 0
     * @param mustContainDigit a digit that must be present in the number being generated, 0 <  {@code mustContainDigit} < 10
     * @return the largest SSDNumber (as a String) with {@code numDigits} digits
     *          that contains the digit {@code mustContainDigit}
     * @throws NoSuchElementException if no such SSDNumber exists
     */
    public static String getLargestSSDNumber(int numDigits, int mustContainDigit)
                                            throws NoSuchElementException {
        String strResult = "";
        List<Integer> result = new ArrayList<>();
        if(numDigits<mustContainDigit){
            throw new NoSuchElementException();
        }

        int reminder  = numDigits-mustContainDigit;



        for(int i = 9; i>0;i--){
            if (i == mustContainDigit){
                for(int j = 0; j< mustContainDigit;j++){
                    result.add(mustContainDigit);
                }
            }else if(reminder-i>=0 && !result.contains(i)){
                for(int j = 0; j< i;j++){
                    result.add(i);
                }
                reminder -= i;
            }
        }
        for(Integer i : result){
            strResult += i;
        }
        if(!isSemiSelfDescriptive(strResult)|| strResult.length()<numDigits){
            throw new NoSuchElementException();
        }
        return strResult;
    }


    /********** Task 3 **********/

    /**
     * Obtain an iterator that iterates over all SSDNumbers of a given length
     * (specified by {@code numDigits}), starting with the smallest such
     * number and going up to the largest such number.
     *
     * @param numDigits the number of digits in the SSDNumbers we are iterating over,
     *                  {@code numDigits} > 0
     * @return an iterator that iterates over all SSDNumbers of a given length
     *      (specified by {@code numDigits}), starting with the smallest such
     *      number and going up to the largest such number.
     */
    public static SSDNumberIterator getSSDNumberIterator(int numDigits) {
        // TODO: Implement this method
        List<String> abab = new ArrayList<>();
        for(int i = 1; i<numDigits;i++){
            try{
                String result = getLargestSSDNumber(numDigits,i);
                if(!abab.contains(result)){
                    abab.add(result);
                }
                abab.add(result);
                String reverse = "";
                char ch;
                for (int j=0; j<result.length(); j++)
                {
                    ch= result.charAt(i); //extracts each character
                    reverse+= ch; //adds each character in front of the existing string
                }

                if(!abab.contains(reverse)){
                    abab.add(reverse);
                }
            }catch (Exception e){
                //do nothing
            }
        }

        return new SSDIteratpr(abab);
    }

}
