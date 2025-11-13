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

public class FizikFormul {

    // Sabit: Yerçekimi ivmesi (gravity = yercekimi)
    final static double GRAVITY = 9.8; // m/s²

    // METOT 1: Hız hesapla (v = s / t)
    // velocity = hız, distance = mesafe, time = zaman
    public static double calculateVelocity(double distance, double time) {
        return distance / time;
    }

    // METOT 2: İvme hesapla (a = Δv / t)
    // acceleration = ivme, velocityChange = hız değişimi
    public static double calculateAcceleration(double velocityChange, double time) {
        return velocityChange / time;
    }

    // METOT 3: Kuvvet hesapla (F = m * a)
    // force = kuvvet, mass = kütle
    public static double calculateForce(double mass, double acceleration) {
        return mass * acceleration;
    }

    // METOT 4: İş hesapla (W = F * d)
    // work = iş, force = kuvvet, distance = mesafe
    public static double calculateWork(double force, double distance) {
        return force * distance;
    }

    // METOT 5: Güç hesapla (P = W / t)
    // power = güç, work = iş, time = zaman
    public static double calculatePower(double work, double time) {
        return work / time;
    }

    // METOT 6: Kinetik Enerji (KE = 0.5 * m * v²)
    // kineticEnergy = kinetik enerji, velocity = hız
    public static double calculateKineticEnergy(double mass, double velocity) {
        return 0.5 * mass * Math.pow(velocity, 2);
    }

    // METOT 7: Potansiyel Enerji (PE = m * g * h)
    // potentialEnergy = potansiyel enerji, height = yükseklik
    public static double calculatePotentialEnergy(double mass, double gravity, double height) {
        return mass * gravity * height;
    }

    // METOT 8: Momentum (p = m * v)
    // momentum = momentum, velocity = hız
    public static double calculateMomentum(double mass, double velocity) {
        return mass * velocity;
    }

    // ANA METOT
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== FIZIK FORMUL ASISTANI ===\n");

        // TEMEL ÖLÇÜMLERİ AL
        System.out.println("TEMEL ÖLÇÜMLER:");
        System.out.print("Kütle (kg): ");
        double mass = input.nextDouble();

        System.out.print("Mesafe (m): ");
        double distance = input.nextDouble();

        System.out.print("Zaman (s): ");
        double time = input.nextDouble();

        System.out.print("Hız değişimi (m/s): ");
        double deltaV = input.nextDouble();

        System.out.print("Yükseklik (m): ");
        double height = input.nextDouble();

        // HESAPLAMALAR
        double velocity = calculateVelocity(distance, time);                      // v = s / t
        double acceleration = calculateAcceleration(deltaV, time);                // a = Δv / t
        double force = calculateForce(mass, acceleration);                        // F = m * a
        double work = calculateWork(force, distance);                             // W = F * d
        double power = calculatePower(work, time);                                // P = W / t
        double kineticEnergy = calculateKineticEnergy(mass, velocity);            // KE = 0.5 * m * v²
        double potentialEnergy = calculatePotentialEnergy(mass, GRAVITY, height); // PE = m * g * h
        double momentum = calculateMomentum(mass, velocity);                      // p = m * v

        // TOPLAM ENERJİ
        double totalEnergy = kineticEnergy + potentialEnergy;

        // SONUÇLARI YAZDIR
        System.out.println("\n========================================");
        System.out.println("         HESAPLAMA SONUÇLARI");
        System.out.println("========================================");

        System.out.println("\nHIZ ve HAREKET:");
        System.out.printf("  Hız (v = s/t)             : %.2f m/s\n", velocity);
        System.out.printf("  İvme (a = Δv/t)           : %.2f m/s²\n", acceleration);

        System.out.println("\nKUVVET ve İŞ:");
        System.out.printf("  Kuvvet (F = m*a)          : %.2f N\n", force);
        System.out.printf("  İş (W = F*d)              : %.2f J\n", work);
        System.out.printf("  Güç (P = W/t)             : %.2f W\n", power);

        System.out.println("\nENERJİ:");
        System.out.printf("  Kinetik Enerji (KE)       : %.2f J\n", kineticEnergy);
        System.out.printf("  Potansiyel Enerji (PE)    : %.2f J\n", potentialEnergy);
        System.out.printf("  Toplam Enerji (TE)        : %.2f J\n", totalEnergy);

        System.out.println("\nMOMENTUM:");
        System.out.printf("  Momentum (p = m*v)        : %.2f kg·m/s\n", momentum);

        System.out.println("\n========================================");
        input.close();
    }
}
