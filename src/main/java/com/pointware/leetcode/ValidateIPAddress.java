package com.pointware.leetcode;

public class ValidateIPAddress {

    private static String isValidV4(String IP) {
        String[] ipClass = IP.split("\\.");
        if (ipClass.length != 4) {
            return "Neither";
        }
        for (String testNumber : ipClass) {
            if (testV4Number(testNumber)) return "Neither";
        }

        return "IPv4";
    }

    private static boolean testV4Number(String testNumber) {
        if (testNumber.isEmpty()) return true;
        try {
            int classNumber = Integer.parseInt(testNumber);
            if ((classNumber < 0 || classNumber > 255) || !String.valueOf(classNumber).equals(testNumber)) {
                return true;
            }
        } catch (NumberFormatException e) {
            return true;
        }
        return false;
    }


    private static boolean testV6Number(String number) {
        // any case character; 0 == 0000, empty is not valid;
        // hexadecimal = 0 ~ 9 + A ~ F
        if (number.isEmpty()) return true;
        char[] chars = number.toCharArray();
        if (chars.length > 4) {
            return true;
        }
        for (char ch : chars) {
            if ((ch < '0' || ch > '9') && (ch < 'a' || ch > 'f')) {
                return true;
            }
        }
        return false;
    }

    private static String isValidV6(String IP) {
        // IPv6 -> four hexadecimal ; by colon ":"
        String lowerCase = IP.toLowerCase();
        String[] ipClass = lowerCase.split(":");
        if (ipClass.length != 8) {
            return "Neither";
        }
        for (String testNumber : ipClass) {
            if (testV6Number(testNumber)) return "Neither";
        }

        return "IPv6";
    }

    public static String validIPAddress(String IP) {
        if(IP.chars().filter(ch -> ch == '.').count() == 3){
            return isValidV4(IP);
        }
        if(IP.chars().filter(ch -> ch == ':').count() == 7){
            return isValidV6(IP);
        }
        return "Neither";
    }
}
