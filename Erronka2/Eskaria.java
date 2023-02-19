public class Eskaria{
   private String dendako_eskariak;
   private String online_eskariak;
   private String egoera;
   private String data;
   
   public String getDendako_eskariak(){
     return this.dendako_eskariak;
   }
   
   public void setDendako_eskariak(String dendako_eskariak){
      this.dendako_eskariak = dendako_eskariak;
   }
   public String getOnline_eskariak(){
     return this.online_eskariak;
   }
   
   public void setOnline_eskariak(String online_eskariak){
      this.online_eskariak = online_eskariak;
   }
   public String getEgoera(){
     return this.egoera;
   }
   
   public void setEgoera(String egoera){
      this.egoera = egoera;
   }
   public String getData(){
     return this.data;
   }
   
   public void setData(String data){
      this.data = data;
   }
   @Override
   public String toString(){
      return("Eskaria:"+dendako_eskariak+" Online_Eskariak: "+online_eskariak+" Egoera: "+egoera+" Data: "+data);
   }

}