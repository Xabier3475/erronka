import java.sql.Date;

public class Langile{
   protected String izena;
   protected String abizena;
   protected int id;
   protected String emaila;
   protected Date kontratazio_data;
   protected int telefonoa;
   protected int id_nagusi;
   protected int soldata;
   
   public Langile(){}

   public Langile(int id,String izena,String abizena,String emaila,int telefonoa,Date kontratazio_data,int id_nagusi,int soldata){
      this.id=id;
      this.izena=izena;
      this.emaila=emaila;
      this.telefonoa=telefonoa;
      this.kontratazio_data=kontratazio_data;
      this.id_nagusi=id_nagusi;
      this.soldata=soldata;
   }
   public String getIzena(){
      return this.izena;
   }
   
   public void setIzena(String izena){
      this.izena = izena;
   }
   public String getAbizena(){
     return this.abizena;
   }
   
   public void setAbizena(String abizena){
      this.abizena = abizena;
   }
   public int getId(){
     return this.id;
   }
   
   public void setId(int id){
      this.id = id;
   }
   public String getEmaila(){
     return this.emaila;
   }
   
   public void setEmaila(String emaila){
      this.emaila = emaila;
   }
   public Date getKontratazio_data(){
     return this.kontratazio_data;
   }
   
   public void setKontratatze_data(Date kontratazio_data){
      this.kontratazio_data = kontratazio_data;
   }
   public int getTelefonoa(){
     return this.telefonoa;
   }
   
   public void setTelefonoa(int telefonoa){
      this.telefonoa = telefonoa;
   }
   public int getId_nagusi(){
      return this.id_nagusi;
   }
    
    public void setId_Nagusi(int id_nagusi){
       this.id_nagusi = id_nagusi;
   }
   public int getSoldata(){
      return this.soldata;
   }
    
    public void setSoldata(int soldata){
       this.soldata = soldata;
   }
 
   @Override
   public String toString(){
      return ("Langilea: Id= "+this.id+" Izena= "+this.izena+" Emaila= "+this.emaila+" Telefonoa= "+this.telefonoa+" Kontratazio_Data= "+this.kontratazio_data+" Id_Nagusi= "+this.id_nagusi+" Soldata= "+this.soldata);
   }
}