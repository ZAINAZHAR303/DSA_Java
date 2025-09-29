public class ValidWord {

    public static void main(String[] args) {
        System.out.println(isvalid("3dfa"));
    }

	public static boolean isvalid(String word){
		if (word == null || word.length() < 3) {
			return false;
		}

		boolean hasVowel = false;
		boolean hasConsonant = false;

		for (char ch : word.toCharArray()) {
			if (Character.isLetter(ch)) {
				char lower = Character.toLowerCase(ch);
				if (lower == 'a' || lower == 'e' || lower == 'i' || lower == 'o' || lower == 'u') {
					hasVowel = true;
				} else {
					hasConsonant = true;
				}
			} else if (!Character.isDigit(ch)) {
				return false;
			}
		}

		return hasVowel && hasConsonant;
	}
}