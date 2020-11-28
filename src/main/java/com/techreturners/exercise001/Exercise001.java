package com.techreturners.exercise001;

import java.math.BigDecimal;
import java.math.RoundingMode;
//import java.util.ArrayList;
import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        return Character.toUpperCase(firstName.charAt(0)) + "." + Character.toUpperCase(lastName.charAt(0));
    }

    public double addVat(double originalPrice, double vatRate) {
        BigDecimal bd = new BigDecimal(Double.toString((originalPrice += originalPrice * vatRate / 100)));
        bd = bd.setScale(2, RoundingMode.HALF_UP);
        return bd.doubleValue();
    }

    public String reverse(String sentence) {
        return new StringBuilder(sentence).reverse().toString();
    }

    public int countLinuxUsers(List<User> users) {
        User u;
        int count = 0;
        for (int i = 0; i < users.size(); i++) {
            u = users.get(i);
            // System.out.println("user: " + u.getUsername() + " os: "
            // +u.getOperatingSystem() + " type: " + u.getType());
            if (u.getType().equals("Linux")) {
                count++;
            }
        }
        return count;
    }
}
