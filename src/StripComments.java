import java.util.Arrays;

public class StripComments {

    public static String stripComments(String text, String[] commentSymbols) {
        System.out.println(text + "\n");
        System.out.println(Arrays.toString(commentSymbols) + "\n");
        String[] textArray = text.split("\n");
        int commentIndex;
        for (int i = 0; i < textArray.length; i++) {
            for (String comment : commentSymbols) {
                commentIndex = textArray[i].indexOf(comment);
                if (commentIndex != -1) {
                    textArray[i] = textArray[i].substring(0, commentIndex);
                }
                textArray[i] = textArray[i].stripTrailing();
                // textArray[i] = textArray[i].split("\\" + comment)[0].stripTrailing();
                // textArray[i] = textArray[i].replaceFirst("\\" + comment + ".*", "").stripTrailing();
            }
        }
        return String.join("\n", textArray);
    }
}
