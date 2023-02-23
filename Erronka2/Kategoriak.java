import javax.xml.bind.annotation.*;
import java.util.Arrays;

@XmlRootElement(name="kategoriak")
public class Kategoriak {
    @XmlElementWrapper (name="kategoria_lista")
    @XmlElement(name="kategoria") 
    private Kategoria [] kategoria;

    public Kategoriak (){
        this.kategoria = new Kategoria [0];
    }

    public void addKategoria (Kategoria k){
        this.kategoria=Arrays.copyOf(this.kategoria,this.kategoria.length+1);
        this.kategoria[this.kategoria.length-1]=k;
    }    
}
