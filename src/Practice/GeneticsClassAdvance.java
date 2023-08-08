package Practice;

public class GeneticsClassAdvance <T extends Number> {
    T ob;
    GeneticsClassAdvance (T ob) {
        this.ob = ob;
    }
    double square(){
        return ob.intValue() * ob.doubleValue();
    }
}
