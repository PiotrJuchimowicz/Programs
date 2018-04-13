
package Klasy;

/**
 *
 * @author Piotr
 */

public class Siatkowka extends Mecz
{
    // Dostep private bo juz nie dziedziczy nic z tej klasy
    private SedziaPomocniczy pomocniczy1;
    private SedziaPomocniczy pomocniczy2;


   private int setyA,setyB;//Sety wygrane przez kazda z druzyn

    //Konstruktory
    public Siatkowka()//konstruktor bezparametrowy
    {
        
    }
    //konstruktor parametrow
    public Siatkowka(Sedzia s,SedziaPomocniczy sp1,SedziaPomocniczy sp2,int d,String m,int r,int sA,int sB)
    {
        sedzia=s;
        pomocniczy1=sp1;
        pomocniczy2=sp2;
        dzien=d;
        miesiac=m;
        rok=r;
        setyA=sA;
        setyB=sB;


        
    }
    


            
    public Siatkowka(Siatkowka var) // konstuktor kopiujacy
    {
       
        sedzia= new Sedzia(var.sedzia);
        pomocniczy1= new SedziaPomocniczy(var.pomocniczy1);
        pomocniczy2= new SedziaPomocniczy(var.pomocniczy2);
       dzien= var.dzien;
       miesiac=var.miesiac;
       rok=var.rok;
       setyA=var.setyA;
       setyB=var.setyB;
        
    }

    public void setSiatkowka(Sedzia s, SedziaPomocniczy p1, SedziaPomocniczy p2){
        sedzia=s;
        pomocniczy1=p1;
        pomocniczy2=p2;
    }
    
    public void SetPomocniczy1(SedziaPomocniczy var)
    {
        pomocniczy1=var;
    }
    public void SetPomocniczy2(SedziaPomocniczy var)
    {
        pomocniczy2=var;
    }

    public Sedzia GetPomocniczy1()
    {
        return pomocniczy1;
    }
    public Sedzia GetPomocniczy2()
    {
        return pomocniczy2;
    }


   public void wynik_Siatkowki()//Metoda ktora okresla zwyciezce danego meczu, w przypadku remisu nie ma zwyciezcy
   {
       if(setyA>setyB)
       {
           wynikA=true;
           wynikB=false;
       }
           
       else if(setyB>setyA)
       {
           wynikB=true;
           wynikA=false;
       }
           
       else
       {
           wynikA=false;
           wynikB=false;
       }

   }

   public void skutecznosc()
   {
    int dlugosc_gry=setyA+setyB;
       skutecznoscA=(float)setyA/dlugosc_gry;
       skutecznoscB=(float)setyB/dlugosc_gry;
   }
    public int getSetA(){
        return setyA;
    }
    public int getSetB(){
        return setyB;
    }
}

