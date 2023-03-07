// SLLInsDemo.java

	//Esta es la primera clase  
class SLLInsDemo {
   static class Node  {
      String name;
      Node next;
   }

   public static void main (String [] args) {
      Node top = null;

     //La lista no existe individualmente entrelazada

      top = new Node ();
      top.name = "A";
      top.next = null;

      dump ("Case 1", top);

      //Esta es la lista individualmente existente
      
      // Se encuentra antes del primer Nodo
      Node temp;

      temp = new Node ();
      temp.name = "B";
      temp.next = top;
      top = temp;

      dump ("Case 2", top);

      //Esta es la lista individualmente existente que se debe insertar
      

      temp = new Node ();
      temp.name = "C";
      temp.next = null;
      
      // Este es el sigueinte nodo que esta luego del ultimo
      Node temp2;

      temp2 = top;

      while (temp2.next != null)
         temp2 = temp2.next;

      temp2.next = temp;

      dump ("Case 3", top);

     //Esta es la lista individualmente existente que se debe insertar
     

      temp = new Node ();
      temp.name = "D";
      
     //Seencuentra en la mitad de los dos Nodos
      
      temp2 = top;

      while (temp2.name.equals ("A") == false)
         temp2 = temp2.next;

      temp.next = temp2.next;
      temp2.next = temp;

      dump ("Case 4", top);
   }

   static void dump (String msg, Node topNode) {
      System.out.print (msg + " ");

      while (topNode != null) {
         System.out.print (topNode.name + " ");
         topNode = topNode.next;
      }
      System.out.println ();
   }
}