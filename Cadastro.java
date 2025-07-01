import java.util.ArrayList;
import java.util.Scanner;

public class Cadastro {

    private ArrayList<Usuario> userList = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void run() {
        int option;
        do {
            System.out.println("\n=== MENU ===");
            System.out.println("1. Register User");
            System.out.println("2. List Users");
            System.out.println("3. Edit User");
            System.out.println("4. Delete User");
            System.out.println("0. Exit");

            option = sc.nextInt();
            sc.nextLine();

            switch (option) {
                case 1 -> register();
                case 2 -> list();
                case 3 -> edit();
                case 4 -> delete();
                case 0 -> System.out.println("Exiting...");
                default -> System.out.println("Invalid option.");
            }
        } while (option != 0);
    }

    private void register() {
        String name;
        do {
            System.out.print("Name: ");
            name = sc.nextLine();
            if (name.trim().isEmpty()) {
                System.out.println("Name cannot be empty.");
            }
        } while (name.trim().isEmpty());

        String email;
        do {
            System.out.print("Email: ");
            email = sc.nextLine();
            if (email.trim().isEmpty() || !email.contains("@")) {
                System.out.println("Invalid email.");
            }
        } while (email.trim().isEmpty() || !email.contains("@"));

        int age;
        do {
            System.out.print("Age: ");
            while (!sc.hasNextInt()) {
                System.out.println("Age must be a number.");
                sc.next();
            }
            age = sc.nextInt();
            sc.nextLine();
            if (age <= 0 || age > 150) {
                System.out.println("Age must be between 1 and 150.");
            }
        } while (age <= 0 || age > 150);

        userList.add(new Usuario(name, email, age));
        System.out.println("User registered successfully.");
    }

    private void list() {
        if (userList.isEmpty()) {
            System.out.println("No users registered.");
            return;
        }

        System.out.println("\n=== Registered Users ===");
        for (int i = 0; i < userList.size(); i++) {
            Usuario u = userList.get(i);
            System.out.println("#" + (i + 1));
            System.out.println("  Name:  " + u.getName());
            System.out.println("  Email: " + u.getEmail());
            System.out.println("  Age:   " + u.getAge());
            System.out.println("------------------------");
        }
    }

    private void edit() {
        list();
        if (userList.isEmpty()) return;

        System.out.print("Enter the number of the user to edit: ");
        int index = sc.nextInt() - 1;
        sc.nextLine();

        if (index >= 0 && index < userList.size()) {
            Usuario user = userList.get(index);

            String name;
            do {
                System.out.print("New name (" + user.getName() + "): ");
                name = sc.nextLine();
                if (name.trim().isEmpty()) {
                    System.out.println("Name cannot be empty.");
                }
            } while (name.trim().isEmpty());

            String email;
            do {
                System.out.print("New email (" + user.getEmail() + "): ");
                email = sc.nextLine();
                if (email.trim().isEmpty() || !email.contains("@")) {
                    System.out.println("Invalid email.");
                }
            } while (email.trim().isEmpty() || !email.contains("@"));

            int age;
            do {
                System.out.print("New age (" + user.getAge() + "): ");
                while (!sc.hasNextInt()) {
                    System.out.println("Age must be a number.");
                    sc.next();
                }
                age = sc.nextInt();
                sc.nextLine();
                if (age <= 0 || age > 150) {
                    System.out.println("Age must be between 1 and 150.");
                }
            } while (age <= 0 || age > 150);

            user.setName(name);
            user.setEmail(email);
            user.setAge(age);

            System.out.println("User updated successfully.");
        } else {
            System.out.println("Invalid index.");
        }
    }

    private void delete() {
        list();
        if (userList.isEmpty()) return;

        System.out.print("Enter the number of the user to delete: ");
        int number = sc.nextInt() - 1;
        sc.nextLine();

        if (number >= 0 && number < userList.size()) {
            Usuario user = userList.get(number);

            System.out.print("Are you sure you want to delete " + user.getName() + "? (y/n): ");
            String confirm = sc.nextLine();

            if (confirm.equalsIgnoreCase("y")) {
                userList.remove(number);
                System.out.println("User deleted.");
            } else {
                System.out.println("Deletion cancelled.");
            }
        } else {
            System.out.println("Invalid index.");
        }
    }

    public static void main(String[] args) {
        Cadastro app = new Cadastro();
        app.run();
    }
}
