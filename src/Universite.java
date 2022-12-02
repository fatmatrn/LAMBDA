public class Universite {
    private String unuvercity ;
    private String bolum ;
    private int ogrSayisi;
    private int notOrt;

    //Parametresiz constructor
    public Universite() {
    }

    //Parametreli constructor
    public Universite(String unuvercity, String bolum, int ogrsayisi, int notOrt) {
        this.unuvercity = unuvercity;
        this.bolum = bolum;
        this.ogrSayisi = ogrsayisi;
        this.notOrt = notOrt;
    }
 //GETTER-SETTER
    public String getUnuvercity() {
        return unuvercity;
    }

    public void setUnuvercity(String unuvercity) {
        this.unuvercity = unuvercity;
    }

    public String getBolum() {
        return bolum;
    }

    public void setBolum(String bolum) {
        this.bolum = bolum;
    }

    public int getOgrSayisi() {
        return ogrSayisi;
    }

    public void setOgrsayisi(int ogrsayisi) {
        this.ogrSayisi = ogrsayisi;
    }

    public int getNotOrt() {
        return notOrt;
    }

    public void setNotOrt(int notOrt) {
        this.notOrt = notOrt;
    }

    @Override
    public String toString() {
        return "Universite{" +
                "unuvercity='" + unuvercity + '\'' +
                ", bolum='" + bolum + '\'' +
                ", ogrsayisi=" + ogrSayisi +
                ", notOrt=" + notOrt +
                '}';
    }
}
