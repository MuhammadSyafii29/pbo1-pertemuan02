import java.util.Scanner;

public class InputOutput{
 public static void main(String [] args){
  Scanner scanner = new Scanner(System.in);
  String nama;
  String Ttl;
  String Hoby;
  String Alamat;

  System.out.print("Masukkan nama anda: ");
  nama = scanner.nextLine();
  System.out.print("Masukkan Tempat tanggal lahir anda: ");
  Ttl = scanner.nextLine();
  System.out.print("Masukkan Hoby anda: ");
  Hoby = scanner.nextLine();
  System.out.print("Masukkan Alamat anda: ");
  Alamat = scanner.nextLine();

  System.out.println("==============================");
  System.out.println("Nama anda :  "+nama);
  System.out.println("Tempat tanggal lahir anda : "+Ttl);
  System.out.println("Hoby anda : "+Hoby);
  System.out.println("Alamat anda : "+Alamat);
 }
}