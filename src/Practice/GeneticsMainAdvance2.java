package Practice;

import Practice.GeneticsClassAdvance2;

public class GeneticsMainAdvance2 {
    public static void main (String [] args){
        GeneticsClassAdvance2<Integer> iOb = new GeneticsClassAdvance2<>(6);
        GeneticsClassAdvance2<Double> dOb = new GeneticsClassAdvance2<>(-6.0);

        System.out.println(iOb.absEqual(dOb));
    }
}
