/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author Charan
 */
public class Time {
    private String start;
    private String end;
    private boolean isAvailable;
    public Time(String start, String end) {
        this.start = start;
        this.end = end;
        this.isAvailable = true; 
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public boolean isIsAvailable() {
        return isAvailable;
    }

    public void setIsAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    
    @Override
    public String toString() {
        return this.start+":00 - "+this.end+":00";
    }
}
