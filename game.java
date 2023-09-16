import java.util.*;
public class game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Deklarasi Variabel Pembantu
        Boolean kondisi = true;

        // Proses
        while (kondisi) {

            // Deklarasi Angka Random (int)
            int angka1 = (int) (Math.random()*50);
            int angka2 = (int) (Math.random()*50);
            int hasilTambah = angka1 + angka2;
            int hasilKurang = angka1 - angka2;
            int hasilKali = angka1 * angka2;
            float hasilBagi;

            System.out.println("\n----- Game Quiz Matematika-----");
            System.out.println("Silahkan Pilih Levelnya : ");
            System.out.println("A. Penjumlahan (Very Easy)");
            System.out.println("B. Pengurangan (Easy)");
            System.out.println("C. Perkalian (Hard)");
            System.out.println("D. Pembagian (Very Hard)");

            System.out.print("Saya Pilih Level : ");
            String level = input.next();

            switch (level) {
                case "a":
                    System.out.println("\nSilahkan Jawab Pertanyaanya Ini :");
                    System.out.print(angka1 + " + " + angka2 + " = ");
                    int jawabanTambah = input.nextInt();

                    if (jawabanTambah == hasilTambah) {
                        System.out.println("Horeee! Jawaban Kamu Benar");
                    } else {
                        System.out.println("Yaaahh Kamu Salah. Jawabannya itu "+ hasilTambah);
                    }

                    System.out.print("Mau Main Quiz Lagi? (y/n) : ");
                    String mainTambah = input.next();

                    if (mainTambah.equals("y")) {
                        kondisi = true;
                    } else {
                        System.out.println("\nQuiz Selesai. Terimakasih :)\n");
                        kondisi = false;
                    }

                    break;

                case "b":
                    System.out.println("\nSilahkan Jawab Pertanyaanya Ini :");
                    System.out.print(angka1 + " - " + angka2 + " = ");
                    int jawabanKurang = input.nextInt();

                    if (jawabanKurang == hasilKurang) {
                        System.out.println("Horeee! Jawaban Kamu Benar");
                    } else {
                        System.out.println("Yaaahh Kamu Salah. Jawabannya itu "+ hasilKurang);
                    }

                    System.out.print("Mau Main Quiz Lagi? (y/n) : ");
                    String mainKurang = input.next();

                    if (mainKurang.equals("y")) {
                        kondisi = true;
                    } else {
                        System.out.println("\nQuiz Selesai. Terimakasih :)\n");
                        kondisi = false;
                    }
                    break;

                case "c":
                    System.out.println("\nSilahkan Jawab Pertanyaanya Ini :");
                    System.out.print(angka1 + " * " + angka2 + " = ");
                    int jawabanKali = input.nextInt();

                    if (jawabanKali == hasilKali) {
                        System.out.println("Horeee! Jawaban Kamu Benar");
                    } else {
                        System.out.println("Yaaahh Kamu Salah. Jawabannya itu "+ hasilKali);
                    }

                    System.out.print("Mau Main Quiz Lagi? (y/n) : ");
                    String mainKali = input.next();

                    if (mainKali.equals("y")) {
                        kondisi = true;
                    } else {
                        System.out.println("\nQuiz Selesai. Terimakasih :)\n");
                        kondisi = false;
                    }
                    break;

                case "d":
                    System.out.println("\nSilahkan Jawab Pertanyaanya Ini :");
                    System.out.print(angka1 + " / " + angka2 + " = ");
                    Float jawabanBagi = input.nextFloat();

                    if (jawabanBagi == (float)angka1/angka2) {
                        System.out.println("Horeee! Jawaban Kamu Benar");
                    } else {
                        hasilBagi = (float)angka1/angka2;
                        if (angka2 == 0) {
                            System.out.println("Tidak Bisa Dibagi Dengan 0");
                        } else {
                            System.out.printf("Yaaahh Kamu Salah. Jawabannya itu %.1f ", hasilBagi);
                        }
                    }

                    System.out.print("\nMau Main Quiz Lagi? (y/n) : ");
                    String mainBagi = input.next();

                    if (mainBagi.equals("y")) {
                        kondisi = true;
                    } else {
                        System.out.println("\nQuiz Selesai. Terimakasih :)\n");
                        kondisi = false;
                    }
                    break;
            
                default:
                    System.out.println("!!! Maaf Level Belum Tersedia !!!");
                    break;
            }
        }
        input.close();
    }
}