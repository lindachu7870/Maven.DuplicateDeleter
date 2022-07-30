package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/29/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class IntegerDuplicateDeleter extends DuplicateDeleter<Integer> {
    public IntegerDuplicateDeleter(Integer[] intArray) {
        super(intArray);
    }
// TODO
//  * Given an object, `IntegerDuplicateDeleter`, with a composite `Integer[]` object, write a method
//  * `removeDuplicatesExactly` which removes all values in the array which occur exactly the specified number of times.
//  * `removeDuplicates` which removes all values in the array which occur at least the specified number of times.
    @Override
    public Integer[] removeDuplicates(int maxNumberOfDuplications) {
        Integer[] intArr = new Integer[array.length];
        int max = 0;

        for (int i = 0; i < array.length; i++) {
            if (intArr[i] > max) {
                max = intArr[i];
            }
        }

        Integer[] intMap = new Integer[max + 1];

        // using an array to map the numbers
        for (int i = 0; i < array.length; i++) {
            int curr = array[i];
            intMap[curr] = intMap[curr]++;
        }

        Integer[] copyArr = new Integer[intMap.length];
        int newIndex = 0;
        // array to copy all the values over
        for (int i = 0; i < array.length; i++) {
            int curr = array[i];
            if (intMap[curr] < maxNumberOfDuplications) {
                copyArr[newIndex] = curr;
                newIndex++;
            }
        }

        return new Integer[0];
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        return new Integer[0];
    }
}
