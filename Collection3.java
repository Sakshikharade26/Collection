//Collection vector program
import java.util.*;
public class Collection3 
{

    public static void main(String args[])
    {
      Vector<Float> vobj = new Vector<Float>();
        
       vobj.add(10.6f);
       vobj.add(20.6f);
       vobj.add(30.6f);
       vobj.add(40.6f);
       vobj.add(50.6f);

       Iterator iobj = vobj.iterator();

       while(iobj.hasNext())
       {
        System.out.println(iobj.next());
       }

       vobj.clear();


    }
    
}
