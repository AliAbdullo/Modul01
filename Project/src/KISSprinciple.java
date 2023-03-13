public class KISSprinciple {
    public static String getDay(int number) {
        return switch (number) {
            case 1 -> "Dushanba";
            case 2 -> "Seshanba";
            case 3 -> "Chorshanba";
            case 4 -> "Payshanba";
            case 5 -> "Juma";
            case 6 -> "Shanba";
            case 7 -> "Yakshanba";
            default -> "0";
        };
    }

    public static void main(String[] args) {
        System.out.println(getDay(2));
        System.out.println(getDayWithKiss(6));

    }

    // KISS principle:
    // Keep it simple, stupid(KISS)
    public static String getDayWithKiss(int number) {
        String[] days = {"Dushanba", "Seshanba", "Chorshanba", "Payshanba", "Juma", "Shanba", "Yakshanba"};
        if (number < 1 || number > 7)
            return "0";
        return days[number - 1];
    }

    public static String teamMember(int member) {
        String[] team = {"Abdulloh Abduganiyev", "Aliqo'ziev Bilol", "Akmal Davlatov", "Bahodir Pardaboyev", "Davlataliyev Doniyorjon", "Alisher Farxodov"};
        if (member < 1 || member > 6)
            return "0";
        return team[member - 1];
    }


}
