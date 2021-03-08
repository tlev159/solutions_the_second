package classstructureio;

import java.util.Scanner;

public class Registration {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("Kérem a nevét!");
    String name = scanner.nextLine();
    System.out.println("Kérem az email-címét!");
    String email = scanner.nextLine();

    System.out.println("A következő adatokkal regisztrált:");
    System.out.println("Neve: " + name);
    System.out.println("E-mail címe: " + email);

  }


}
