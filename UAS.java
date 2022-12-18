/*
 * Nama : Hanina Nafisa Azka
 * NIM  : M0521027
 */

// SOAL NOMOR 1
public interface Pegawai {
    int hitungGaji;
}

// SOAL NOMOR 2
class PegawaiTetap implements Pegawai {
    //field
    String idPegawai;
    String namaPegawai;
    String alamatPegawai;
    int gajiPokok;
    int tunjangan;
    int gajiTotal;

    //constructor
    public PegawaiTetap (String idPegawai, String namaPegawai, String alamatPegawai, int gajiPokok, int tunjangan, int gajiTotal){
        this.idPegawai = id;
        this.namaPegawai = nama;
        this.alamatPegawai = alamat;
        this.gajiPokok = gajipokok;
        this.tunjangan = tunjangan;
        this.gajiTotal = gajitotal;
    }

    //deklarasimethod
    public String getidPegawai (){
        return id;
    }
    public void setidPegawai (String idPegawai){
        this.idPegawai = id;
    }

    public String getnamaPegawai (){
        return nama;
    }
    public void setnamaPegawai (String namaPegawai){
        this.namaPegawai = nama;
    }   

    public String getalamatPegawai (){
        return alamat;
    }
    public void setalamatPegawai (String alamatPegawai){
        this.alamatPegawai = alamat;
    }

    public int getgajiPokok (){
        return gajipokok;
    }
    public void setgajiPokok (int gajiPokok){
        this.gajiPokok = gajipokok;
    }

    public int gettunjangan (){
        return tunjangan;
    }
    public void settunjangan (int tunjangan){
        this.tunjangan = tunjangan;
    }

    public int getgajiTotal (){
        return gajitotal;
    }
    public void setgajiTotal (int gajiPokok){
        this.gajiTotal = gajitotal;
    }

    //method hitungGaji
    public int hitungGaji (){
        gajiTotal = gajiPokok + tunjangan;
        return gajitotal;
    }
}

// SOAL NOMOR 3
class PegawaiHonorer implements Pegawai{
    //field
    String idPegawai;
    String namaPegawai;
    String alamatPegawai;
    int gajiPokok;
    int gajiTotal;

    //constructor
    public PegawaiHonorer (String idPegawai, String namaPegawai, String alamatPegawai, int gajiPokok, int gajiTotal){
        this.idPegawai = id;
        this.namaPegawai = nama;
        this.alamatPegawai = alamat;
        this.gajiPokok = gajipokok;
        this.gajiTotal = gajitotal;
    }

    //deklarasimethod
    public String getidPegawai (){
        return id;
    }
    public void setidPegawai (String idPegawai){
        this.idPegawai = id;
    }

    public String getnamaPegawai (){
        return nama;
    }
    public void setnamaPegawai (String namaPegawai){
        this.namaPegawai = nama;
    }   

    public String getalamatPegawai (){
        return alamat;
    }
    public void setalamatPegawai (String alamatPegawai){
        this.alamatPegawai = alamat;
    }

    public int getgajiPokok (){
        return gajipokok;
    }
    public void setgajiPokok (int gajiPokok){
        this.gajiPokok = gajipokok;
    }

    public int getgajiTotal (){
        return gajitotal;
    }
    public void setgajiTotal (int gajiPokok){
        this.gajiTotal = gajitotal;
    }

    //method hitungGaji
    public int gethitungGaji (){
        gajiTotal = gajiPokok;
        return gajitotal;
    }
}

// SOAL NOMOR 5
class ThreadPrint extends Thread {
    PegawaiTetap[] arrayPegawaiTetap;
    PegawaiHonorer[] arrayPegawaiHonorer;

    public ThreadPrint(PegawaiTetap[] arrayPegawaiTetap, PegawaiHonorer[] arrayPegawaiHonorer) {
        this.arrayPegawaiTetap = arrayPegawaiTetap;
        this.arrayPegawaiHonorer = arrayPegawaiHonorer;
    }

    public void run() {
        //print data pegawai tetap
        for (PegawaiTetap pegawaiTetap: arrayPegawaiTetap) {
            pegawaiTetap.hitungGaji();
            System.out.println("---Data Karyawan---");
            System.out.println("ID Karyawan: " +pegawaiTetap.idPegawai);
            System.out.println("Nama Karyawan: " +pegawaiTetap.namaPegawai);
            System.out.println("Alamat Karyawan: " +pegawaiTetap.alamatPegawai);
            System.out.println("Gaji Pokok: " +pegawaiTetap.gajiPokok);
            System.out.println("Tunjangan: " +pegawaiTetap.tunjangan);
            System.out.println("Gaji Total: " +pegawaiTetap.gajiTotal);
            System.out.println("-------------------");
        }

        //print pegawai honorer
        for (PegawaiHonorer pegawaiHonorer: arrayPegawaiHonorer) {
            pegawaiHonorer.hitungGaji();
            System.out.println("---Data Karyawan---");
            System.out.println("ID Karyawan: " +pegawaiHonorer.idPegawai);
            System.out.println("Nama Karyawan: " +pegawaiHonorer.namaPegawai);
            System.out.println("Alamat Karyawan: " +pegawaiHonorer.alamatPegawai);
            System.out.println("Gaji Pokok: " +pegawaiHonorer.gajiPokok);
            System.out.println("Gaji Total: " +pegawaiHonorer.gajiTotal);
            System.out.println("-------------------");
        }
    }
}

// SOAL NOMOR 4
public class UAS {
    public static void main(String args []) {
        //deklarasi arrayPegawaiTetap
        PegawaiTetap[] arrayPegawaiTetap;

        //membuat 5 object PegawaiTetap
        arrayPegawaiTetap = new PegawaiTetap[5];
        for (int i = 0; i < 5; i++) {
            arrayPegawaiTetap[i] = new PegawaiTetap();
        }

        //menginputkan data PegawaiTetap
        arrayPegawaiTetap[0].setData(M0001, "Adeline Fellita", "Jl. Ahmad Yani, Karanhpilang, Wonocolo, Kabupaten Garut", 6000000, 1500000);
        arrayPegawaiTetap[1].setData(M0002, "Beatrix Datu", "Jl. Joyoboyo, Dukuh Pakis, Wonocolo, Kabupaten Garut", 6500000, 1500000);
        arrayPegawaiTetap[2].setData(M0003, "Hanina Nafisa", "Jl. Ngagel, Sukomanunggal, Gayungan, Kabupaten Garut", 7000000, 1500000);
        arrayPegawaiTetap[3].setData(M0004, "Haqqi Setiadjie", "Jl. Bendul Merisi, Sukomanunggal, Gayungan, Kabupaten Garut", 7500000, 1500000);
        arrayPegawaiTetap[4].setData(M0005, "Helmi Hananto", "Jl. Kalirungkut, Buncak, Lakarsantri, Kabupaten Garut ", 8000000, 1500000);

        //deklarasi arrayPegawaiTetap
        PegawaiHonorer[] arrayPegawaiHonorer;

        //membuat 5 object PegawaiTetap
        arrayPegawaiHonorer = new PegawaiHonorer[5];
        for (int i = 0; i < 5; i++) {
            arrayPegawaiHonorer[i] = new PegawaiHonorer();
        }

        //menginputkan data PegawaiHonorer
        arrayPegawaiHonorer[0].setData(M0006, "Irzan Rafi", "Jl. Keputih, Jebres, Sukolilo, Kota Surakarta ", 4500000);
        arrayPegawaiHonorer[1].setData(M0007, "Muflih Ihsan", "Jl. Tempurejo, Jambu, Mulyoreja, Kota Surakarta", 5000000);
        arrayPegawaiHonorer[2].setData(M0008, "Azzam Hilmi", "Jl. Nginden, Jebres, Sukolilo, Kota Surakarta", 5500000);
        arrayPegawaiHonorer[3].setData(M0009, "Hilmy Naufal", "Jl. Manyar Kertoadi, Gatasan, Sukolilo, Kota Surakarta", 6000000);
        arrayPegawaiHonorer[4].setData(M0010, "Muhammad Anang", "Jl. Gebang Lor, Bawen, Sukolilo, Kota Surakarta", 6500000);

        //mencetak data pegawai yang ada di arrayPegawaiTetap dan arrayPegawaiHonorer
        ThreadPrint threadPrint = new ThreadPrint(arrayPegawaiTetap, arrayPegawaiHonorer);
        threadPrint.start();
    }
}



