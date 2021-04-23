package InterfaceExamples;

import java.util.Arrays;

public class MSAIIDate implements Comparable<MSAIIDate> {

    public final int year;
    public final int month;
    public final int day;

    public MSAIIDate(int y, int m, int d) {
        this.year = y;
        this.month = m;
        this.day = d;
    }

    public int compareTo(MSAIIDate other) {
        if (this.year  < other.year)  return -1;
        if (this.year  > other.year)  return 1;
        if (this.month < other.month) return -1;
        if (this.month > other.month) return 1;
        if (this.day   < other.day)   return -1;
        if (this.day   > other.day)   return 1;
        return 0;
    }
    
    public String toString() {
        return "DATE[" + this.year + "," + this.month + "," + this.day + "]";
    }

    /**
     * Examples of how these conparables can be userful
     */

    public static void main(String[] args) {
        MSAIIDate d0 = new MSAIIDate(2009, 5, 10);
        MSAIIDate d2 = new MSAIIDate(2015, 2, 10);
        MSAIIDate d1 = new MSAIIDate(2012, 9, 10);
        MSAIIDate d3 = new MSAIIDate(2010, 3, 10);
        MSAIIDate d4 = new MSAIIDate(2016, 9, 10);
        MSAIIDate d5 = new MSAIIDate(2013, 12, 10);
        MSAIIDate d6 = new MSAIIDate(2014, 11, 10);
        MSAIIDate d7 = new MSAIIDate(2011, 1, 10);

        MSAIIDate[] dates = { d0, d1, d2, d3, d4, d5, d6, d7 };

        System.out.println("PRINTING UNSORTED DATES");
        for (MSAIIDate d : dates)
            System.out.print(d + " ");

        Arrays.sort(dates);

        System.out.println("\nPRINTING SORTED DATES");
        for (MSAIIDate d : dates)
        System.out.print(d + " ");
        
         
     }
}
