package com.corejava.collectionz;

import java.util.*;

public class ArrayListConcepts {
    public static void main(String[] args) {
        ArrayListTest1 arrayListTest1 = new ArrayListTest1();
        arrayListTest1.doTest();

        ArrayPrimitiveTest primitiveTest =  new ArrayPrimitiveTest();
        primitiveTest.doTest();
        primitiveTest.setValueArray();

        ArrayListCollectionsz arrayListCollectionsz = new ArrayListCollectionsz();
        System.out.println( arrayListCollectionsz.getIntegerList());
        System.out.println(arrayListCollectionsz.removingDuplicates());

    }
}

class ArrayListTest1{
    Integer[] valueInt = {1,2,3,4,5};
    public void doTest(){
        System.out.println(Arrays.stream(valueInt).toList());
    }
}

class ArrayPrimitiveTest{
    int[] valueArray = {1,2,4,6,7,8};

    public void doTest(){
        System.out.println(Arrays.stream(valueArray).iterator().hasNext());
    }

    public void setValueArray() {
        Iterator<Integer> itr = Arrays.stream(valueArray).iterator();
        while (itr.hasNext())
        System.out.println(itr.next());
    }
}

class ArrayListCollectionsz{
    List<Integer> integerList = new ArrayList<>();

    public List<Integer> getIntegerList() {
        Random rdm = new Random();
            while (integerList.size() <= 100)
                integerList.add(rdm.nextInt(100));

        integerList.sort(Comparator.naturalOrder());
        return integerList;
    }

    public List<Integer> removingDuplicates(){
        List<Integer> tempList = new ArrayList<>();
        Set<Integer> afterDuplicatesRemoved = new HashSet<>(integerList);
        integerList.clear();
        tempList.addAll(afterDuplicatesRemoved);
        return tempList;
    }



}
