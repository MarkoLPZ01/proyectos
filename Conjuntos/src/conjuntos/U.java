
package conjuntos;


import java.util.ArrayList;
import java.util.Set;
import java.util.TreeSet;


public class U {
    private Set ab = new TreeSet();
    
    public Set union(Set a, Set b){
       ab.addAll(a);
       ab.addAll(b);
       return ab;
    }
}
