package basicsifjavaapi;

public class TestCharacterClass {
    public static void main(String[] args) {
        String str = "abcd0123456789";
        int[] numericValues = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            numericValues[i] = Character.getNumericValue(str.charAt(i)) ;
        }

        System.out.println("getNumericValue");
        for (int i = 0; i < numericValues.length; i++) {
            System.out.print(numericValues[i]+ ",");
        }

        System.out.println("");

        System.out.println("valueOf");
        for (int i = 0; i < numericValues.length; i++) {

            System.out.print(Character.getType(numericValues[i])+ ",");
        }

    }
}
