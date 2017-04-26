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
    
    public static int[] orderArray(int[] arrayTarget){
        
        int temp;
        
        for(int i =0;i<arrayTarget.length; i++){
            for(int j =0;j<arrayTarget.length-1; j++){
                
                if(arrayTarget[j] > arrayTarget[j+1]){
                    temp = arrayTarget[j];
                    arrayTarget[j] = arrayTarget[j+1];
                    arrayTarget[j+1] = temp;
                }

            }
            
        }
        
        return arrayTarget;
    }
    
    public static int findMissingPositiveInteger(int[] arrayTarget, int index, int length){
        
        if(index == length-1) {
            if(arrayTarget[index] < 0) return 1;
            else return arrayTarget[index] + 1;
        }
        else if(arrayTarget[index+1] != arrayTarget[index]+1) return arrayTarget[index] + 1;

        return findMissingPositiveInteger(arrayTarget,index+1,length);
    }
    
    public static int getFirstMissingPositiveInteger(int[] arrayTarget){

        arrayTarget = orderArray(arrayTarget);
        return findMissingPositiveInteger(arrayTarget, 0, arrayTarget.length);
    }
    
    public static char[] customStringReverse(char[] targetCharArray, int beginning, int ending){
        
        char temp;
        int j = ending;
        
        if (targetCharArray[beginning] == ' ') beginning++;

        for (int i=beginning; i <= j; i++){
            temp = targetCharArray[i];
            targetCharArray[i] = targetCharArray[j];
            targetCharArray[j] = temp;
            j-=1;
        }

        return targetCharArray;
        
    }
    
    public static char[] getStringWithReversedWords(char[] targetCharArray){
        
        int beginning = 0;
        int ending = targetCharArray.length-1;
        int charCounter = 0;
        int wordBeginning;
        int wordEnding;
        
        
        customStringReverse(targetCharArray,beginning,ending);
        
        
        
        for(int i=beginning; i <= ending; i++){
            
            if(targetCharArray[i] == ' ' || i == ending){
                wordBeginning = i-charCounter;
                wordEnding = targetCharArray[i] == ' ' ? wordBeginning+charCounter-1:wordBeginning+charCounter;
                customStringReverse(targetCharArray,wordBeginning,wordEnding);
                charCounter = 0;
            }
            charCounter++;
        }
        
        return targetCharArray;
    } 
}
