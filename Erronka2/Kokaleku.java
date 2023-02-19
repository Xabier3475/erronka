public class Kokaleku{
   private int kokalekuKodea;
   private String helbidea;
   private String udalerria;
   private String probintzia;
   private String herrialde;
   private String kontinentea;

   public int getKokalekuKodea(){
     return this.kokalekuKodea;
   }
   
   public void setKokalekuKodea(int kokalekuKodea){
      this.kokalekuKodea = kokalekuKodea;
   }

   public String getHelbidea(){
     return this.helbidea;
   }
   
   public void setHelbidea(String helbidea){
      this.helbidea = helbidea;
   }
   public String getUdalerria(){
     return this.udalerria;
   }
   
   public void setUdalerria(String udalerria){
      this.udalerria = udalerria;
   }
   public String getProbintzia(){
     return this.probintzia;
   }
   
   public void setProbintzia(String probintzia){
      this.probintzia = probintzia;
   }
   public String getherrialde(){
     return this.herrialde;
   }
   
   public void setHerrialde(String herrialde){
      this.herrialde = herrialde;
   }
   public String getKontinentea(){
     return this.kontinentea;
   }
   
   public void setKontinentea(String kontinentea){
      this.kontinentea = kontinentea;
   }
   @Override
   public String toString(){
      return("Kokaleku: Kodea: "+kokalekuKodea+" Helbidea: "+helbidea+" Udalerria: "+udalerria+" Probintzia: "+probintzia+" Herrialde: "+herrialde+" Kontinentea: "+kontinentea);
   }

}