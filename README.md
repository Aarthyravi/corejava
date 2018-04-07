# Core Java
 ## String
 * String pool - String pool which is used to store the String values in Java(Collection memory of string type)
 * Heap memory -  Heap memory is used to store any created objects in Java. 
 * Stack memory - Variables allocated on the stack are stored directly to the memory.
            
       Ex:
         String str = new String("Java");
         String str1 = new String("Java");
         String str2 = "Java";
         String str3 = "Java";
           str => &4000 => Java*   
           str1 => &5000 => Java*
           str2 => &6000 => Java <= str3

   
