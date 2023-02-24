import javax.xml.bind.annotation.*; 

@XmlType(propOrder={"id_biltegi","kopurua"})
@XmlAccessorType(XmlAccessType.FIELD)

public class Inbentario {

    @XmlAttribute(required=true)
    private int id_biltegi;
    @XmlElement(name="stock")
    private int kopurua;
    
    public Inbentario(){}

    public Inbentario(int id_produktu,int id_biltegi, int kopurua){
        this.id_biltegi=id_biltegi;
        this.kopurua=kopurua;
    }

    public int getId_Biltegi(){
        return this.id_biltegi;
    }
      
    public void setId_Biltegi(int id_biltegi){
        this.id_biltegi = id_biltegi;
    }

    public int getKopurua(){
        return this.kopurua;
    }
      
    public void setKopurua(int kopurua){
        this.kopurua = kopurua;
    }

    @Override
    public String toString(){
        return ("Inberntarioa: Id_Biltegi= "+this.id_biltegi+" Kopurua= "+this.kopurua);
    }
}
