package com.company;


import java.beans.IntrospectionException;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

       Set<Integer> hashSet = new HashSet<>();
       Set<Integer> hashSet1 = new HashSet<>();


        hashSet.add(1);   hashSet1.add(0);
        hashSet.add(2);   hashSet1.add(1);
        hashSet.add(3);   hashSet1.add(2);

        System.out.println("San1: "+ hashSet);
        System.out.println("San2: "+ hashSet1);


        Set<Integer>  setn = symmetricDifference(hashSet,hashSet1);
        System.out.println("NOT duplicate numbers: " + setn);

        }
        public  static   Set<Integer> symmetricDifference (Set<Integer> set1, Set<Integer> set2){
        Set<Integer> integers = new HashSet<>(set1);
        integers.addAll(set2);

            Set<Integer>  seta = new HashSet<>(integers);
        seta.retainAll(set1);
        seta.retainAll(set2);
        integers.removeAll(seta);

        return integers;
        }

}