
public class Biltegi{
   private int biltegiKodea;
   private String izena;
   private int produktu_kop;

   public int getBiltegiKodea(){
     return this.biltegiKodea;
   }
   
   public void setBiltegiKodea(int biltegiKodea){
      this.biltegiKodea = biltegiKodea;
   }
   
   public String getIzena(){
     return this.izena;
   }
   
   public void setIzena(String izena){
      this.izena = izena;
   }
   public int getProduktu_kop(){
     return this.produktu_kop;
   }
   
   public void setProduktu_kop(int produktu_kop){
      this.produktu_kop = produktu_kop;
   }
   @Override
   public String toString(){
      return("Biltegi: Kodea: "+biltegiKodea+" Izena: "+izena+" Produktu_Kopurua: "+produktu_kop);
   }

}
