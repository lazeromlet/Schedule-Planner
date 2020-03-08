package projEvents;
import java.util.Date;

/**
 @author: Ayden Martin
 @Version: 1.0
 */


public class Events{

    /** name: The name of the Event */
    String name;
    /** details: Details of this Event */
    String details;
    /** due: When will this Event occur */
    Date due;

    /**
     @param
     name: The name of the event
     details: What is the event about
     due: When is the vent happening
     @return none
     */
    public Events(String name, String details, Date due){
        setDetails(details);
        setName(name);
        setDue(due);
    }

    /** Default constructor of Events */
    public Events(){}

    /**
     @param none
     @return due: This is when the Event is going to happen
     */
    public Date getDue() {
        return this.due;
    }

    /**
     @param none
     @return details: This desscribes what the Event is about
     */
    public String getDetails() {
        return this.details;
    }

    /**
     @param none
     @return turnInPlace: Where should this homework assignment be turned in
     */
    public String getName() {
        return this.name;
    }

    /**
     @param details: Sets the details of this Event
     @return none
     */
    public void setDetails(String details) {
        this.details = details;
    }

    /**
     @param due: Sets when this variable will occur
     @return none
     */
    public void setDue(Date due) {
        this.due = due;
    }

    /**
     @param name: Sets what this Event is called
     @return none
     */
    public void setName(String name) {
        this.name = name;
    }
}