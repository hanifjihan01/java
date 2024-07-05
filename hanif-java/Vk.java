public class Vk {

    public static void main(String[] args) {
        String input = "ikan bakar";
        String vokal = "";
        String konsonan = "";
        
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (isVokal(ch)) {
                vokal += ch;
            } else if (isKonsonan(ch)) {
                konsonan += ch;
            }
        }

        System.out.println("Vokal: " + vokal);
        System.out.println("Konsonan: " + konsonan);
    }

    public static boolean isVokal(char ch) {
        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }

    public static boolean isKonsonan(char ch) {
        ch = Character.toLowerCase(ch);
        return (ch >= 'a' && ch <= 'z') && !isVokal(ch);
    }
}
