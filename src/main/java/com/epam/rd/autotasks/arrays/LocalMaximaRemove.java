package com.epam.rd.autotasks.arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.*;

public class LocalMaximaRemove {

    public static void main(String[] args) {
        int[] array = new int[]{-18, 21, 3, 6, 7, 65};

        System.out.println(Arrays.toString(removeLocalMaxima(array)));
    }

    public static int[] removeLocalMaxima(int[] array){

        //put your code here
       

        //throw new UnsupportedOperationException();
        ArrayList<Integer>al=new ArrayList<Integer>();
        for(int i=0;i<array.length;i++){
            if(i==0 && array[i]<=array[i+1]){
                al.add(array[i]);
            }
            else if(i==(array.length-1) && array[i]<=array[i-1]){
                al.add(array[i]);
            }
            else if(i>=1 && i<=array.length-2){
                if(array[i]<=array[i-1]||array[i]<=array[i+1]){
                    al.add(array[i]);
                }
            }
        }
        int[] newarr=new int[al.size()];
        for(int i=0;i<al.size();i++){
            newarr[i]=al.get(i);
        }
        return newarr;
        
}
    
}
