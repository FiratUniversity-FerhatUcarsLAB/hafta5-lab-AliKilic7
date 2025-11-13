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

public class SepetHesap {

    // Sabitler (Constants)
    final static double VAT_RATE = 0.18;      // KDV Oranı (%18)
    final static double SHIPPING_FEE = 29.99; // Kargo ücreti (TL)

    // METOT 1: Ürün toplamını hesapla (satır toplamı)
    // Satır Toplamı = fiyat * adet
    public static double calculateLineTotal(double price, int quantity) {
        return price * quantity;
    }

    // METOT 2: Ara toplam (ürün 1 + ürün 2 + ürün 3)
    public static double calculateSubtotal(double line1, double line2, double line3) {
        return line1 + line2 + line3;
    }

    // METOT 3: İndirim tutarı hesapla (araToplam * indirimYüzdesi / 100)
    public static double calculateDiscountAmount(double subtotal, double discountPercentage) {
        return subtotal * (discountPercentage / 100);
    }

    // METOT 4: İndirimli toplam hesapla (araToplam - indirimTutari)
    public static double applyDiscount(double subtotal, double discountAmount) {
        return subtotal - discountAmount;
    }

    // METOT 5: KDV tutarı hesapla (indirimliToplam * KDV)
    public static double calculateVAT(double discountedTotal, double vatRate) {
        return discountedTotal * vatRate;
    }

    // METOT 6: Genel toplam hesapla (indirimliToplam + kdv + kargo)
    public static double calculateGrandTotal(double discountedTotal, double vatAmount, double shippingFee) {
        return discountedTotal + vatAmount + shippingFee;
    }

    // ANA METOT
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== E-TICARET SEPET HESAPLAYICI ===");
        System.out.println("\nLütfen 3 ürünün bilgilerini girin:");

        // Ürün 1 bilgileri
        System.out.println("\n--- ÜRÜN 1 ---");
        System.out.print("  Birim fiyat (TL): ");
        double price1 = input.nextDouble();
        System.out.print("  Adet: ");
        int qty1 = input.nextInt();

        // Ürün 2 bilgileri
        System.out.println("\n--- ÜRÜN 2 ---");
        System.out.print("  Birim fiyat (TL): ");
        double price2 = input.nextDouble();
        System.out.print("  Adet: ");
        int qty2 = input.nextInt();

        // Ürün 3 bilgileri
        System.out.println("\n--- ÜRÜN 3 ---");
        System.out.print("  Birim fiyat (TL): ");
        double price3 = input.nextDouble();
        System.out.print("  Adet: ");
        int qty3 = input.nextInt();

        // İndirim bilgisi
        System.out.println("\nİndirim kuponu yüzdesi (%): ");
        double discountPercent = input.nextDouble();

        // HESAPLAMALAR
        double line1Total = calculateLineTotal(price1, qty1);
        double line2Total = calculateLineTotal(price2, qty2);
        double line3Total = calculateLineTotal(price3, qty3);

        double subtotal = calculateSubtotal(line1Total, line2Total, line3Total);
        double discountAmount = calculateDiscountAmount(subtotal, discountPercent);
        double discountedTotal = applyDiscount(subtotal, discountAmount);
        double vatAmount = calculateVAT(discountedTotal, VAT_RATE);
        double grandTotal = calculateGrandTotal(discountedTotal, vatAmount, SHIPPING_FEE);

        // SONUÇLARI YAZDIR
        System.out.println("\n========================================");
        System.out.println("             SİPARİŞ ÖZETİ");
        System.out.println("========================================");

        System.out.printf("Ürün 1 Toplam (%.2f TL x %d): %.2f TL\n", price1, qty1, line1Total);
        System.out.printf("Ürün 2 Toplam (%.2f TL x %d): %.2f TL\n", price2, qty2, line2Total);
        System.out.printf("Ürün 3 Toplam (%.2f TL x %d): %.2f TL\n", price3, qty3, line3Total);
        System.out.println("----------------------------------------");
        System.out.printf("Ara Toplam                   : %.2f TL\n", subtotal);

        System.out.printf("\nİndirim Tutarı (%%% .0f)        : -%.2f TL\n", discountPercent, discountAmount);
        System.out.printf("İndirimli Toplam             : %.2f TL\n", discountedTotal);

        System.out.printf("\nKDV (%%% .0f)                   : +%.2f TL\n", (VAT_RATE * 100), vatAmount);
        System.out.printf("Kargo Ücreti                 : +%.2f TL\n", SHIPPING_FEE);
        System.out.println("----------------------------------------");
        System.out.printf("GENEL TOPLAM                 : %.2f TL\n", grandTotal);
        System.out.println("========================================");

        input.close();
    }
}
