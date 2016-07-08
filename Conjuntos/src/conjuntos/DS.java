
package conjuntos;

import java.util.Set;
import java.util.TreeSet;


public class DS {
    private Set ab = new TreeSet();
    private U u = new U();
    
    private D d = new D();
    private D d1 = new D();
    
    public Set DSim(Set a, Set b){
        ab = u.union(d1.Diferencia(a, b),d.Diferencia(b, a));
        return ab;
    }
}
