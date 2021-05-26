package org.launchcode.studio7;

import java.util.ArrayList;

public class DVD extends BaseDisc implements CdDvdBehavior  {
    //final String DvdStorageCapacity = "4.7GB";

    public DVD(String aName, String aCapacity, String aContent, ArrayList<String> someDiscType){
        super(aName,aCapacity,aContent,someDiscType);
    }

    public DVD() {

    }

    @Override
    public void spinDisc(){
        System.out.println("A DVD spins at a rate of 570 - 1600 rpm.");
    }

    @Override
    public void reportInformation(String aName, String aCapacity, String aContent, ArrayList<String> someDiscType){
        System.out.println("Inside reportInformation of DVD class");
        System.out.println("Name of DVD is:" +aName);
        System.out.println("Capacity of DVD is:" +aCapacity);
        System.out.println("Content of DVD is:" +aContent);
        System.out.println("Type of DVD is:" +someDiscType);
        System.out.println("Exiting report Information of DVD class\n");
    }

    @Override
    public void dataStored(){
        System.out.println("A DVD holds the 0.4 micrometer space between the pits.");
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
