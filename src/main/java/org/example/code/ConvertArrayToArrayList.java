package org.example.code;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
public class ConvertArrayToArrayList {
    static void intArrayToArrayList(int[] arr){
        List<int[]> list=Arrays.asList(arr);
        System.out.println(list);
        for(var a:list){
            for(int i=0;i<a.length;i++){
                System.out.print(a[i]+",");
            }
        }
    }

    public static void main(String[] args) {
        intArrayToArrayList(new int[]{10,7,45,8,3,10});
    }
}
