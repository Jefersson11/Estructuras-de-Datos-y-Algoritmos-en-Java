// DLLDemo.java


//Esta es la tercera clase del programa java
class DLLDemo {
   static class Node {
      String name;
      Node next;
      Node prev;
   }

   
   // Encargado de crear la lista que se hara posible el enlazar los nodos
   public static void main (String [] args) {
      

      Node topForward = new Node ();
      topForward.name = "A";

      Node temp = new Node ();
      temp.name = "B";

      Node topBackward = new Node ();
      topBackward.name = "C";

      topForward.next = temp;
      temp.next = topBackward;
      topBackward.next = null;

      topBackward.prev = temp;
      temp.prev = topForward;
      topForward.prev = null;

      // Se encargara de enviar una la lista de enlaces

      System.out.print ("Forward singly-linked list: ");

      temp = topForward;
      while (temp != null){
         System.out.print (temp.name);
         temp = temp.next;
         
      //Se enviara hacia adelante
      }

      System.out.println ();

      // Se encargara de enviar una la lista de enlaces

      System.out.print ("Backward singly-linked list: ");

      temp = topBackward;
      while (temp != null){
         System.out.print (temp.name);
         temp = temp.prev;
         
       //Se enviara hacia atras
      }

      System.out.println ();

      // Este es el Nodo de la categoria B 

      temp = topForward.next;

      // Este es el Nodo de la categoria B que se encargara de eliminarlo

      temp.prev.next = temp.next;
      temp.next.prev = temp.prev;
      

      System.out.print ("Forward singly-linked list (after deletion): ");

      temp = topForward;
      while (temp != null){
         System.out.print (temp.name);
         temp = temp.next;
      }

      System.out.println ();

      // Se encargara de redireccionarlo hacia el final de la lista de los nodos

      System.out.print ("Backward singly-linked list (after deletion): ");

      temp = topBackward;
      while (temp != null){
         System.out.print (temp.name);
         temp = temp.prev;
      }
      System.out.println ();
   }
}
