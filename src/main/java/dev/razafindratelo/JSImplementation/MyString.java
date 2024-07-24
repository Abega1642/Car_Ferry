package mg.training.JSImplementation;

public class MyString {
    public static String joinIt(String separator, String[] array) {
        StringBuilder res = new StringBuilder();
        for (String str : array) {
            res.append(str).append(separator);
        }
        return (separator.isEmpty()) ?
                res.substring(0, res.length()) : res.substring(0, res.length() - 1);
    }

    public static String joinIt(String separator, char[] array) {
        StringBuilder res = new StringBuilder();
        for (char c : array) {
            res.append(c).append(separator);
        }
        return (separator.isEmpty()) ?
                res.substring(0, res.length()) : res.substring(0, res.length() - 1);
    }
}
