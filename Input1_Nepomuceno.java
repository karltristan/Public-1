import java.util.Scanner;

public class Input1_Nepomuceno {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Enter the first word: ");
        String word1 = in.nextLine();

        System.out.println("Enter the second word: ");
        String word2 = in.nextLine();

        System.out.println("Enter the third word: ");
        String word3 = in.nextLine();

        System.out.println(word1);
        System.out.println(word2);
        System.out.println(word3);
        System.out.println(word1 + "\n" + word2 + "\n" + word3);
    }
}