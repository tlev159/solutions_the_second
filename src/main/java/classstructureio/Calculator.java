package classstructureio;

import java.util.Scanner;

public class Calculator {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.println("Kérem az első számot:");
    int a = Integer.parseInt(scanner.nextLine());
    System.out.println("Kérem a második számot:");
    int b = Integer.parseInt(scanner.nextLine());

    System.out.println(a + " + " + b);
    System.out.println(a + b);

  }
}
