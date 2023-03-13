public class IsValid20 {
    public static void main(String[] args) {

        System.out.println(isValid("{()}"));
    }

    public static boolean isValid(String s) {
        int n = s.length();
        int top = 0;
        char[] index = new char[n + 1];
        for (int i = 0; i < n; i++) {
            char c = s.charAt(i);
            if (c == '(' || c == '{' || c == '[') {
                index[++top] = c;
            } else if (c == ')') {
                if (top == 0 || index[top] != '(') {
                    return false;
                }
                top--;
            } else if (c == '}') {
                if (top == 0 || index[top] != '{') {
                    return false;
                }
                top--;
            } else if (c == ']') {
                if (top == 0 || index[top] != '[') {
                    return false;
                }
                top--;
            }
        }
        return top == 0;
    }
}
