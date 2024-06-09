package Theory_questions;

public class Java_Theory_questions {
    /*
    1.What is JVM?
JVM (Java Virtual Machine) is a virtual machine that enables your computer to run a Java program.

When you write a Java program, the code is first converted into a special format called bytecode by the Java compiler.

The JVM then interprets this bytecode and converts it into machine-specific code that your computer can understand and execute.

You can write Java code once and run it on any device or platform that has a JVM installed.


   2.How many types of memory areas are allocated by JVM?
The Java Virtual Machine (JVM) allocates several types of memory when it runs a Java program. Some of them are:

Method Area: When you compile a Java class, it gets converted into bytecode and stored in the method area. This bytecode includes information about the class's methods and fields as well as the constant pool which contains constants used by the class (such as string literals or constant values).

Heap Memory: Whenever you create an object using the new keyword, Java allocates memory for it on the heap. This is where all the objects are stored. So, if you have a Person object called p, it will be stored in the heap.

Stack Memory: Whenever a Java method is called, Java creates a new stack frame on the stack to store all the method's local variables and method parameters. The stack memory is used for temporary storage, and once the method finishes executing, the stack frame is removed. Think of it like a stack of plates where you keep adding and removing plates as you eat.

PC Registers: The program counter (PC) register is a small area of memory that keeps track of the current instruction being executed by the Java Virtual Machine (JVM). For example, if you have a loop that iterates over an array, the PC register will keep track of the current index being accessed.

Native Area: This is the memory area where Java stores data and objects that are not managed by the JVM. For example, if you're calling a C library using JNI, any memory allocated by the C library will be stored in the native area. The native area is like a separate room in your house where you keep things that are not related to your daily activities.

    3.What is a JIT Compiler?
Just-In-Time (JIT) compiler is a type of compiler that is used to improve the performance of a Java program at runtime. It works by compiling bytecode into native machine code on the fly, as the program is executing, rather than ahead of time.

The JIT compiler is an important part of the Java runtime environment, as it allows the JVM to execute Java programs more efficiently.

It is typically transparent to the programmer and operates automatically in the background as the program runs.

    4.What are the two types of Exceptions in Java? Which are the differences between them?
There are two types of exceptions in Java: checked exceptions and unchecked exceptions.

Checked Exceptions: These are the exceptions that the Java compiler requires you to handle, either by catching them or by declaring them in the throws clause of the method in which they occur.

These are exceptions that are checked at compile time, and are generally used to indicate a recoverable error condition, such as an I/O exception or a parse error. For example,

try {
  FileInputStream fis = new FileInputStream("input.txt");
} catch (FileNotFoundException e) {
  System.out.println("File not found");
}
Unchecked Exceptions: These are the exceptions that are not checked at compile time and do not need to be handled or declared.

These are generally used to indicate a runtime error, such as a null pointer exception or an index out of bounds exception. For example,

int[] array = {1, 2, 3};
// this will throw an ArrayIndexOutOfBoundsException
System.out.println(array[3]);

    5.Can you explain the difference between a static and non-static method in Java?
A static method in Java is a method that is associated with a class rather than an instance of the class. This means that you can call a static method without creating an instance of the class.

A non-static method is a method that is associated with an instance of a class and can only be called on an instance of the class.

Some of the differences between static and non-static methods are:

Static methods have class-level scope, while non-static methods have object-level scope.
Static methods are stored in the class-level memory area, while non-static methods are stored in the heap.
Static methods can only access static variables and other static methods within the class. Non-static methods can access both static and non-static variables and methods within the class.
    6.Can you explain the difference between a static and non-static method in Java?
A static method in Java is a method that is associated with a class rather than an instance of the class. This means that you can call a static method without creating an instance of the class.

A non-static method is a method that is associated with an instance of a class and can only be called on an instance of the class.

Some of the differences between static and non-static methods are:

Static methods have class-level scope, while non-static methods have object-level scope.
Static methods are stored in the class-level memory area, while non-static methods are stored in the heap.
Static methods can only access static variables and other static methods within the class. Non-static methods can access both static and non-static variables and methods within the class.

7.Can you explain the difference between a static and non-static method in Java?
A static method in Java is a method that is associated with a class rather than an instance of the class. This means that you can call a static method without creating an instance of the class.

A non-static method is a method that is associated with an instance of a class and can only be called on an instance of the class.

Some of the differences between static and non-static methods are:

Static methods have class-level scope, while non-static methods have object-level scope.
Static methods are stored in the class-level memory area, while non-static methods are stored in the heap.
Static methods can only access static variables and other static methods within the class. Non-static methods can access both static and non-static variables and methods within the class.

8.Explain final variable, final method and a final class?
Final variables
Final variables cannot modified once they have been assigned a value. They must be initialized when they are declared or in a constructor. For example,

// create final variable
final int number = 34;

// change the value of the final variable
number = 24;

We have used the final keyword with the number variable. Assigning a new value to final variable will give us the following error.
error: cannot assign a value to final variable number
number = 24;
^
Final methods
Final methods that can't be overridden by a subclass. For example,

class Engine {

    // create a final method
    final void setEngine() {
    }
}

class PetrolEngine extends Engine {

    // try to override setEngine()
    void setEngine() {
    }
}

Now, if we run this code, we will get an error.

error: setEngine() in PetrolEngine cannot override setEngine() in Engine
    void setEngine() {
         ^
  overridden method is final
Final classes
Final classes can't be inherited.For example,

//create a final class
final class Person {

    void getDetails() {

    }
}

// inherit the final class
// error
class Student extends Person {

    // overridden method
    void getDetails() {

    }
}
When we run this code, we will get an error.

Main.java:11: error: cannot inherit from final Person
class Student extends Person {
                      ^
1 error

They can contain both final and non-final methods and variables.

9.Programming languages like C/C++ use pointers. Why does Java not make use of pointers?
Java doesn't make use of pointer because of following reasons;

To prevent direct memory manipulation

Pointers are variables that hold memory addresses, and they can be used to directly manipulate memory.

One can access some arbitrary memory location and do read and write operations on it. This introduces bugs and security vulnerabilities into a program.

Easy memory management

Pointers can be used to allocate and deallocate memory. However, it is tiresome for programmers to manage memory manually.

As java provides the automatic garbage collection feature so there is no need of pointers and it makes memory management easier.

Concept of reference

Java doesn't provide any explicit option to use pointers but they are used internally

Java has the concept of reference which is more simple and secure than pointer. Using Java reference you cannot directly access the memory address it points.

10.Can the main method be Overloaded?
We can overload the main() method in Java. However, the JVM will only recognize the main method with the following signature as the entry point for the program:

public static void main(String[] args)
If we want to overload the main() method, we can create additional main() methods with different parameter lists, but they will not be recognized as the entry point for your program.

class Main {
    public static void main(String[] args) {
        System.out.println("This is the main method with a String[] args parameter.");
    }

    public static void main(String arg1) {
        System.out.println("This is the main method with a String arg1 parameter.");
    }

    public static void main(int arg1) {
        System.out.println("This is the main method with an int arg1 parameter.");
    }
}
Output

This is the main method with a String[] args parameter.
As we can see, JVM executes only the original main() method by default and not the overloaded main() methods. We must call the overloaded main methods from the original main method to execute them

Generally, overloading the main() method is not a common practice and is not recommended.

11.What are the differences between JVM, JRE and JDK in Java?
In Java, the JVM (Java Virtual Machine), JRE (Java Runtime Environment), and JDK (Java Development Kit) are tools that serve unique purposes.

Some of the differences between them are:

JVM (Java Virtual Machine): The JVM is a virtual machine that runs Java bytecode. It is responsible for executing Java programs and for managing the memory and resources of the program.

JRE (Java Runtime Environment): The JRE is a package of tools that includes the JVM and other libraries and tools that are needed to run Java programs. It includes the JVM, class libraries, and other files that are required to run Java programs.

JDK (Java Development Kit): The JDK is a complete package of tools to develop Java applications. It includes the JRE, as well as tools for compiling, debugging, and testing Java programs.

12.What is a wrapper class in Java?
In Java, wrapper classes are classes that wrap primitive data types and provide them with object-oriented functionality. There is a wrapper class for each primitive data type in Java.

Here's a list of some primitive types along with their corresponding wrapper classes.

Primitive Data Type	Wrapper class
int	Integer
float	Float
double	Double
boolean	Boolean
char	Character
Since Java is an object-oriented language, sometimes we might need to use objects instead of primitive data types.

For example, while working with collections:

// Invalid Code
ArrayList<double> numbers = new ArrayList<>();

// Valid Code
ArrayList<Double> numbers = new ArrayList<>();
In the cases like above, wrapper classes help us use primitive types as objects.

13.Can a constructor be made final?
No, a constructor cannot be made final in Java. For example,

class Test {

    // error code
    final Test () {

    }
}
If we try to make a constructor final, we get the following error;

Main.java:3: error: modifier final not allowed here
    final Test () {
          ^
2 errors
Final methods prevents overriding. Constructors are also the special kind of methods but constructor cannot be inherited in subclass, hence there is no use of final keyword with constructor.

14.What is the difference between an interface and an abstract class?
An interface is a collection of abstract methods that defines a set of behaviors that a class can implement.

An abstract class is a class that contains one or more abstract methods, which are methods that do not have an implementation and must be implemented by a subclass.

There are several key differences between interfaces and abstract classes in Java:

Interfaces cannot have any implementation code, while abstract classes can have both abstract and non-abstract methods with implementation code.
A class can implement multiple interfaces, but it can only extend one abstract class.
An interface has no constructor, while an abstract class can have a constructor.
Variables declared in an interface are automatically public, static, and final, while variables in an abstract class can have any access modifier.

15.Can you explain the concept of a Java functional interface?
If a Java interface contains one and only one abstract method (method without a body) then it is a functional interface.


interface AddNumber{

    void add();

}
Here, the interface AddNumber has only one abstract method add(). Hence, it is a functional interface.

We can also use @FunctionalInterface annotation to indicate an interface as a functional interface.

@FunctionalInterface
interface AddNumber{

    void add();
}
@FunctionalInterface annotation allows only one abstract method.

16.Why is multiple inheritance not supported in java?
Java does not support multiple inheritance (a subclass has two or more superclasses) because of it's ambiguous nature.

Let's consider the following scenario.

Suppose we have class D that inherits from class B and class C. And class B and C inherits from class A which is an abstract class.

diamond problem that multiple inheritance can caused
Figure: diamond problem that multiple inheritance can caused
abstract class A {
    public abstract void doSomething();
}
// inherit abstract class A
class B extends A {
    @Override
    public void doSomething() {..}
}
// inherit abstract class A
class C extends A {
    @Override
    public void doSomething() {..}
}
// inherit class B and class C
class D extends B, C {
    // call method of superclass
    doSomething();
}
In the above code, class D is calling the method of superclass doSomething() method. This leads to the ambiguity as the compiler doesn't know which superclass method to execute.

Hence, Java doesn't support multiple inheritance. And as the diagram of the class is in diamond shape. It is called the diamond problem.

17.What is the difference between "throw" and "throws" in Java Exception Handling?
Both throw and throws are concepts of exception handling in Java.

The throws keyword is used to declare which exceptions a method might throw, while the throw keyword is used to explicitly throw an exception within a method or block of code.

Example using the throw keyword to throw an exception is:

if (value < 0) {
    throw new IllegalArgumentException("Value must be non-negative");
}
In this example, the throw keyword is used to throw an IllegalArgumentException if the value is negative.

Example of using the throws keyword to declare an exception that a method might throw:

public void doSomething() throws IOException {
    // implementation code
}
In this example, the doSomething() method declares that it might throw an IOException. This means that the caller of doSomething() must either handle the exception or declare that it throws the exception itself.

18.Why is it not possible to override the static method?
No, we cannot override static methods because method overriding is based on dynamic binding at runtime and the static methods are bonded using static binding at compile time.

If we try to override the static method of the derived class the method gets hidden by the static method of the base class.

class Base {

    // static method
    public static void print() {
        System.out.println("Hello! from base class");
    }
}

class Derived extends Base {

    // overide print() method of Base class
    public static void print() {
        System.out.println("Hello! from derived class");
    }
}
class Main {
    public static void main(String[] args) {

        Base baseObj = new Base();
        baseObj.print();

        Base derivedObj = new Derived();
        derivedObj.print();
    }
}
Output

Hello! from base class
Hello! from base class
As you can see, even when we call the overridden method of the Derived class, the static method from the Base class is called by Java.

Moreover, when we declare static method, it means it is a common method. There is no point in overriding and changing the working of the method that is supposed to be common.

19.Is it possible to override the overloaded method?
Yes, we can override the overloaded method in Java.

Method Overriding: When subclass provides a specific implementation of the method declared by the superclass, it is called method overriding.

Method Overloading: When there are two or more methods in a class with the same name but different numbers, types and order of parameters, it is called method overloading.

Let's see an example of overriding the overloaded method in Java.

class Base {

    public void display() {
        System.out.println("Normal method");
    }

     // overloaded display method
     public void display(String str)  {
         System.out.println("Overloaded method: " + str);
    }
}


class Derived extends Base {

    // overriding the overloaded method
    @Override
    public void display(String str)  {
        System.out.println("Overriding the overloaded method: " + str);
   }
}

class Main {
    public static void main(String args[ ])  {
       Base obj1 = new Base();
       obj1.display();
       obj1.display("Hello");
       obj1 = new Derived();
       obj1.display("Hello");
    }
}
Output

Normal method
Overloaded method: Hello
Overriding the overloaded method: Hello

20.Does a class inherit constructors of its superclass in Java?
In Java, a class does not inherit constructors from its superclass. However, a subclass can call the constructor of its superclass using the super keyword. For example,

class Animal {
    public Animal() {
        // constructor code goes here
    }
}

class Dog extends Animal {
    public Dog() {
        // calls the constructor of the superclass (Animal)
        super();
    }
}
Here, the Dog class extends the Animal class and calls the constructor of the Animal class using the super.

21.How instances of a class are created if no constructor is defined in the class in Java?
If we didn't define any constructor inside a class, Java automatically creates a default constructor and assigns a default value to the fields of the class.

Let's see an example,

class Student {

    int marks;

    public static void main(String[] args) {

        Student student1 = new Student();
        System.out.println("Marks: " + student1.marks);
    }
}
Output

Marks: 0
Here, we haven't assigned any value to the marks variable, however, we got the value 0.

It's because when we create the object

Student student1 = new Student();
a default constructor is created, which assigns default integer value, 0 to the marks.

The above code is equivalent to

class Student {

    int marks;

    // constructor
    Student() {
        marks = 0;
    }

    public static void main(String[] args) {

        Student student1 = new Student();
        System.out.println("Marks: " + student1.marks);
    }
}

// Output
// Marks: 0

22.A person says that he compiled a java class successfully without even having a main method in it? Is it possible?
It is possible to compile a Java class without a main() method, but it will not be possible to run the class as a standalone application.

However, we can still use the class as a part of another Java application by calling its methods and accessing its fields.

23.What's the difference between comparison done by equals method and == operator?
In Java, the equals() method is used to compare the contents of two objects, while the == operator is used to compare the references of two objects.

Let us see an example,

class Main {
    public static void main(String[] args) {

        String name1 = "Jack";
        String name2 = "Jack";
        String name3 = new String("Jack");

         // true - both variables point to the same object in memory
        System.out.println(name1 == name2);

        // false - name1 and name3 are two different objects in memory
        System.out.println(name1 == name3);

        // true - name1 and name3 have the same value, which is "Jack"
        System.out.println(name1.equals(name3));

	}
}

24.Is it correct to say that due to the garbage collection feature in Java, a java program never goes out of memory?
Once an object is eligible for garbage collection (GC), you don't have to worry about reclaiming the memory that object was using.

If your program gets low on memory, GC will destroy some or all of the eligible objects, to keep you from running out of RAM. You can still run out of memory, but not before all eligible objects have been hauled off to the dump.

25.Can you explain the difference between a HashMap and a Hashtable in Java?
The difference between HashMap and HashTable are as follows:

Synchronization

HashTable is synchornized which makes it thread-safe. We can share HashTable between multiple threads in our application.

Contrary to HashTable, HashMap is not synchronized and is not thread-safe by default. We cannot share HashMap between multiple threads in our application without synchornization code. We can use Collections.synchronizedMap() to make a thread-safe version of a HashMap.

Speed

HashMap is not synchronized, therefore it's faster and uses less memory than Hashtable. Generally, unsynchronized objects are faster than synchronized ones in a single threaded application.

Null Values

HashMap allows one null key and any number of null values, while Hashtable does not allow null keys or values.

Let use see an example of using null values in HashMap.

// create a HashMap
Map<String, Integer> hashMap = new HashMap<>();

// put a null key into the HashMap
hashMap.put(null, 2);


// put a null value into the HashMap
hashMap.put("test", null);
The above code would not create any problem.

Now, let's see an example of using null values in HashTable.

// create HashTable
Map<String, Integer> hashTable = new Hashtable<>();

// try to put a null key and value into the Hashtable
// this will throw a NullPointerException
hashTable.put(null, 2);
hashTable.put("text", null);
The put() method allows the null key and null value to be added to the HashMap, but it throws a NullPointerException when attempting to add them to the Hashtable.

26.Can you explain the difference between a local variable and an instance variable in Java?
In Java instance variable is a variable that is declared within the class (outside method) and is associated with the object of the class.

public class Person {

    // instance variable
    private String name;
}
We can access the instance variable from method or constructor of the same class or its subclasses.

public static void main (String[] args) {

    Person obj = new Person();

    // access instance variable name
    obj.name = "Simmy";
}
The lifetime of an instance variable is tied to the lifetime of the object they belong to.

On the contrary, a local variable is defined within a method or a block of code.

public void add() {
    int number = 11;
}
Local variables are only visible and can be accessed within the method or block in which they are defined.

public void print() {

    // error code
    // cannot access local variable number
    System.out.println(number);
}
They are created when the method or block is entered and destroyed when it exits, and their lifetime is limited to the execution of the code that defines them.

27.What are the differences between Heap and Stack Memory in Java?
Some of the key differences between heap memory and stack memory are:

Heap memory is used by all the parts of the application whereas stack memory is used only by one thread of execution.Stack memory contains local variable, and reference of an object. When we create an object it is stored in heap memory and the reference of the object is stored in the stack memory.
The objects in the heap are globally accessible whereas stack memory can't be accessed by other threads.
Stack memory uses LIFO technique to manage memory. Whereas it's more complex in Heap memory because it's used globally. Heap memory is divided into Young-Generation, Old-Generation etc.

28.What happens when the main() isn't declared as static?
Static variable, method or statement block can be called without creating any object (or instance) of the class in which it is declared.

If the main() method is not declared as static, then the JVM would have to create an instance of the class, which would require calling the constructor of the class.

However, the JVM does not know which constructor to call as there may be multiple constructors with different parameter lists.

Therefore, by declaring main() as static, we can ensure that it can be invoked without creating an instance of the class, which is necessary for the JVM to run the program.

When we execute a Java program, JVM loads the class containing the main() method and invokes it without creating an instance of the class.

This is why the main() method needs to be declared as static.

29.What are the differences between String, StringBuilder, and StringBuffer?
In Java, the String class represents an immutable sequence of characters. This means that once we create a String object, we cannot modify its value. If we need to modify a string, we must create a new string object.

However, StringBuilder and StringBuffer are mutable. This means that we can modify the value of a StringBuilder or StringBuffer object without creating a new object.

Furthermore, StringBuilder is faster than StringBuffer because it is not thread-safe. This means that StringBuilder is not suitable for use in multi-threaded environments, where multiple threads may access the same object simultaneously.

Let's look at the summary of the differences between String, StringBuilder, and StringBuffer.

Class	Mutable	Thread-safe
String	Immutable 	Yes
StringBuilder	Mutable 	No
StringBuffer	Mutable	Yes

30.Describe the process of multithreading in Java.
Multithreading is a programming concept in which we create small unit of tasks that can execute parallely.

A thread is a separate flow of execution within a Java program.
We can create a new thread by extending the Thread class or implementing the Runnable interface.
To start a new thread, we need to create an instance of the Thread class or Runnable interface and call the start() method on it.
The run() method of the Thread class or Runnable interface contains the code that will be executed by the new thread.
When we call the start() method, the new thread is added to the list of threads that the Java virtual machine (JVM) is executing.
The JVM will execute each thread concurrently, allowing multiple threads to run at the same time.
Multithreading can improve the performance of our program by allowing the CPU to switch between different threads and utilize idle time more effectively.

30.What is the difference between final, finalize and finally?
The differences between final, finalize, and finally in Java:

final
In Java final is the keyword with variables, methods, and classes to apply some restrictions. For example, if we use final with

Variables - we cannot change the value of the variable
Methods - we cannot perform method overriding
Classes - we cannot inherit the class
Let us see an example of final keyword in Java.

// create final variable
final int number = 34;

// change the value of the final variable
number = 24;
If we try to change the value of the final variable, we will get the following error:

error: cannot assign a value to final variable number
        number = 24;
        ^
1 error
finally
finally is used in a try-catch block to specify a block of code that will be executed regardless of whether an exception is thrown or not.

Let us see an example,

try {
    // code that may throw an exception
} catch (Exception e) {
    // exception handling code
} finally {
    // cleanup operations
    // will always be executed
}
finalize
finalize is a method that is called by the garbage collector when an object is no longer reachable. The finalize() method performs any necessary cleanup operations before the object is destroyed.

The syntax for the finalize() method is as follows:

protected void finalize() throws Throwable

}
We can use finalize() method by overriding the method.

31.What is enum? Can it be extended?
An enum or enumeration is a special kind of class that has a fixed set of constant (unchangeable) values.

We create an enum, by using the enum keyword.

enum Size {
    SMALL, MEDIUM, LARGE
}
Here, we have an enum named Size. It contains constant values: SMALL, MEDIUM, and LARGE. They are separated by commas.

Enum can't be extended. This means we cannot create a subclass of an enum because enums are inherently final and cannot be subclassed.

32.What is a System class in Java?
System class is a predefined class in the Java programming language that provides access to system resources and information.

For example, we can use the System class to print a message to the screen. Notice the code snippet below:

class Main {
  public static void main(String[] args) {
    System.out.println("Hello, world!");
  }
}
This program will print the message "Hello, world!" to the screen when it is run. Here, the System class is used to access the out field, which is a PrintStream object that can be used to write data to the standard output stream (usually the screen).

System class belongs to the java.lang package. The System class is a final class and you cannot inherit this class to override its methods.

Here are some important feature of the System class.

Standard input and output
Error output streams
Access to externally defined properties and environment variables
Built-in utility for copying a part of an array
Provides means for loading files and libraries

33.Does Java support global variables? Why/Why not?
Java does not have the concept of global variables in the way that some other programming languages do.

In Java, all variables must be declared within a class, and they are only accessible within the method in which they are declared or within methods defined in the same class. This is because Java follows Encapsulation.

Overall, the lack of global variables in Java is a design feature that helps to promote good programming practices and makes it easier to write robust and maintainable code.

34.Why do you need to use synchronized methods or blocks?
As Java supports multi-threading, two or more threads might try to access the same resource at the same time. This can cause problems if the threads are not properly synchronized.

To prevent these types of problems, we can use the synchronized keyword to synchronize access to shared resources. When a method or block of code is marked as synchronized, only one thread can execute the code at a time.

We can use the synchronized keyword as:

class Main {
    private int counter = 0;

    // this indicates only one thread can execute incrementCounter() at a time
    // such that the value of the counter variable is updated correctly
    public synchronized void incrementCounter() {
        counter++;
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.incrementCounter();
    }
}


35.What is the difference between an Iterator and a ListIterator?
Iterator is used to to traverse any type of collection. Whereas ListIterator is used to traverse only list collections. The major difference between an Iterator and a ListIterator are:

Traverse Direction

Iterator can only traverse in forward direction whereas ListIterator can traverse in both forward and backward directions.

Suppose we have the following list.

List<String> list = new ArrayList<>();
list.add("apple");
list.add("banana");
list.add("orange");
Let use try to traverse in both forward and backwards in the list using ListIterator.

// traverse forwards
ListIterator<String> listIterator = list.listIterator();
while (listIterator.hasNext()) {
    String element = listIterator.next();
    System.out.println(element);
}

// traverse backwards
while (listIterator.hasPrevious()) {
    String element = listIterator.previous();
    System.out.println(element);
}
The above code block will run without any error.

Now, let's try to traverse in both direction using Iterator.

Iterator<String> iterator = list.iterator();
while (iterator.hasNext()) {
    String element = iterator.next();
    System.out.println(element);
}

// will throw an error
while (iterator.hasNext()) {
    String element = iterator.pervious();
    System.out.println(element);
}
The above code block throws an error as the Iterator cannot traverse backward.

Furthermore, Listiterator supports CRUD operations, whereas Iterator only supports read and delete operations.

36.What is Polymorphism? How can we implement it in Java?
Polymorphism is an important concept of object-oriented programming. It simply means more than one form. That is, the same entity (method or operator) can perform different operations in different scenarios.

In Java, we can implements polymorphism with two ways:

1. Method Overriding

If subclass (child class) has the same method as declared in the parent class, it is known as method overriding in Java. For example,

// makeSound() in the superclass
class Animal {
    void makeSound() {
        System.out.println("Animal Sound");
    }
}

// makeSound() in the subclass
class Dog extends Animal {
    void makeSound() {
        System.out.println("Woof Woof");
    }
}
As you can see we are able to use the same method makeSound() to perform two different tasks, which is the basic principle of polymorphism.

2. Method Overloading

In Java, if two or more methods have same name but different numbers/types of parameters, it is known as method overloading.

// method with two parameters
void add(int number1, int number2) {
    int sum = number1 + number2;
    System.out.println("Sum of 2 digits: " + sum);
}

// method with 3 parameters
void add(int number1, int number2, int number3) {
    int sum = number1 + number2 + number3;
    System.out.println("Sum of 3 digits: " + sum);
}
In the example above, we are able to use the same method for two different purposes i.e., we've "polymorphed" the method.


















    */
}
