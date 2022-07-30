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
        int max = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }


        int[] intMap = new int[max + 1];

        // using an array to map the numbers
        for (int i = 0; i < array.length; i++) {
            int curr = array[i];
            intMap[curr] = intMap[curr] + 1;
        }

        Integer[] copyArr = new Integer[array.length];
        int newIndex = 0;

        for (int i = 0; i < array.length; i++) {
            int curr = array[i];
            if (intMap[curr] < maxNumberOfDuplications) {
                copyArr[newIndex] = curr;
                newIndex++;
            }
        }

        Integer[] result = new Integer[newIndex];
        for (int i = 0; i < newIndex; i++) {
            result[i] = copyArr[i];
        }

        return result;
    }

    @Override
    public Integer[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        return new Integer[0];
    }
}
