package tree;

public class ReverseString {

    public static void main(String[] args) {
        String test = new String("test");
        char[] result = new char[test.length()];

        for( int i = 0; i < test.length(); i++) {
            result[i] = test.charAt(test.length() - i - 1);
        }
        System.out.println(new String(result));
    }
}
