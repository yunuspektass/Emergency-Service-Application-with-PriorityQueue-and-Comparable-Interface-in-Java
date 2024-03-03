public class Hasta implements Comparable<Hasta> {

    private String isim;
    private String sikayet;
    private  int oncelik;

    public Hasta(String isim , String sikayet ){
        this.isim = isim;
        this.sikayet = sikayet;

        if (sikayet.equals("Apandisit")){
            this.oncelik = 3;

        }
        else if (sikayet.equals("Yanık")){
            this.oncelik = 2;
        }
        else {
            this.oncelik = 1;
        }

    }

    @Override
    public String toString() {
        String bilgiler = "Hasta Adı : " + isim
                        + "\n Şikayet : " + sikayet
                        + "\n Öncelik : " + oncelik;

        return bilgiler;
    }

    @Override
    public int compareTo(Hasta hasta) {

        if (this.oncelik > hasta.oncelik){
            return -1; // olursa kendi thisdeki hasta öne geçer
            //return -1 ile öne geçer this.hasta
            
        }
        else if (this.oncelik < hasta.oncelik) {
            return 1; // arkaya atar çünkü priorityqueue ' da sayı küçükse önceliği fazlaydı.
        }
        else {
            return 0;
        }
    }
}
