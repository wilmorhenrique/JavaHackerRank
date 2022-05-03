package crackingthecode;

public class HaveOnlyOneEdition_Q5_PG91 {
    public static void main(String[] args) {
        System.out.println(haveOnlyOneEdition("ppli", "apple"));
    }

    private static boolean haveOnlyOneEdition(String str1, String str2) {
        if (str1.length() == str2.length()) {
            return checkForOneReplace(str1, str2);
        } else if (str1.length() + 1 == str2.length()) {
            return checkForOneInsert(str1, str2);
        } else if (str1.length() - 1 == str2.length()) {
            return checkForOneInsert(str2, str1);
        }
        return false;
    }

    private static boolean checkForOneInsert(String str1, String str2) {
        // pple -> bbple
        int index1 = 0;
        int index2 = 0;

        while (index2 < str2.length() && index1 < str1.length()){
            if (str1.charAt(index1) != str2.charAt(index2)) {
                if (index1 != index2) {
                    return false;
                }
            } else {
                index1++;
            }
            index2++;
        }
        return true;
    }

    private static boolean checkForOneReplace(String str1, String str2) {
        boolean foundDifference = false;

        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
                if (foundDifference) {
                    return false;
                }
                foundDifference = true;
            }
        }
        return true;
    }


}
