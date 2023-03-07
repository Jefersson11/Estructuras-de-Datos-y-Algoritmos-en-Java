
// GCDemo.java


//Esta es la Segunda clase

class GCDemo {
   static class Node {
      String name;
      Node next;

      protected void finalize () throws Throwable {
         System.out.println ("Finalizing " + name);
      }
   }

   public static void main (String [] args) {
	 
	  // Este atributo del metodo que construira la estructura (BADC)

      Node top = new Node ();
      top.name = "C";
      top.next = null;

      Node temp = new Node ();
      temp.name = "D";
      temp.next = top;
      top = temp;

      temp = new Node ();
      temp.name = "A";
      temp.next = top;
      top = temp;

      temp = new Node ();
      temp.name = "B";
      temp.next = top;
      top = temp;
     
      // Este atributo del metodo que construira la estructura (BADC)
      dump ("Initial singly-linked list", top);

      top = null;
      temp = null;

      for (int i = 0; i < 100; i++)
           System.gc ();
   }
   
   // static encargado del nodo

   static void dump (String msg, Node topNode)  {
      System.out.print (msg + " ");

      while (topNode != null){
         System.out.print (topNode.name + " ");
         topNode = topNode.next;
      }
      System.out.println ();
   }
}