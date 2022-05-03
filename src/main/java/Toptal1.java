public class Toptal1 {

    public static void main(String[] args) {
        String message = "To crop or not to crop ";
        int k = 22;

        System.out.println(solution(message, k));
    }

    private static String solution(String message, int K) {
        if (message.length() <= K ) return message;
        int spacePos = message.indexOf(" ", K);
        if (spacePos < 0) spacePos = K;
        String  poorlyCut = message.substring(0, spacePos);
        int lastSpace  = message.lastIndexOf(" ", K);
        String  cut  = message.substring(0, lastSpace);
        return cut;
    }
}
