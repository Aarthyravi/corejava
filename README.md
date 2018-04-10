# Core Java
 ## Eclipse workspace
   java project -> core java project
   spring boot project -> Spring Starter
   Enterprise web application -> dynamic web app
  Mostly we will use one of them.
 * .class file is the  target file in java application.
 * when you build a huge project lot of classes are there,then we have to zip that files.
 * All *.class files are three types of file --> arch file(group of .class files and external files[config files,property files]
 * Three types of archives files 
            .jar --> java archive -> core Java 
            .war --> web archive -> core java + adv.java + HTML +serverlet
            .ear --> Enterprise archive ->  core java + adv.java + HTML +serverlet + EJB(Enterprise JavaBeans that is the server-side  
                                                                                         component architecture for Java Platform)
 
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
     Apache Maven --> pom.xml
     Gradle --> build.gradle 
  * Build / Project Management Tool
  
  * Maven defaultly take, JDK 1.5 version go to pom.xml and add the following build plugin to update the project to take jdk version 1.8
  * pom.xml(Project Object Model)
      - It tells what project object is available
      - we have to add any third pary Libraries in pom.xml file within <dependency>...</dependency>
  * maven clean --> it clean the entire target folder.(jar & class files too)

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
      - maven install -->it creates a folder called target and put the .jar / .war file and the class files in classes folder
      - [INFO] Building jar: C:\Users\Ravi\eclipse-workspace\helloworld\target\helloworld-0.0.1-SNAPSHOT.jar
  * jar file run on server
  * so, goto command prompt, type 
      * java -cp target/helloworld-0.0.1-SNAPSHOT.jar com.sample.util.App
      * C:\Users\Ravi\eclipse-workspace\helloworld>java -cp target/helloworld-0.0.1-SNAPSHOT.jar com.sample.util.App
         -Hello World!
      
     
  
