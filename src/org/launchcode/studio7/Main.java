package org.launchcode.studio7;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args){

        CD myCd = new CD();
        System.out.println("Calling a method in the CdDvdBehavior interface spinDisc() & dataStored():");
        System.out.println("Spinning rate of CD >>");
        myCd.spinDisc();

        System.out.println("Spinning rate of DVD >>");
        DVD myDvd = new DVD();
        myDvd.spinDisc();

        System.out.println("Data stored in CD >>");
        CD myCd1 = new CD();
        myCd1.dataStored();

        System.out.println("Data stored in DVD >>");
        DVD myDvd1 = new DVD();
        myDvd1.dataStored();

        System.out.println("\n");
        CD myCD2 = new CD();
        CD myCD3 = new CD();

        DVD myDVD2 = new DVD();
        DVD myDVD3 = new DVD();

        myCD2.reportInformation("Compact Disc1","680 MB","CD-R is read only",new ArrayList<>(Arrays.asList("CD-R")));
        myCD3.reportInformation("Compact Disc2","680 MB","CD-RW is read abd write",new ArrayList<>(Arrays.asList("CD-RW")));
    
        myDVD2.reportInformation("Digital Versatile Disc1","4.7 GB","DVD-R is read only",new ArrayList<>(Arrays.asList("DVD-R")));
        myDVD3.reportInformation("Digital Versatile Disc2","4.7 GB","DVD-R is Read and Write",new ArrayList<>(Arrays.asList("DVD-RW")));

        // TODO: Declare and initialize a CD and a DVD object.

        // TODO: Call each CD and DVD method to verify that they work as expected.

    }
}
