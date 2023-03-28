abstract class BangunRuang {
    protected String nama;
    protected double luas,volume;
    
    BangunRuang(String nama){
        this.nama=nama;      
    }
    public abstract double luas();
    public abstract double volume();
    
    public void infoBangunRuang(){
        System.out.println("Nama Bangun Ruang : "+nama);
        System.out.println("Luas              : "+luas());
        System.out.println("Volume            : "+volume());
    }          
}
