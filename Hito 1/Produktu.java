public class Produktu{
   private int produktuKodea;
   private String [] kategoria;
   private String izena;
   private String deskribapena;
   private double balioa;
   private double une_salneurria;
   
   public int getProduktuKodea(){
      return this.produktuKodea;
   }
   
   public void setProduktuKodea(int produktuKodea){
      this.produktuKodea=produktuKodea;
   }

   public String [] getKategoria(){
      return this.kategoria;
   }
   
   public void setKategoria(String [] kategoria){
      this.kategoria=kategoria;
   }
   
   public String getIzena(){
      return this.izena;
   }
   
   public void setIzena(String izena){
      this.izena=izena;
   }
   
   public String getDeskribapena(){
      return this.deskribapena;
   }
   
   public void setDeskribapena(String deskribapena){
      this.deskribapena=deskribapena;
   }
   
   public double getBalioa(){
      return this.balioa;
   }
   
   public void setBalioa(double balioa){
      this.balioa=balioa;
   }
   
   public double getUne_salneurria(){
      return this.une_salneurria;
   }
   
   public void setUne_salneurria(double une_salneurria){
      this.une_salneurria=une_salneurria;
   } 
   
   @Override
   public String toString(){
      return("Produktua: Kodea: "+produktuKodea+" Izena: "+izena+" Kategoriak: "+kategoria +" Deskribapena: "+deskribapena+" Balioa: "+balioa+" Uneko_Salneurria: "+une_salneurria);
   }

}