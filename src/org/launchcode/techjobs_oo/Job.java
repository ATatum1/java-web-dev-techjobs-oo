package org.launchcode.techjobs_oo;

import java.util.Objects;

public class Job {

    private int id;
    private static int nextId = 1;

    private String name;
    private Employer employer;
    private Location location;
    private PositionType positionType;
    private CoreCompetency coreCompetency;
    private static final String DEFAULT_MESSAGE = "No Data Available";

    // TODO: Add two constructors - one to initialize a unique ID and a second to initialize the
    //  other five fields. The second constructor should also call the first in order to initialize
    //  the 'id' field.

    public Job() {
        this.id = nextId;
        nextId++;
    }

    public Job(String name, Employer employer, Location location, PositionType positionType, CoreCompetency coreCompetency) {
        this();
        this.name = name;
        this.employer = employer;
        this.location = location;
        this.positionType = positionType;
        this.coreCompetency = coreCompetency;
    }

    // TODO: Add custom equals and hashCode methods. Consider two Job objects "equal" when their id fields
    //  match.

    @Override
    public String toString(){
        String employerString = String.valueOf(employer);
        String locationString = String.valueOf(location);
        String positionTypeString = String.valueOf(positionType);
        String coreCompetencyString = String.valueOf(coreCompetency);

//
//
//        return String.format("ID: "+id+'\n'+"Name: "+name+'\n'+"Employer: "+employer+employer'\n'+"Location: "+location+'\n'+"Position Type: "+positionType+'\n'+"Core Competency: "+coreCompetency+" ",
//                //id == null ? DEFAULT_MESSAGE : id,
//                name == "  " ? DEFAULT_MESSAGE : name,
//                employerString == "  " ? DEFAULT_MESSAGE : employer,
//                locationString == null ? DEFAULT_MESSAGE : location,
//                positionType == null ? DEFAULT_MESSAGE : positionType,
//                coreCompetency == null ? DEFAULT_MESSAGE : coreCompetency);

        if(name.isEmpty()){
            name =  "Data not available";
        }

        if(employerString.isEmpty()){
            employerString = "Data not available";
        }else{
            employerString = "";
        }

        if(locationString.isEmpty()){
            locationString = "Data not available";
        }else{
            locationString = "";
        }


        if(positionTypeString.isEmpty()) {
            positionTypeString = "Data not available";

        }else{
            positionTypeString= "";

        }if(coreCompetencyString.isEmpty()){
            coreCompetencyString = "Data not available";
        }else{
            coreCompetencyString = "";
        }
        return (" "+"ID: " + id + '\n' + " Name: " + name + '\n' + " Employer: " + employer + employerString + '\n' + " Location: " + location + locationString +'\n' + " Position Type: " + positionType + positionTypeString +'\n' + " Core Competency: " + coreCompetency + coreCompetencyString+'\n');

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Job)) return false;
        Job job = (Job) o;
        return getId() == job.getId();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getId());
    }


    // TODO: Add getters for each field EXCEPT nextId. Add setters for each field EXCEPT nextID
    //  and id.


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Employer getEmployer() {
        return employer;
    }

    public void setEmployer(Employer employer) {
        this.employer = employer;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public void setPositionType(PositionType positionType) {
        this.positionType = positionType;
    }

    public CoreCompetency getCoreCompetency() {
        return coreCompetency;
    }

    public void setCoreCompetency(CoreCompetency coreCompetency) {
        this.coreCompetency = coreCompetency;
    }

    public int getId() {
        return id;
    }
}
