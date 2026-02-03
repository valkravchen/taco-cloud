package tacos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int age = scanner.nextInt();
        double discount = scanner.nextDouble();
        System.out.println("С днем рождения, " + name + "! Сегодня Вам " + age + "!");
        System.out.println("По этому поводу дарим Вам скидку " + discount + "%");
        System.out.println("на весь ассортимент нашего сайта!");
    }
}

