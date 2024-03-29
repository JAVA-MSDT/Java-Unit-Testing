package com.javamsdt;

public class ValidateISBN {

    public boolean checkISBN(String isbn) {
        if(isbn.length() != 10) {
            throw new NumberFormatException("Invalid ISBN length number, Must be 10 digits long.");
        }

        int total = 0;
        for (int i = 0; i < 10; i++) {
            total += isbn.charAt(i) * (10 - i);
        }
        return total % 11 == 0;
    }
}
