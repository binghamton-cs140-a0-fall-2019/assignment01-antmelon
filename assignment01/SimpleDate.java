package assignment01;

public class SimpleDate{
    private int day;
    private int month;
    private int year;
    public SimpleDate(int yr, int m, int d){
        day = d;
        month = m;
        year = yr;
    }

    public static SimpleDate of(int yr, int m, int d){
        SimpleDate returnValue = new SimpleDate(yr, m, d);
        return returnValue;
    }

    public boolean before(SimpleDate other){
        if(this.year < other.year){
            return true;
        }
        else if(this.month < other.month){
            return true;
        }
        else if(this.day < other.day){
            return true;
        }
        else{
            return false;
        }
    }
}
