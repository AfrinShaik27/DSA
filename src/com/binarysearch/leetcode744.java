package com.binarysearch;

public class leetcode744 {
    static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'j';
        char ans = nextGreatestLetter(letters, target);
        System.out.println(ans);

    }

    public static char nextGreatestLetter(char[] characters, char target) {
        int start = 0;
        int end = characters.length - 1;

        while (start <= end) {

            int mid = start + (end - start) / 2;

            if (target < characters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return characters[start % characters.length];
    }
}

