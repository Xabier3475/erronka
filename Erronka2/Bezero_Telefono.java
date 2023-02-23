public class Bezero_Telefono{
    private int id;
    private int id_bezero;
    private String zenbakia;
    
   public Bezero_Telefono(){}
   public Bezero_Telefono(int id,int id_bezero,String zenbakia){
      this.id=id;
      this.id_bezero=id_bezero;
      this.zenbakia=zenbakia;
   } 

    public int getId(){
       return this.id;
    }
    
    public void setId(int id){
       this.id=id;
    }
    
    public int getId_Bezero(){
        return this.id_bezero;
     }
     
     public void setId_Bezero(int id_bezero){
        this.id_bezero=id_bezero;
     }

     public String getZenbakia(){
        return this.zenbakia;
     }

     public void setZenbakia(String zenbakia){
        this.zenbakia=zenbakia;
     }
   

    @Override
    public String toString(){
       return("Telefonoa:  Id-a= " + this.id +"Id_Bezeroa= " + this.id_bezero + " Zenbakia= " + this.zenbakia);
    }
 }