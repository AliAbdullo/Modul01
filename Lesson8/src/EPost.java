public class EPost {
    public static void main(String[] args) {
        String matn = "aliabdulloh888@gmail.com";
        String muntazamIfoda = "^[a-zA-Z][\\w|\\.]{4,}@[a-zA-Z]{2,}\\.[a-zA-Z]{2,}";
        System.out.println(matn.matches(muntazamIfoda));
    }
}
