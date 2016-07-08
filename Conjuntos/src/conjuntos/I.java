
package conjuntos;

import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;

public class I {
    private Set ab = new TreeSet();
    
    public Set Interseccion(Set a, Set b){
        ab.addAll(a);
        ab.retainAll(b);
        return ab;
    }
    
}
