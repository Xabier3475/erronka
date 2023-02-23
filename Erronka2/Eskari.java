import java.sql.Date;

public class Eskari {
    private int id;
    private int id_bezero;
    private int id_egoera;
    private int id_saltzaile;
    private Date eskaera_data;
    
    public int getId(){
        return this.id;
    }
      
    public void setId(int id){
        this.id = id;
    }

    public int getId_Bezero(){
        return this.id_bezero;
    }
      
    public void setId_Bezero(int id_bezero){
        this.id_bezero = id_bezero;
    }

    public int getId_Egoera(){
        return this.id_egoera;
    }
      
    public void setId_Egoera(int id_egoera){
        this.id_egoera = id_egoera;
    }

    public int getId_Saltzaile(){
        return this.id_saltzaile;
    }
      
    public void setId_Saltzaile(int id_saltzaile){
        this.id_saltzaile = id_saltzaile;
    }

    public Date getEskaera_Data(){
        return this.eskaera_data;
    }
      
    public void setId(Date eskaera_data){
        this.eskaera_data = eskaera_data;
    }
}
