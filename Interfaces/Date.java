package Interfaces;

import java.util.Arrays;

public class Date implements Comparable<Date> {

    public final int year;
    public final int month;
    public final int day;

    public Date(int y, int m, int d) {
        this.year = y;
        this.month = m;
        this.day = d;
    }

    public int compareTo(Date other) {
        if (this.year < other.year)
            return -1;
        if (this.year > other.year)
            return 1;
        if (this.month < other.month)
            return -1;
        if (this.month > other.month)
            return 1;
        if (this.day < other.day)
            return -1;
        if (this.day > other.day)
            return 1;
        return 0;
    }
    
    public String toString() {
        return "DATE[" + this.year + "," + this.month + "," + this.day + "]";
    }



    public static void main(String[] args) {
        Date d0 = new Date(2009, 5, 10);
        Date d1 = new Date(2015, 2, 10);
        Date d2 = new Date(2012, 9, 10);
        Date d3 = new Date(2010, 3, 10);
        Date d4 = new Date(2016, 9, 10);
        Date d5 = new Date(2013, 12, 10);
        Date d6 = new Date(2014, 11, 10);
        Date d7 = new Date(2011, 1, 10);

        Date[] dates = { d0, d1, d2, d3, d4, d5, d6, d7 };
        
        for( Date d : dates)
            System.out.print(d + " ");

        Arrays.sort(dates);

        System.out.println("\nSORTED ORDER\n");
        
        for( Date d : dates)
            System.out.print(d + " ");
         
     }
}
