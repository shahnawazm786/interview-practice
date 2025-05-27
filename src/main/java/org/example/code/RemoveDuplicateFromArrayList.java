package org.example.code;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicateFromArrayList {
    public static void main(String[] args) {
        removeDuplicateStringUsingSteram();
    }
    static  void removeDuplicateString(){
        List<String> name=new ArrayList<>();
        name.add("Banana");name.add("Apple");name.add("Orange");name.add("Banana");name.add("Papaya");
        System.out.println(name);
        Set<String> set1=new HashSet<>(name);
        ArrayList<String> uniqueName=new ArrayList<>(set1);
        System.out.println(uniqueName);

    }
    static void removeDuplicateStringUsingSteram(){
        List<String> name=new ArrayList<>();
        name.add("Banana");name.add("Apple");name.add("Orange");name.add("Banana");name.add("Papaya");
        System.out.println(name);
        List<String> uniqueName=name.stream().distinct().collect(Collectors.toList());
        System.out.println(uniqueName);
    }

}
