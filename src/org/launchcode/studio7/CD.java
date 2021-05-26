package org.launchcode.studio7;

import java.util.ArrayList;

public class CD extends BaseDisc implements CdDvdBehavior {
    //final String CdStorageCapacity = "680MB";

    public CD(String aName, String aCapacity, String aContent, ArrayList<String> someDiscType){
    super(aName,aCapacity,aContent,someDiscType);
    }

    public CD() {
        super();
    }


    @Override
    public void spinDisc(){
        System.out.println("A CD spins at a rate of 200 - 500 rpm.");
    }

    @Override
    public void reportInformation(String aName, String aCapacity, String aContent, ArrayList<String> someDiscType) {
        System.out.println("Inside reportInformation of CD class");
        System.out.println("Name of CD is:" +aName);
        System.out.println("Capacity of CD is:" +aCapacity);
        System.out.println("Content of CD is:" +aContent);
        System.out.println("Type of CD is:" +someDiscType);
        System.out.println("Exiting report Information of CD class\n");
    }



    @Override
    public void dataStored(){
        System.out.println("A CD holds the 0.834 micrometer space between the pits.");
    }
    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
