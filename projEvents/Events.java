package projEvents;


import java.util.Date;

public class Events {

    String name;
    String details;
    Date due;

    public Date getDue() {
        return this.due;
    }

    public String getDetails() {
        return this.details;
    }

    public String getName() {
        return this.name;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setDue(Date due) {
        this.due = due;
    }

    public void setName(String name) {
        this.name = name;
    }
}
