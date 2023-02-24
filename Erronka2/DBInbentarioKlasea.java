import java.util.Arrays;

public class DBInbentarioKlasea{
    private Inbentario [] i;

    public DBInbentarioKlasea(){
        i = new Inbentario [0];
    }

    public void addInbentario(Inbentario i){
        this.i=Arrays.copyOf(this.i,this.i.length+1);
        this.i[this.i.length-1]=i;    
    }
}