import java.util.Scanner;

public class Nepomuceno {
    public static void main(String[] args) {

        String name;
        int age;

        Scanner in = new Scanner(System.in);
        System.out.println("Name: ");
        name = in.nextLine();

        System.out.println("Age: ");
        age = in.nextInt();

        System.out.println("I am " + name + " and I am " + age + " years old\n");
    }
}
