package com.longfish.lc2024.month01;

public class exer12 {
    public boolean canConstruct(String ransomNote, String magazine) {
        for (int i = 0; i < ransomNote.length(); i++) {
            if (!magazine.contains(ransomNote.charAt(i) + "")) return false;
            magazine = magazine.replaceFirst(ransomNote.charAt(i) + "", "");
        }

        return true;
    }

}
