package com.company;

import java.util.List;
import java.util.ArrayList;


public class Main {

    public static void main(String[] args) {


        //
        // Exercise number02 - getFirstMissingPositiveInteger
        //
        
        int [] unsortedArrayA = new int[3];
        unsortedArrayA[0] = 1;
        unsortedArrayA[1] = 2;
        unsortedArrayA[2] = 0;

        System.out.println("exercise number02 - getFirstMissingPositiveInteger from unsortedArrayA: " + number4.getFirstMissingPositiveInteger(unsortedArrayA));

        int [] unsortedArrayB = new int[4];
        unsortedArrayB[0] = 3;
        unsortedArrayB[1] = 4;
        unsortedArrayB[2] = -1;
        unsortedArrayB[2] = 1;

        System.out.println("exercise number02 - getFirstMissingPositiveInteger from unsortedArrayB: " + number4.getFirstMissingPositiveInteger(unsortedArrayB));

        int [] unsortedArrayC = new int[3];
        unsortedArrayC[0] = -8;
        unsortedArrayC[1] = -7;
        unsortedArrayC[2] = -6;

        System.out.println("exercise number02 - getFirstMissingPositiveInteger from unsortedArrayC: " + number4.getFirstMissingPositiveInteger(unsortedArrayC));

        int [] unsortedArrayD = new int[1];
        unsortedArrayD[0] = 1;

        System.out.println("exercise number02 - getFirstMissingPositiveInteger from unsortedArrayD: " + number4.getFirstMissingPositiveInteger(unsortedArrayD));
	
      
        //
        // Exercise number04 - getLargestNumberFromIntegerList
        // 
        
        List<Integer> nonNegativeIntegerList = new ArrayList<Integer>();
        nonNegativeIntegerList.add(3);
        nonNegativeIntegerList.add(30);
        nonNegativeIntegerList.add(34);
        nonNegativeIntegerList.add(5);
        nonNegativeIntegerList.add(9);

        System.out.println("exercise number04 - getLargestNumberFromIntegerList: " + number4.getLargestNumberFromIntegerList(nonNegativeIntegerList));
    }
}
