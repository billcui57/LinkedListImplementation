/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author 348848128
 */
public class Patient implements Comparable<Patient> {

    String firstName;
    String lastName;

    /**
     * Constructor for new patient
     * @param newFirstName first name
     * @param newLastName last name
     */
    public Patient(String newFirstName, String newLastName) {
        firstName = newFirstName;
        lastName = newLastName;
    }

    /**
     * Compares two patients in terms of last name
     * @param t other patient
     * @return same results as default compareTo
     */
    @Override
    public int compareTo(Patient t) {
        return lastName.compareTo(t.lastName);
    }

    /**
     * Tests if two patients are equal in value
     * @param o other 
     * @return whether or not they are equal
     */
    @Override
    public boolean equals(Object o) {
        //if comparing to itself
        if (o == this) {
            return true;
        }
        //if not a patient then obviously cant be equal
        if (!(o instanceof Patient)) {
             
            return false;
           
        }
        //if first and last name are both equal
        Patient cc = (Patient) o;
        return (this.firstName.equalsIgnoreCase(cc.firstName)) && (this.lastName.equalsIgnoreCase(cc.lastName));
    }

    /**
     * Returns the string form
     * @return the string form first name last name
     */
    @Override
    public String toString() {
        return lastName + " " + firstName;
    }

}
