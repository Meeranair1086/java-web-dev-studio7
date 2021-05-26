package org.launchcode.studio7;

import java.util.ArrayList;

public abstract class BaseDisc {

    private String name;
    private String capacity;
    private String contents;
    private ArrayList<String> discType;

    public BaseDisc(String aName, String aCapacity, String aContent, ArrayList<String> someDiscType) {
        name = aName;
        capacity = aCapacity;
        contents = aContent;
        discType = someDiscType;
    }

    public BaseDisc() {

    }

    public abstract void reportInformation(String aName, String aCapacity, String aContent, ArrayList<String> someDiscType);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getContents() {
        return contents;
    }

    public void setContents(String contents) {
        this.contents = contents;
    }

    public ArrayList<String> getDiscType() {
        return discType;
    }

    public void setDiscType(ArrayList<String> discType) {
        this.discType = discType;
    }


}

