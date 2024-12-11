//collection program using Hashtable.

import java.util.*;
public class Collection5 
{
    public static void main(String args[])
    {
     Hashtable<String,Integer> hobj = new Hashtable<String,Integer>();

     hobj.put("PPA,18000");
     hobj.put("LB ,17000");
     hobj.put("Python,16000");
     hobj.put("LSP",21000);

     System.out.println(hobj.get("Python"));
     hobj.remove("LB");

     Enumeration eobj = hobj.keys();

     while(eobj.hasMoreElements())
     {
        System.out.println("Data is"+eobj.nextElement());
     }
    }
    
}
