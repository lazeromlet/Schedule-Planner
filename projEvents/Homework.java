package projEvents;

import java.util.Date;

public class Homework extends Events {
    String turnInPlace;
    String classFor;
    int gradeGot;
    int gradeOut;

    public Homework(String name, String details, Date due, String turnInPlace, String classFor) {
        setName(name);
        setDetails(details);
        setDue(due);
        setturnInPlace(turnInPlace);
        setclassFor(classFor);
    }

    public Homework() {
    }

    public Homework(String name, String details, Date due, String turnInPlace, String classFor, int gradeOut) {
        setName(name);
        setDetails(details);
        setDue(due);
        setturnInPlace(turnInPlace);
        setclassFor(classFor);
        setgradeOut(gradeOut);
    }


    /*
    Bunch of get methods to return attributes of homework specific events
    */
    public String getturnInPlace() {
        return turnInPlace;
    }

    public String getclassFor() {
        return classFor;
    }

    public int gradeGot() {
        return gradeGot;
    }

    public int gradeOut() {
        return gradeOut;
    }

    /*
    Bunch of get methods to set attributes of homework specific events
    */
    public void setturnInPlace(String turnInPlace) {
        this.turnInPlace = turnInPlace;
    }

    public void setclassFor(String classFor) {
        this.classFor = classFor;
    }

    public void setgradeGot(int gradeGot) {
        this.gradeGot = gradeGot;
    }

    public void setgradeOut(int gradeOut) {
        this.gradeOut = gradeOut;
    }
}
