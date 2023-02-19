import javax.xml.bind.annotation.*; 

@XmlRootElement(name="kategoria")
@XmlType(propOrder={"id_kategoria","izena"})
@XmlAccessorType(XmlAccessType.FIELD)

public class Kategoria {
    @XmlAttribute(required=true)
    private int id_kategoria;
    @XmlElement(name="izena")
    private String izena;

    public Kategoria(){}

    public Kategoria(int id_kategoria,String izena){
        this.id_kategoria=id_kategoria;
        this.izena=izena;
    }

    public int getKategoria(){
        return this.id_kategoria;
    }
 
    public void setKategoria(int id_kategoria){
        this.id_kategoria=id_kategoria;
    }
 
    public String getIzena(){
        return this.izena;
    }
 
    public void setIzena(String izena){
        this.izena=izena;
    }

    @Override
    public String toString(){
        return("Produktua:  Kategoria: "+id_kategoria +"Izena: "+ izena);
    }
}
