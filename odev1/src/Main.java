import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int mat,fizik,kimya,turkce,tarih,muzik;

        Scanner inp=new Scanner(System.in);

        System.out.println("matematik notunuz : ");
        mat=inp.nextInt();

        System.out.println("fizik notunuz : ");
        fizik=inp.nextInt();

        System.out.println("kimya notunuz : ");
        kimya=inp.nextInt();

        System.out.println("turkce notunuz : ");
        turkce=inp.nextInt();

        System.out.println("tarih notunuz : ");
        tarih=inp.nextInt();

        System.out.println("muzik notunuz : ");
        muzik=inp.nextInt();

        double toplam=(mat+fizik+kimya+tarih+turkce+muzik);
        double sonuc=toplam/6;
        if(sonuc>=60){
            System.out.println("ogrenci sinifi gecti :)");
        }
        else{
            System.out.println("ogrenci sinifi gecemedi :(");
        }
    }
}
