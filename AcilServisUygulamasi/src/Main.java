import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    // Acil Servis Uygulaması

        /*
        Hastalar Acil Serviste şikayetlerine göre kuyrukta en önlere geçecek(PriorityQueue).

        Apandisit ----> En yüksek öncelik
        Yanık -------> Orta Öncelik
        Baş Ağrısı ---> En düşük öncelik

        new Hasta("Murat Bey","Yanık")

        */

    public static void main(String[] args) {

        Queue<Hasta> acilservis = new PriorityQueue<Hasta>();

        acilservis.offer(new Hasta("Yunus Bey" , "Yanık"));
        acilservis.offer(new Hasta("X Bey" , "Baş Ağrısı"));
        acilservis.offer(new Hasta("Y Bey" , "Apandisit"));
        acilservis.offer(new Hasta("Z Bey" , "Yanık"));
        acilservis.offer(new Hasta("T Bey" , "Yanık"));
        acilservis.offer(new Hasta("A Bey" , "Apandisit"));

        //aynı öncelik derecesi olsa bile önce gelenler yani önce eklenenler birinci sırayı alır önde olur

        int i = 1;

        while (acilservis.isEmpty() != true){
            System.out.println("*****************************");
            System.out.println(i + ". sırada");

            System.out.println(acilservis.poll());
            //poll metodu kuyruğun en önündekini çıkartır ve değer olarak döner
            System.out.println("*****************************");
            i++;
        }


    }
}