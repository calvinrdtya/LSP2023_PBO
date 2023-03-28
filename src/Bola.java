public class Bola extends BangunRuang{
    int jari;
    double phi = 3.14;

    public int getJari() {
        return jari;
    }

    public void setJari(int jari) {
        this.jari = jari;
    }
    
    public Bola(String nama) {
        super(nama);
    }

    @Override
    public double luas() {
        double luas = 4* phi*getJari()*getJari();
        return luas;
    }

    @Override
    public double volume() {
        double volume = 4/3* phi*getJari()*getJari()*getJari();
        return volume;
    }  
}
