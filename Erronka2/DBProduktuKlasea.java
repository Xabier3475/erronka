import java.util.Arrays;
import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.*;

@XmlRootElement(name="produktuak")
public class DBProduktuKlasea {
    @XmlElementWrapper (name="produktu_lista")
    @XmlElement(name="produktua")
    private Produktu [] p;
    
    public DBProduktuKlasea(){
      p=new Produktu [0];
   }
     
   public void addProduktu(Produktu po){
      this.p=Arrays.copyOf(this.p,this.p.length+1);
      this.p[this.p.length-1]=po;    
  }

  public String toString(){
      return (Arrays.toString(this.p));
  }
}
