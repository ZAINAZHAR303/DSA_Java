import java.util.regex.Pattern;

public class MItProblem {
    public static void main(String[] args) {
        System.out.println(isRepetitiveString("MITBEAVER"));
    }

     static String isRepetitiveString(String S) {
        // Check if the string starts with 'M' and has at least one 'IT'
        if (S.charAt(0) != 'M' || S.length() < 3) {
            return "NO";
        }

        // Remove the initial 'M'
        String remaining = S.substring(1);

        // Check if the length of the remaining string is divisible by 2
        if (remaining.length() % 2 != 0) {
            return "NO";
        }

        // Verify if the remaining string is composed entirely of "IT"
        for (int i = 0; i < remaining.length(); i += 2) {
            if (!(remaining.charAt(i) == 'I' && remaining.charAt(i + 1) == 'T')) {
                return "NO";
            }
        }

        return "YES";
    }
}
