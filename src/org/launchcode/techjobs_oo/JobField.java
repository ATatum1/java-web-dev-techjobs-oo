package org.launchcode.techjobs_oo;

import java.util.Objects;

public abstract class JobField {

    private int id;
    private static int nextId = 1;
    private String value;

    public JobField() {
        id = nextId;
        nextId++;
    }

    public JobField(String aValue) { //forked code had (String value) updated code
        this();
        this.value = aValue; // forked code had this.value=value; updated code
    }


    // Custom toString, equals, and hashCode methods:

    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof JobField)) return false;
        JobField jobfield = (JobField) o;
        return getId() == jobfield.getId();
    }

    @Override
    public int hashCode() {return Objects.hash(getId());}




    // Getters and Setters:

    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
