
package model;

/**
 *
 * @author Devin Walter
 */
public class HappyDayLog {
    private String email, first, last, user, month;
    private int year;
    public HappyDayLog(){
        email = "";
        first = "";
        last = "";
        user = "";
        month = "";
        year = 0;
    }
    
    public HappyDayLog(String email, String first, String last, String user, String month, int year){
        email = this.email;
        first = this.first;
        last = this.last;
        user = this.user;
        month = this.month;
        year = this.year;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirst() {
        return first;
    }

    public void setFirst(String first) {
        this.first = first;
    }

    public String getLast() {
        return last;
    }

    public void setLast(String last) {
        this.last = last;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    
}
