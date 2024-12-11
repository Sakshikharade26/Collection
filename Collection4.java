//collection program using stack.

import java.util.*;
public class Collection4
{
    public static void main(String args[])
    {
      Stack<Character> sobj = new Stack<Character>();

      sobj.push('A');
      sobj.push('B');
      sobj.push('c');
      sobj.push('D');
      sobj.push('E');

      System.out.println("Elements of stack:"+ sobj);

      System.out.println( "poped elsements is:"+ sobj.pop());

      System.out.println("Elements of stack:" + sobj);

      while(sobj.isEmpty()){
        System.out.println(sobj.pop());
      }


    }    
}
