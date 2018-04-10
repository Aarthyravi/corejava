# Core Java
 ## String
 * String pool - String pool which is used to store the String values in Java(Collection memory of string type)
 * Heap memory -  Heap memory is used to store any created objects in Java. 
 * Stack memory - Variables allocated on the stack are stored directly to the memory.
            
       Ex:
         String str = new String("Java");   // new keyword creates new memory allocation on heap memory
         String str1 = new String("Java");
         String str2 = "Java";  // String datatype creates new allocation
         String str3 = "Java"; // second time for same data --> String datatype don't create new, it will point to the same allocation 
           str => &4000 => Java*   
           str1 => &5000 => Java*
           str2 => &6000 => Java <= str3
 ## Exception
   * Exception is an event that disrupts the normal flow of the program.
   try
   catch
   finally
   throw
   throws

 ## Maven Project  
  * Build / Project Management Tool
  
  * Maven defaultly take, JDK 1.5 version go to pom.xml and add the following build plugin to update the project to take jdk version 1.8

     <build>
      <plugins>
       <plugin>
        <groupId>org.apache.maven.plugins</groupId>
        <artifactId>maven-compiler-plugin</artifactId>
        <version>3.2</version>
        <configuration>
         <source>1.8</source>
         <target>1.8</target>
        </configuration>
       </plugin>
      </plugins>
     </build>
     
  * Again goto Maven Project(helloworld)-->right click --> Refresh   
  * goto maven project --> right click ---> Maven ---> Update Project...
  * wow... Suddenly Jdk 1.5 version got changed into JRE System Library[JavaSE-1.8]
  * If we click Run As---> maven install, then we can see the jar file.
      - [INFO] Building jar: C:\Users\Ravi\eclipse-workspace\helloworld\target\helloworld-0.0.1-SNAPSHOT.jar
  * jar file run on server
  * so, goto command prompt, type 
      * java -cp target/helloworld-0.0.1-SNAPSHOT.jar com.sample.util.App
      * C:\Users\Ravi\eclipse-workspace\helloworld>java -cp target/helloworld-0.0.1-SNAPSHOT.jar com.sample.util.App
         -Hello World!
      
     - 
  
