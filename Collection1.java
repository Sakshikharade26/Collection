
import java.util.*;

public class Collection1 {

    public static void main(String[] args) {
        
    

    LinkedList<Integer> lobj = new LinkedList<Integer>();

        lobj.add(40);
        lobj.add(60);
        lobj.add(30);
        lobj.add(10);
        lobj.add(2,50);

       // System.out.println(lobj);

        //lobj.addFirst(5);

        //lobj.clear();
      // lobj.descendingIterator();
       

        System.out.println(lobj);
        /*  if(lobj.contains(30)){
            System.out.println("LL contains in it");
        }
        else{
            System.out.println("There is no 30 in the LL");
        } */

       // System.out.println("Index of 30 is:" + lobj.indexOf(30));
        
      Iterator iobj = lobj.iterator();
      lobj.descendingIterator();

       /*  while(iobj.hasNext()){
            System.out.println(iobj.next());
        } */

        /*for(int i :lobj){
            System.out.println(i);
        }*/

         /*lobj.removeLast();
         System.out.println(lobj);
         lobj.clear();*/
        } 
        
}
  

