import java.util.Arrays;

import InterfaceExamples.*;

public class ComparisonSearch<T extends Comparable<T>>{


    /**
     * This is a general find function
     * that works in o(n) time complexity
     * with o(1) space. This is a counter
     * example to the more efficient o(lg n) 
     * binary search
     * 
     * @param <T> allows to be called for different classes which are comparable
     * @param items an array of comparables
     * @return index of item found, -1 if item is not found
     */
    public int search(T[] items, T item) {
        for(int i = 0; i < items.length; i++)
            if(items[i].compareTo(item) == 0)
                return i;
        return -1;
    }
    

    /**
     * This is a general binary search
     * function that works in o(lg n) time
     * complexity and o(1) space complexity
     * 
     * @param <T> allows to be called for different classes which are comparable
     * @param items an array of comparables
     * @return index of item found, -1 if item is not found
     */
    public int binarySearch(T[] items, T item) {
        int left = 0, right = items.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;
            if (item.compareTo(items[mid]) < 0)
                right = mid - 1;
            else if (item.compareTo(items[mid]) > 0)
                left = mid + 1;
            else return mid;
        }
        return -1;
    }


    public static void main(String[] args) {
        MSAIIDate d0 = new MSAIIDate(2009, 5, 10);
        MSAIIDate d1 = new MSAIIDate(2010, 5, 10);
        MSAIIDate d2 = new MSAIIDate(2011, 5, 10);
        MSAIIDate d3 = new MSAIIDate(2012, 5, 10);
        MSAIIDate d4 = new MSAIIDate(2013, 5, 10);
        MSAIIDate d5 = new MSAIIDate(2014, 5, 10);
        MSAIIDate d6 = new MSAIIDate(2015, 5, 10);
        MSAIIDate d7 = new MSAIIDate(2016, 5, 10);

        MSAIIDate[] dates = { d0, d1, d2, d3, d4, d5, d6, d7 };

        MSAIIDate toFind = new MSAIIDate(2014, 5, 10);
        MSAIIDate shouldNotBeFound = new MSAIIDate(2009, 1, 1);

        ComparisonSearch<MSAIIDate> finder = new ComparisonSearch<MSAIIDate>();

        Arrays.sort(dates);

        System.out.println("Should be  5: " + finder.search(dates, toFind));
        System.out.println("Should be -1: " + finder.search(dates, shouldNotBeFound));

    };
}
