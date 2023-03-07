// InsSortDemo.java

//Esta es la cuarta clase del programa java
class InsSortDemo {

   // Metodos Constructores y que no son constructores y que estan presentes 

   static class Employee {
      int empno;
      String name;
      
      Employee next;
      Employee prev;
   }

   public static void main (String [] args) {

      int [] empnos = { 687, 325, 567, 100, 987, 654, 234 };
      String [] names = { "April", "Joan", "Jack", "George", "Brian", "Sam", "Alice" };

      Employee topForward = null;
      Employee topBackward = null;

      //Completa  la lista dos veces y creara el primer nodo. 

      topForward = new Employee ();
      topForward.empno = empnos [0];
      topForward.name = names [0];
      topForward.next = null;
      topForward.prev = null;
      topBackward = topForward;

      // Ingresara los nodos de empleados restantes 
 

      for (int i = 1; i < empnos.length; i++) {
    	  
    	  
    	  //Se realizara en orden ascendente
           Employee e = new Employee ();
           e.empno = empnos [i];
           e.name = names [i];
           e.next = null;
           e.prev = null;

           // Entrara a biscar y localizar el primer nodo Empleado de nodo que se va insertar

           Employee temp = topForward;
           while (temp != null && temp.empno <= e.empno)
        	// temp es nulo
              temp = temp.next;

            //El nodo Empleado se agregara  
           if (temp == null) {
              
              topBackward.next = e; // Append new Employee node to
           // entrelazada individualmente para reenviar la lista
                    
              e.prev = topBackward; // Update backward singly linked 
              topBackward = e;      // list as well.

           }
           else{
               if (temp.prev == null) {
                  e.next = topForward; // Insert new Employee node at 
                  topForward = e;      // head of forward singly linked
                                       // list.
                  temp.prev = e;       // Update backward singly linked
                                       // list as well.
               }
               else {
                  e.next = temp.prev.next; // Insert new Employee node 
                  temp.prev.next = e;      // after last Employee node
                                           // whose empno is smaller in
                                           // forward singly linked list.
                  e.prev = temp.prev;      // Update backward
                  temp.prev = e;           //singly linked list as well.
               }
           }
      }

      System.out.println ("Ascending order:\n");

      Employee temp = topForward;
      while (temp != null) {
         System.out.println ("[" + temp.empno + ", " + temp.name + "] ");
         temp = temp.next;
      }

      System.out.println ();

      System.out.println ("Descending order:\n");
      
      temp = topBackward;
      while (temp != null) {
         System.out.println ("[" + temp.empno + ", " + temp.name + "] ");
         temp = temp.prev;
      }

      System.out.println ();
   }
}