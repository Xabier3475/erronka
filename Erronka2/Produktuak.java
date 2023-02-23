import javax.xml.bind.annotation.*;

import javax.xml.bind.annotation.*;
import java.util.Arrays;

@XmlRootElement(name="produktuak")
public class Produktuak {

    @XmlElementWrapper (name="produktu_lista")
    @XmlElement(name="produktua")   
    private Produktu [] produktu;

    public Produktuak (){
        this.produktu = new Produktu [0];
    }

    public void addProduktu (Produktu p){
        this.produktu=Arrays.copyOf(this.produktu,this.produktu.length+1);
        this.produktu[this.produktu.length-1]=p;
    }

}
