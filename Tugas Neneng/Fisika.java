import java.util.Scanner;

public class Fisika
{
	public static void main (String []args) 
	{

	double Tekanan;
	double gaya;
	double luasalas;
	double TekananHidrostatis;
	double massajeniszatcair;
	double gravitasi;
	double ketinggian;
	double GayaApung;
	double tesmassazatcairyangdipindahkanolehbenda;
  int Pilihan;

  Scanner nilai=new Scanner(System.in);

  for(String y= "Ya"; y.equals("Ya")||y.equals("Ya");)
  {
	System.out.println("-------------------------");
	System.out.println("Kumpulan Rumus Fisika");
	System.out.println("1. Tekanan");
	System.out.println("2. Tekanan Hidrostatis");
	System.out.println("3. Gaya Apung");
	System.out.println("-------------------------");


	System.out.print("masukan pilihan :");
	Pilihan=nilai.nextInt();

	if (Pilihan==1) {
 		System.out.println("TEKANAN");
		System.out.print(" Masukan Gaya :");
		gaya=nilai.nextDouble();
 		System.out.print("Masukan Luas Alas :");
 		luasalas=nilai.nextDouble();
 		Tekanan= gaya/luasalas;
 		System.out.println("Tekanan = gaya/luasalas");
		System.out.println("Tekanan = "+ Tekanan+ "N/m^2");
 
		}
	else if (Pilihan==2) {
		System.out.println("Tekanan Hidrostatis:");
		System.out.print("Masukan Massa Jenis Zat Cair:");
		massajeniszatcair=nilai.nextDouble();
		System.out.print("Masukan Gravitasi:");
		gravitasi=nilai.nextDouble();
		System.out.print("Masukan Ketinggian:");
		ketinggian=nilai.nextDouble();
		TekananHidrostatis= massajeniszatcair*gravitasi*ketinggian;
		System.out.println("Tekanan Hidrostatis = massajeniszatcair*gravitasi*ketinggian");
		System.out.println("Tekanan Hidrostatis = "+ TekananHidrostatis+ "Pa");
		}
	
	else if (Pilihan==3) {
		System.out.println("Gaya Apung");
		System.out.print("Masukan Massa Zat Cair Yang Dipindahkan Oleh Benda:");
		tesmassazatcairyangdipindahkanolehbenda=nilai.nextDouble();
		System.out.print("Masukan Gravitasi:");
		gravitasi=nilai.nextDouble();
		GayaApung= tesmassazatcairyangdipindahkanolehbenda*gravitasi;
		System.out.println("Gaya Apung = tesmassazatcairyangdipindahkanolehbenda*gravitasi");
		System.out.println("Gaya Apung = "+ GayaApung+ "N");
		}
 	 else System.out.print ("Maaf Pilihan Anda Tidak Tersedia, Silakan Masukan Pilihan Lainnya");
  		System.out.println("");
  System.out.println("Lanjutkan ? Ya/Tidak");
  y=nilai.next();
		}
	}
}