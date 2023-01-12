/*
======================================================================================================================
PROGRAM PURPOSE: The purpose of Die.java is to implement a class Die that contains the variables numSides(int),
                primaryColor(String), secondaryColor(String), numColor(String), and sideValues(int[]). The class is to
                contain a constructor for creating instances of Die as well as getters and setters for each class
                variable. Additionally, a method roll() is to be implemented, which returns a random element from the
                array sideValues.

Name: John Daggs
Date: 2/18/2022
Section: CSC 331-002
======================================================================================================================
*/
import java.util.Arrays;

public class Die {

    // class variables

    private int numSides; // number of sides
    private String primaryColor;
    private String secondaryColor;
    private String numColor; // color of numbers on Die
    private int[] sideValues; // array to contain values of the sides of the die



    // Constructor

    public Die(int numSides, String primaryColor, String secondaryColor, String numColor, int[] sideValues){
        this.numSides = numSides;
        this.primaryColor = primaryColor;
        this.secondaryColor = secondaryColor;
        this.numColor = numColor;
        this.sideValues = sideValues;
    }
    // Mutators (setters)

    public void setNumSides(int numSides){
        this.numSides = numSides;
    }

    public void setPrimaryColor(String primaryColor){
        this.primaryColor = primaryColor;
    }

    public void setSecondaryColor(String secondaryColor){
        this.secondaryColor = secondaryColor;
    }

    public void setNumColor(String numColor) {
        this.numColor = numColor;
    }

    public void setSideValues(int[] sideValues) {
        this.sideValues = sideValues;
    }

    //Accessors (getters)

    public int getNumSides() {
        return this.numSides;
    }

    public String getPrimaryColor(){
        return this.primaryColor;
    }

    public String getSecondaryColor(){
        return this.secondaryColor;
    }

    public String getNumColor(){
        return this.numColor;
    }

    public int[] getSideValues(){
        return this.sideValues;
    }

    /**
     Returns a random element from array sideValues
     */
    public int roll(){
        int [] array = this.sideValues;
        int randomElement = array[(int) Math.floor(Math.random() * array.length)];
        return randomElement;
    }

    /**
     * Overriding the toString method for the class Die.
     *
     */

    public String toString(){
        return String.format(
                "%s%n%-15s%-20s%n%-15s%-20s%n%-15s%-20s%n%-15s%-20s%n%-15s%-20s%n",
                "DICE INFO: ",
                "Number of Sides: ", numSides,
                "Primary Color: ", primaryColor,
                "Secondary Color: ", secondaryColor,
                "Number of Colors: ", numColor,
                "Side Values: ", Arrays.toString(sideValues));

    }
}

