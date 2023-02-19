public class Bezeroa{
   private String izena;
   private String abizena;
   private String nanBezeroa;
   private String helbidea;
   private String email;
   private int [] telefonoak;
   
   public String getIzena(){
      return this.izena;
   }
   
   public void setIzena(String izena){
      this.izena=izena;
   }
   
   public String getAbizena(){
      return this.abizena;
   }
   
   public void setAbizena(String abizena){
      this.abizena=abizena;
   }
   
   public String getnanBezeroa(){
      return this.nanBezeroa;
   }
   
   public void setnanBezeroa(String nanBezeroa){
      this.nanBezeroa=nanBezeroa;
   }
   
   public String getHelbidea(){
      return this.helbidea;
   }
   
   public void setHelbidea(String helbidea){
      this.helbidea=helbidea;
   }
   
   public String getEmail(){
      return this.email;
   }
   
   public void setEmail(String email){
      this.email=email;
   }
   
   public int [] getTelefonoak(){
      return this.telefonoak;
   }
   
   public void setTelefonoak(int [] telefonoak){
      this.telefonoak=telefonoak;
   }
   @Override
   public String toString(){
      return("Bezeroa: Izena: " + izena + " Abizena: " + abizena + " NAN-a: " + nanBezeroa + " Helbidea: " + helbidea + " Email: " + email + " Telefonoa(k): " + telefonoak);
   }
}