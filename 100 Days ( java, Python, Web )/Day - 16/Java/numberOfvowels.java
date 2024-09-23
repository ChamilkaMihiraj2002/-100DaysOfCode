import java.util.Scanner;

public class numberOfvowels {
    static Scanner reader = new Scanner(System.in);

    public static String getStr() {
        System.out.print("Enter String : ");
        return reader.nextLine();
    }

    public static int vowels(String words) {
        String vowels_list = "aeiouAEIOU";
        int count = 0;

        for (int i = 0; i < words.length(); i++) {
            for (int j = 0; j < vowels_list.length(); j++) {
                if (words.charAt(i) == vowels_list.charAt(j)){
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        String data = getStr();
        System.out.println("Vowel count : " + vowels(data));
        reader.close();
    }
}
