public class Lanpostu{
    private int id;
    private String deskribapena;

   public Lanpostu(){}

   public Lanpostu(int id,String deskribapena){
      this.id=id;
      this.deskribapena=deskribapena;
   }
 
    public int getId(){
      return this.id;
    }
    
    public void setId(int id){
       this.id = id;
    }
    public String getDeskribapena(){
        return this.deskribapena;
    }
      
      public void setKokalekuKodea(String deskribapena){
         this.deskribapena = deskribapena;
    }

    @Override
    public String toString(){
      return ("Lanpostu: Id= "+this.id+" Deskribapena= "+this.deskribapena);
    }
 }