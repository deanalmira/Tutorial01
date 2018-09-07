public class Makanan {
    private String nama;
    private String rasa;
    private double kalori;

    //constructor makanan
    public Makanan(String nama, String rasa, double kalori) {
        super();
        this.nama = nama;
        this.rasa = rasa;
        this.kalori = kalori;
    }
    //constructor makanan dengan 0 kalori dan rasa tidak enak
    public Makanan(String nama) {
        this.nama = nama;
        this.rasa = "tidak enak";
        this.kalori = 0;

        // setter-getter seperlunya
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getRasa() {
        return rasa;
    }
    public void setRasa(String rasa) {
        this.rasa = rasa;
    }
    public Double getKalori() {
        return kalori;
    }
    public void setKalori(Double kalori) {
        this.kalori = kalori;
    }



}