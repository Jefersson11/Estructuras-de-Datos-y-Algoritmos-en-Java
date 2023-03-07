// CIDemojava
//Esta es la tercera clase del programa java
class CIDemo {
   
   static class DictEntry {
      String word;
      String meaning;
      DictEntry next;
   }

   // ListInfo es necesario porque buildList() debe devolver las dos partes
   static class ListInfo {
      DictEntry top;
      DictEntry last;
   }
// Este atributo del metodo que construira la concatenación 
   public static void main (String [] args) {
      String [] wordsMaster = { "aardvark", "anxious", "asterism" };

      ListInfo liMaster = new ListInfo ();
      buildList (liMaster, wordsMaster);

      dump ("Master list =", liMaster.top);

      String [] wordsWorking = { "carbuncle", "catfish", "color" };
      ListInfo liWorking = new ListInfo ();
      buildList (liWorking, wordsWorking);

      dump ("Working list =", liWorking.top);

      // Sigue trabajando la concatenación 

      liMaster.last.next = liWorking.top;
      dump ("New master list =", liMaster.top);

      invert (liMaster);
      dump ("Inverted new master list =", liMaster.top);
   }

   static void buildList (ListInfo li, String [] words) {
      if (words.length == 0)
          return;
      
   //  Creara un nodo para el primer segmento

      li.top = new DictEntry ();
      li.top.word = words [0];
      li.top.meaning = null;

      // Inicializa la última variable de referencia simplificando la adición


      li.last = li.top;

      for (int i = 1; i < words.length; i++) {
    	  
    	 //Hace posible la concatenación. 

          
    	  // Creara el siguiente nodo
           li.last.next = new DictEntry ();
           li.last.next.word = words [i];
           li.last.next.meaning = null;

           // Se encarga de avanzar la ultima variable 
           

           li.last = li.last.next;
      }
    // Agrega y hace posible la concatenación 
      li.last.next = null;
   }

   static void dump (String msg, DictEntry topEntry) {
      System.out.print (msg + " ");

      while (topEntry != null) {
         System.out.print (topEntry.word + " ");
         topEntry = topEntry.next;
      }
      System.out.println ();
   }

   static void invert (ListInfo li) {
      DictEntry p = li.top, q = null, r;

      while (p != null)  {
         r = q;
         q = p;
         p = p.next;
         q.next = r;
      }
      li.top = q;
   }
}