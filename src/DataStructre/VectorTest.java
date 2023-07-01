
package DataStructre;

import java.util.Iterator;
import java.util.Vector;

public class VectorTest {

    public static void main(String[] args) {
       
        Vector v=new Vector();
        v.add("cpu");
        v.add("disk");
        v.add("Ram");
        Iterator itr=v.iterator();
        System.out.println("");
        while(itr.hasNext()){
        System.out.print(itr.next());
        }
        System.out.println("");
        for(Object itr1:v){
            System.out.print(itr1);
        }
        
        
    }
    
}
