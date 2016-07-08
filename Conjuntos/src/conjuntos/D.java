
package conjuntos;


import java.util.Set;
import java.util.TreeSet;


public class D {
    private Set ab = new TreeSet();
    
    public Set Diferencia(Set a, Set b){
        ab.addAll(a);
        ab.removeAll(b);
        return ab;
    }
}
