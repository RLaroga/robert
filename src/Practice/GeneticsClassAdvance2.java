package Practice;

public class GeneticsClassAdvance2 <T extends Number> {
    T num;

    GeneticsClassAdvance2(T ob){
        this.num = ob;
    }

    boolean absEqual(GeneticsClassAdvance2<?> ob){
        if (Math.abs(num.doubleValue()) == Math.abs(ob.num.doubleValue())) {
            return true;
        }
        return false;
    }
}
