public class Saltzaile extends Langile{
   private int id;
   private String erabiltzaile;
   private String pasahitza;
   
   public Saltzaile(){}

   public Saltzaile(int id, String erabiltzaile,String pasahitza){
      this.id=id;
      this.erabiltzaile=erabiltzaile;
      this.pasahitza=pasahitza;
   }
   public int getId(){
      return this.id;
   }
    
    public void setId(int id){
       this.id = id;
   }
   public String getErabiltzaile(){
     return this.erabiltzaile;
   }
   
   public void setErabiltzaile(String erabiltzaile){
      this.erabiltzaile = erabiltzaile;
   }
   public String getPasahitza(){
     return this.pasahitza;
   }
   
   public void setPasahitza(String pasahitza){
      this.pasahitza = pasahitza;
   }

   @Override
   public String toString(){
      return ("Saltzaile: Id= "+this.id+" Erabiltzaile= "+this.erabiltzaile+" Pasahitza= "+this.pasahitza);
   }
}