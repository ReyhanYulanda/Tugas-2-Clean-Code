package BangunDatar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih Bangun Datar:");
        System.out.println("1. Persegi");
        System.out.println("2. Persegi Panjang");
        System.out.println("3. Segitiga");

        System.out.print("Masukkan pilihan Anda (1/2/3): ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1: // Persegi
                System.out.print("Masukkan sisi persegi: ");
                double side = scanner.nextDouble();
                Square square = new Square(side);
                System.out.println("Luas Persegi: " + square.calculateArea());
                break;

            case 2: // Persegi Panjang
                System.out.print("Masukkan panjang persegi panjang: ");
                double length = scanner.nextDouble();
                System.out.print("Masukkan lebar persegi panjang: ");
                double width = scanner.nextDouble();
                Rectangle rectangle = new Rectangle(length, width);
                System.out.println("Luas Persegi Panjang: " + rectangle.calculateArea());
                break;

            case 3: // Segitiga
                System.out.print("Masukkan alas segitiga: ");
                double base = scanner.nextDouble();
                System.out.print("Masukkan tinggi segitiga: ");
                double height = scanner.nextDouble();
                Triangle triangle = new Triangle(base, height);
                System.out.println("Luas Segitiga: " + triangle.calculateArea());
                break;

            default:
                System.out.println("Pilihan tidak valid. Silakan coba lagi.");
        }

        scanner.close();
    }
}

