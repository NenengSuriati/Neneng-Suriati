package analog;
import java.util.Scanner;
public class ArrayClass
{    
    public static void main (String[] args)
    {
        Scanner masuk = new Scanner (System.in);
        Mahasiswa[] mhs = new Mahasiswa[2];
        for(int i = 0;i < mhs.length;i++)
        {
            System.out.println("masukan mahasiswa-"+i);
            System.out.print("nama : ");
            String nama = masuk.nextLine();
            System.out.print("ipk : ");
            double ipk = masuk.nextDouble();
            masuk.nextLine();
            Mahasiswa mahasiswa = new Mahasiswa();
            mhs[i] = mahasiswa;
            mhs[i].setnama(nama);
            mhs[i].setipk(ipk);
        }
        for (int i= 0;i < mhs.length;i++)
        {
            System.out.println("mahasiswa ke-"+ (i+1));
            System.out.println("Nama : "+mhs[i].getnama());
            System.out.println("IPK : "+mhs[i].getipk());
        }
    }
}
class Mahasiswa
{    
    private String nama;
    private double ipk;
    public void setnama(String nama)
    {
        this.nama = nama;
    }
    public void setipk(double ipk)
    {
        this.ipk = ipk;
    }
    public String getnama()
    {
        return this.nama;
    }
    public double getipk()
    {
        return this.ipk;
    }
}