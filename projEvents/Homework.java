package projEvents;
import java.util.Date;

/**
 @author: Ayden Martin
 @Version: 1.0
 */
public class Homework extends Events{

    /** Homework objects turn in place */
    String turnInPlace;

    /** What class this homework Object was made for */
    String classFor;

    /** How many points user got on homework Object */
    int gradeGot;

    /** What was the possible points homework object is out of */
    int gradeOut;

    /**
     @param
     name: The name of the homework assignment, extended from Events
     details: What is the homework assignment about, extended from Events
     due: When should this homework assignment be turned in, extended from Events
     turnInPlace: Where should this homework assignment be turned in
     classFor: What class is this homework assignment for
     @return none
     */
    public Homework(String name, String details, Date due, String turnInPlace, String classFor){
        setName(name);
        setDetails(details);
        setDue(due);
        setturnInPlace(turnInPlace);
        setclassFor(classFor);
    }

    /** Default constructor of Homework object */
    public Homework(){}

    /**
     @param
     name: The name of the homework assignment, extended from Events
     details: What is the homework assignment about, extended from Events
     due: When should this homework assignment be turned in, extended from Events
     turnInPlace: Where should this homework assignment be turned in
     classFor: What class is this homework assignment for
     gradeOut: How many points are possible to get in this homework assignment
     @return none
     */
    public Homework(String name, String details, Date due, String turnInPlace, String classFor,int gradeOut){
        setName(name);
        setDetails(details);
        setDue(due);
        setturnInPlace(turnInPlace);
        setclassFor(classFor);
        setgradeOut(gradeOut);
    }


    /**
     @param none
     @return turnInPlace: Where should this homework assignment be turned in
     */
    public String getturnInPlace() {
        return turnInPlace;
    }
    /**
     @param none
     @return classFor: What class is this homework assignment for
     */
    public String getclassFor() {
        return classFor;
    }
    /**
     @param none
     @return gradeGot: How many points the user got in this homework assignment
     */
    public int gradeGot() {
        return gradeGot;
    }
    /**
     @param none
     @return gradeOut: How many points are possible to get in this homework assignment
     */
    public int gradeOut(){
        return gradeOut;
    }

    /**
     @param turnInPlace: sets Where should this homework assignment be turned in
     @return none
     */
    public void setturnInPlace(String turnInPlace) {
        this.turnInPlace = turnInPlace;
    }
    /**
     @param classFor: sets What class is this homework assignment for
     @return none
     */
    public void setclassFor(String classFor) {
        this.classFor = classFor;
    }
    /**
     @param gradeGot: Sets How many points the user got in this homework assignment
     @return none
     */
    public void setgradeGot(int gradeGot) {
        this.gradeGot = gradeGot;
    }
    /**
     @param gradeOut: Sets How many points are possible to get in this homework assignment
     @return none
     */
    public void setgradeOut(int gradeOut){
        this.gradeOut = gradeOut;
    }
}
