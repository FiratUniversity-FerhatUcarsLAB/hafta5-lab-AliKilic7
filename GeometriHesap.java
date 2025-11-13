/*
 * Ad Soyad: Selahattin Ali KILIÇ
 * Ogrenci No: 250541036
 * Tarih: 13.11.2025
 * Aciklama: Gorev 2 - Fizik Formulu Asistani
 *
 * Bu program temel fizik formullerini kullanarak
 * hesaplamalar yapar.
 */

package Hafta5;

import java.util.Scanner;

public class GeometriHesap {

    // METOT 1: Karenin alanını hesapla (A = kenar * kenar)
    public static double calculateSquareArea(double side) {
        return side * side;
    }

    // METOT 2: Karenin çevresini hesapla (P = 4 * kenar)
    public static double calculateSquarePerimeter(double side) {
        return 4 * side;
    }

    // METOT 3: Dikdörtgenin alanını hesapla (A = genişlik * yükseklik)
    public static double calculateRectangleArea(double width, double height) {
        return width * height;
    }

    // METOT 4: Dikdörtgenin çevresini hesapla (P = 2 * (genişlik + yükseklik))
    public static double calculateRectanglePerimeter(double width, double height) {
        return 2 * (width + height);
    }

    // METOT 5: Dairenin alanını hesapla (A = π * r²)
    public static double calculateCircleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    // METOT 6: Dairenin çevresini hesapla (C = 2 * π * r)
    public static double calculateCircleCircumference(double radius) {
        return 2 * Math.PI * radius;
    }

    // METOT 7: Üçgenin alanını Heron formülüyle hesapla
    // s = (a + b + c) / 2
    // Alan = √(s * (s - a) * (s - b) * (s - c))
    public static double calculateTriangleArea(double a, double b, double c) {
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }

    // METOT 8: Üçgenin çevresini hesapla (P = a + b + c)
    public static double calculateTrianglePerimeter(double a, double b, double c) {
        return a + b + c;
    }

    // ANA METOT
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("=== GEOMETRIK SEKIL HESAPLAYICI ===");

        // Kare
        System.out.println("\n--- KARE ---");
        System.out.print("Kenar uzunluğu (m): ");
        double squareSide = input.nextDouble();
        double squareArea = calculateSquareArea(squareSide);
        double squarePerimeter = calculateSquarePerimeter(squareSide);

        // Dikdörtgen
        System.out.println("\n--- DIKDORTGEN ---");
        System.out.print("Genişlik (m): ");
        double rectWidth = input.nextDouble();
        System.out.print("Yükseklik (m): ");
        double rectHeight = input.nextDouble();
        double rectangleArea = calculateRectangleArea(rectWidth, rectHeight);
        double rectanglePerimeter = calculateRectanglePerimeter(rectWidth, rectHeight);

        // Daire
        System.out.println("\n--- DAIRE ---");
        System.out.print("Yarıçap (m): ");
        double radius = input.nextDouble();
        double circleArea = calculateCircleArea(radius);
        double circleCircumference = calculateCircleCircumference(radius);

        // Üçgen
        System.out.println("\n--- UCGEN (Heron Formülü) ---");
        System.out.print("Kenar a (m): ");
        double sideA = input.nextDouble();
        System.out.print("Kenar b (m): ");
        double sideB = input.nextDouble();
        System.out.print("Kenar c (m): ");
        double sideC = input.nextDouble();
        double triangleArea = calculateTriangleArea(sideA, sideB, sideC);
        double trianglePerimeter = calculateTrianglePerimeter(sideA, sideB, sideC);

        // SONUÇLARI YAZDIR
        System.out.println("\n========================================");
        System.out.println("            HESAPLAMA SONUÇLARI");
        System.out.println("========================================");

        System.out.println("\nKARE:");
        System.out.printf("  Alan = %.2f m²\n", squareArea);
        System.out.printf("  Çevre = %.2f m\n", squarePerimeter);

        System.out.println("\nDİKDÖRTGEN:");
        System.out.printf("  Alan = %.2f m²\n", rectangleArea);
        System.out.printf("  Çevre = %.2f m\n", rectanglePerimeter);

        System.out.println("\nDAİRE:");
        System.out.printf("  Alan = %.2f m²\n", circleArea);
        System.out.printf("  Çevre = %.2f m\n", circleCircumference);

        System.out.println("\nÜÇGEN (Heron):");
        System.out.printf("  Alan = %.2f m²\n", triangleArea);
        System.out.printf("  Çevre = %.2f m\n", trianglePerimeter);

        System.out.println("\n========================================");
        input.close();
    }
