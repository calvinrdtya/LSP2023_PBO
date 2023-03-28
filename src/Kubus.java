public class Kubus extends BangunRuang {
    int sisi;

    public Kubus(String nama) {
        super(nama);
    }

    public int getSisi() {
        return sisi;
    }

    public void setSisi(int sisi) {
        this.sisi = sisi;
    }
    
    @Override
    public double luas(){
        double luas = 6* getSisi()*getSisi();
        return luas;
    }
    
    @Override
    public double volume(){
        double volume = getSisi()*getSisi()*getSisi();
        return volume;
    }
}
