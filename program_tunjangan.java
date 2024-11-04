/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pertemuan5;
import java.util.Scanner;
/**
 *NAMA  : IMZY ZULIJAR SETIAWAN
 *NIM   : 23215022
 *PRODI : TEKNIK INFORMATIKA
 * 
 */
public class program_tunjangan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("========Program Tunjangan========");
        
        // Meminta input dari pengguna
        System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");
        double gajiPokok = input.nextDouble();
        
        System.out.print("Status Anda? (Menikah/Belum): ");
        String status = input.next();
        
        // Menghitung tunjangan berdasarkan status
        double tunjangan;
        if (status.equalsIgnoreCase("Menikah")) {
            tunjangan = 0.35 * gajiPokok; // 35% tunjangan untuk yang menikah
        } else {
            tunjangan = 0;
        }
        
        // Menghitung total gaji
        double totalGaji = gajiPokok + tunjangan;
        
        // Menampilkan hasil
        System.out.println("\n========Hasil Perhitungan Gaji Anda========");
        System.out.println("Gaji Pokok       : Rp " + gajiPokok);
        System.out.println("Tunjangan        : Rp " + tunjangan);
        System.out.println("Total Gaji       : Rp " + totalGaji);
        System.out.println("(Developed by : Rizki Adam Kurniawan)");
        
        input.close();
    }
}

