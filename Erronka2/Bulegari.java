public class Bulegari {
    private int id;
    private int lanpostu_id;
   
    public Bulegari(){}

    public Bulegari(int id,int lanpostu_id){
        this.id=id;
        this.lanpostu_id=lanpostu_id;
    }
    public int getId(){
        return this.id;
    }
      
    public void setId(int id){
        this.id = id;
    }

    public int getLanpostu_Id(){
      return this.lanpostu_id;
    }
    
    public void setLanpostu_Id(int lanpostu_id){
       this.lanpostu_id = lanpostu_id;
    }

    @Override
    public String toString(){
       return("Bulegari:  Id-a= " + this.id +" Lanpostu_Id= " + this.lanpostu_id);
    }      
}
