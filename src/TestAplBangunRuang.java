import java.util.Scanner;
public class TestAplBangunRuang {
    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Selamat Datang di Aplikasi Kalkulator Sederhana");
        System.out.println("==================================================");
        System.out.println("Pilih Bangun Ruang");
        System.out.println("1.Kubus\n2.Balok\n3.Bola");
        System.out.print("Pilih Kode Bangun Ruang : ");
        int pilihan;
        pilihan = input.nextInt();
        
        switch (pilihan){
            case 1:
                Kubus kb = new Kubus ("Kubus");
                System.out.print("Masukkan Sisi : ");
                kb.setSisi(input.nextInt());
                System.out.println("Sisi Kubus : "+kb.getSisi());
                System.out.println("=======================");
                System.out.println("Luas Permukaan Kubus : "+6 + " x " +kb.getSisi()+" x "+kb.getSisi());
                System.out.println("Luas Permukaan Kubus : "+kb.luas());
                System.out.println("=======================");
                System.out.println("Volume Kubus : "+kb.getSisi()+" x "+kb.getSisi()+" x "+kb.getSisi());
                System.out.println("Volume Kubus : "+kb.volume());
                System.out.println("=======================");
                kb.infoBangunRuang();
                break;
                
            case 2:
                Balok bl = new Balok ("Balok");
                System.out.println("======================");
                    System.out.print("Masukkan Panjang : ");
                bl.setPanjang(input.nextInt());
                    System.out.print("Masukkan Tinggi  : ");
                bl.setTinggi(input.nextInt());
                    System.out.print("Masukkan Lebar   : ");
                bl.setLebar(input.nextInt());
                System.out.println("=======================");
                System.out.println("Panjang Balok : "+bl.getPanjang());
                System.out.println("Tinggi Balok  : "+bl.getTinggi());
                System.out.println("Lebar Balok   : "+bl.getLebar());
                System.out.println("=======================");
                System.out.println("Luas Permukaan Balok : "+2+ " x "+"("+"("+ bl.getPanjang()+" x "+bl.getLebar()+")"+" + "
                        +"("+bl.getPanjang()+" x "+bl.getTinggi()+")"+" + "+"("+bl.getLebar()+" x "+bl.getTinggi()+")"+")");
                System.out.println("Luas Permukaan Balok : "+bl.luas());
                System.out.println("=======================");
                System.out.println("Volume Balok : "+bl.getPanjang()+" x "+bl.getLebar()+" x "+bl.getTinggi());
                System.out.println("Volume Balok : "+bl.volume());
                System.out.println("=======================");
                bl.infoBangunRuang();
                break;
                
            case 3:
                Bola ba = new Bola ("Bola");
                System.out.print("Masukkan Jari - Jari : ");
                ba.setJari(input.nextInt());
                System.out.println("=======================");
                System.out.println("Jari - Jari Bola : "+ba.getJari());
                System.out.println("=======================");
                System.out.println("Luas Permukaan Bola : "+4+" x "+ "3.14"+" x "+ba.getJari()+" x "+ba.getJari());
                System.out.println("Luas Permukaan Bola : "+ba.luas());
                System.out.println("=======================");
                System.out.println("Volume Bola : "+"4/3"+" x "+"3.14"+" x "+ba.getJari()+" x "+ba.getJari()+" x "+ba.getJari());
                System.out.println("Volume Bola : "+ba.volume());
                System.out.println("=======================");
                ba.infoBangunRuang();
                break;
                
            default :
                System.out.println("Maaf, Bangun Ruang Belum Tersedia");
             break;
        }
        System.out.println("Terima Kasih Sudah Menggunakan Aplikasi Ini");
    }
}
