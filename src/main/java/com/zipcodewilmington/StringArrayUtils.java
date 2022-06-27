package com.zipcodewilmington;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {
        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {
        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].equals(value)) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String tmp;
        // modify array in-place
        for (int i = 0; i < array.length / 2; i++) {
            tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;
        }
        return array;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        for (int i = 0; i < array.length / 2; i++) {
            if (!array[i].equals(array[array.length -1 - i])) {
                return false;
            }
        }
        return true;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        Set<Character> alpha = new HashSet<>(26);

        for (String str : array) {
            for (int i =0; i < str.length(); i++) {
                String lowerStr = str.toLowerCase();
                char c = lowerStr.charAt(i);
                if (Character.isLetter(c)) {
                    alpha.add(lowerStr.charAt(i));
                }
            }
        }
        if (alpha.size() == 26) {
            return true;
        }
        return false;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        int counter = 0;
        for (String str : array) {
            if (str.equals(value)) {
                counter++;
            }
        }
        return counter;
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        ArrayList<String> arrL = new ArrayList<String>();

        for (String str : array) {
            if (!str.equals(valueToRemove)) {
                arrL.add(str);
            }
        }
        return arrL.toArray(new String[arrL.size()]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        ArrayList<String> arrL = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                arrL.add(array[i]);
                continue;
            }
            if (!array[i].equals(array[i - 1])) {
                arrL.add(array[i]);
            }
        }
        return arrL.toArray(new String[(arrL.size())]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        ArrayList<String> arrL = new ArrayList<>();
        int p = 0;
        int listP = 0;
        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                arrL.add(array[i]);
                continue;
            }
            if (array[p].equals(array[i])) {
                arrL.set(listP, arrL.get(listP) + array[i]);
            } else {
                p = i;
                arrL.add(array[i]);
                listP = arrL.size() - 1;
            }
        }
        return arrL.toArray(new String[arrL.size()]);
    }


}
