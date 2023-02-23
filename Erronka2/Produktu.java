import javax.xml.bind.annotation.*; 

@XmlRootElement(name="produktua")
@XmlType(propOrder={"id","id_kategoria","izena","deskribapena","balioa","une_salneurria"})
@XmlAccessorType(XmlAccessType.FIELD)

public class Produktu{
   @XmlAttribute(required=true)
   private int id;
   @XmlAttribute(required=true)
   private int id_kategoria;
   @XmlElement(name="izena")
   private String izena;
   @XmlElement(name="deskribapena")
   private String deskribapena;
   @XmlElement(name="balioa")
   private double balioa;
   @XmlElement(name="une_salneurria")
   private double une_salneurria;

   public Produktu(){}

   public Produktu(int id,int id_kategoria,String izena,String deskribapena,double balioa,double une_salneurria){
      this.id=id;
      this.id_kategoria=id_kategoria;
      this.izena=izena;
      this.deskribapena=deskribapena;
      this.balioa=balioa;  
      this.une_salneurria=une_salneurria;
   }
   
   public int getId(){
      return this.id;
   }
   
   public void setId(int id){
      this.id=id;
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
   
   public String getDeskribapena(){
      return this.deskribapena;
   }
   
   public void setDeskribapena(String deskribapena){
      this.deskribapena=deskribapena;
   }
   
   public double getBalioa(){
      return this.balioa;
   }
   
   public void setBalioa(double balioa){
      this.balioa=balioa;
   }
   
   public double getUne_salneurria(){
      return this.une_salneurria;
   }
   
   public void setUne_salneurria(double une_salneurria){
      this.une_salneurria=une_salneurria;
   } 
   
   @Override
   public String toString(){
      return("Produktua: Kodea: "+this.id+" Izena: "+this.izena+"  Id Kategoria: "+this.id_kategoria +" Deskribapena: "+this.deskribapena+" Balioa: "+this.balioa+" Uneko_Salneurria: "+this.une_salneurria);
   }

}