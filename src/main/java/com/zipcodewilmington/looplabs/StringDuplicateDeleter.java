package com.zipcodewilmington.looplabs;

/**
 * Created by leon on 1/28/18.
 * @ATTENTION_TO_STUDENTS You are forbidden from modifying the signature of this class.
 */
public final class StringDuplicateDeleter extends DuplicateDeleter<String> {
    public StringDuplicateDeleter(String[] intArray) {
        super(intArray);
    }

    @Override
    public String[] removeDuplicates(int maxNumberOfDuplications) {
        String[] noDupeArr = new String[array.length];
        int newIdx = 0;

        for (int i = 0; i < array.length; i++) {
            int count = 0;

            for (String s : array) {
                if (array[i] == s) {
                    count++;
                }
            }
            if (count < maxNumberOfDuplications){
                noDupeArr[newIdx] = array[i];
                newIdx++;
            }
        }

        String[] result = new String[newIdx];
        for (int i = 0; i < result.length; i++) {
            result[i] = noDupeArr[i];
        }

        return result;
    }

    @Override
    public String[] removeDuplicatesExactly(int exactNumberOfDuplications) {
        return new String[0];
    }
}
