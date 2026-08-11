import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListPrograms {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ArrayList<String> names = new ArrayList<>();

        System.out.print("Enter number of names: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter name: ");
            names.add(sc.nextLine());
        }

        System.out.println("\nNames in the ArrayList:");
        for (String name : names) {
            System.out.println(name);
        }

        System.out.print("\nEnter name to search: ");
        String search = sc.nextLine();

        if (names.contains(search)) {
            System.out.println("Name found.");
        } else {
            System.out.println("Name not found.");
        }

        System.out.print("\nEnter name to remove: ");
        String remove = sc.nextLine();

        if (names.remove(remove)) {
            System.out.println("Name removed successfully.");
        } else {
            System.out.println("Name not found.");
        }

        System.out.println("\nUpdated ArrayList:");
        for (String name : names) {
            System.out.println(name);
        }

        sc.close();
    }
}
