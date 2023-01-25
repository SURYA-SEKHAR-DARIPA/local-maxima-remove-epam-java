package com.epam.rd.autotasks.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class LocalMaximaRemove {

    public static void main(String[] args) {
        int[] array = new int[]{18, 1, 3, 6, 7, -5};

        System.out.println(Arrays.toString(removeLocalMaxima(array)));
    }

    public static int[] removeLocalMaxima(int[] array){

        //put your code here
       

        //throw new UnsupportedOperationException();
        int size = array.length;
        int position = 0;
        int extraArray[] = new int[size];
        for (int i=0; i<array.length; i++){
            if (i == 0){
                if (array[0]>array[1])
                    size = size - 1;
                else{
                    extraArray[0] = array[0];
                    position++;
                }
            }
            else if (i == array.length-1){
                if (array[array.length-1]> array[array.length-2])
                    size = size - 1;
                else
                    extraArray[size-1] = array[array.length-1];
            }
            else {
                if (array[i]>array[i-1] && array[i]>array[i+1]){
                    size = size - 1;
                }
                else{
                    extraArray[position] = array[i];
                    position++;
                }
            }
        }
        int[] finalArray = Arrays.copyOf(extraArray, size);
        return finalArray;
        
}
    
}
