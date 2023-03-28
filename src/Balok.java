public class Balok extends BangunRuang{
    int panjang;
    int tinggi;
    int lebar;

    public int getPanjang() {
        return panjang;
    }

    public void setPanjang(int panjang) {
        this.panjang = panjang;
    }

    public int getTinggi() {
        return tinggi;
    }

    public void setTinggi(int tinggi) {
        this.tinggi = tinggi;
    }

    public int getLebar() {
        return lebar;
    }

    public void setLebar(int lebar) {
        this.lebar = lebar;
    }
    
    public Balok(String nama) {
        super(nama);
    }

    @Override
    public double luas() {
       double luas = 2*((getPanjang()*getLebar())+(getPanjang()*getTinggi())+(getLebar()*getTinggi()));
        return luas;
    }

    @Override
    public double volume() {
        double volume = getPanjang()*getLebar()*getTinggi();
        return volume;
    } 
}