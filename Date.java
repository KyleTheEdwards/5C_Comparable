/**
  Represent a date
 */
public class Date implements Comparable{
    private int y,m,d;
    

    // -------- previously-written code --------
    // constructor
    public Date( int y, int m, int d) {
        this.y = y;
        this.m = m;
        this.d = d;
    }
    
    /**
      @return a string representation of this instance
     */
    public String toString() {
        // ISO 8601 rules!
        return String.format("%4d-%02d-%02d",y, m, d);
    }

    public int getYear(){
        return y;
    }

    public int getMonth(){
        return m;
    }

    public int getDay(){
        return d;
    }

    public int compareTo(Object otherObj){
        Date otherDate = (Date)otherObj;

        if(y > otherDate.getYear() || m > otherDate.getMonth() || d > otherDate.getDay()) return 1;
        else if(y == otherDate.getYear() && m == otherDate.getMonth() && d == otherDate.getDay()) return 0;
        else return -1;


    }

}