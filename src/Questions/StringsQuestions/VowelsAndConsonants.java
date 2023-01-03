package Questions.StringsQuestions;

public class VowelsAndConsonants {
    public static void main(String[] args) {
        String str = "This is a really simple sentence";
        totalNoOFVovelsAndConsonants(str);
    }

    private static void totalNoOFVovelsAndConsonants(String str) {
        int vCount = 0;
        int consonatsCount = 0;
        for (int i = 0; i < str.length(); i++) {

            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o'
                    || str.charAt(i) == 'u') {
                vCount += 1;

            }

            if (str.charAt(i) != ' ') {
                consonatsCount += 1;

            }
        }
        System.out.println(vCount + " " + (consonatsCount - vCount));

    }

}
