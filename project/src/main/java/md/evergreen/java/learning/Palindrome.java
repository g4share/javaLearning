// Copyright (c) 2024 RTU

package md.evergreen.java.learning;

public class Palindrome {
    public boolean isPalindrome(final int number) {

        int temp = number;
        int sum = 0;
        while(temp > 0) {
            int rest = temp % 10;
            sum = sum * 10 + rest;
            temp = temp / 10;
        }

        return number == sum;
    }
}