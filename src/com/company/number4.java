package com.company;

import java.util.List;

/**
 * Created by fmartinez on 4/25/17.
 */
public class number4 {

    public static float getMinimumFloatValue(float floatValue){

        if (floatValue < 1) return floatValue;

        return getMinimumFloatValue(floatValue /10);

    }
    
    public static int getLargestNumberFromIntegerList(List<Integer> nonNegativeIntegerList){
        
        int temp;
        String  stringList;
        
        for(int i =0;i < nonNegativeIntegerList.size();i++){
            for(int j =0;j < nonNegativeIntegerList.size()-1;j++){
                
                if(getMinimumFloatValue(nonNegativeIntegerList.get(j)) < getMinimumFloatValue(nonNegativeIntegerList.get(j+1))){
                    temp = nonNegativeIntegerList.get(j);
                    nonNegativeIntegerList.set(j,nonNegativeIntegerList.get(j+1));
                    nonNegativeIntegerList.set(j+1,temp);
                }
            }
        }

        stringList = nonNegativeIntegerList.toString();
        stringList = stringList.substring(1,stringList.length()-1).replace(", ","");
        
        return Integer.parseInt(stringList);
        
        
        
        
        
        
    }
    
    
}
