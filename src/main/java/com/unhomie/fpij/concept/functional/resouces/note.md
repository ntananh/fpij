# Chapter 1: Functional Interfaces

## Section 1.1: Interfaces in Java

In Java, an interface specifies one or more methods. The interface is a contract with must be honored by all implementing classes.

## Section 1.2: Enhancements to Interfaces in Java 8 and Java 9 
- _default_ method is an implementation provided by the interface
  that does not have to be overridden by an implementing class
  _default_ methods help in the compilation of legacy code.

- In Java 9, interfaces are allowed to have private method,
  private methods are useful to call from default methods.

- In Java 9, interfaces can also have private static methods.
  Since the static methods of an interface can be called without creation of
  an implementing object, these methods can oly called by public static methods defined in the interface.

## Section 1.3: Functional Interfaces Defined

A *functional interface* is an interface with a single abstract method, call its *functional method*.

```java

@FunctionalInterface
interface StringProcessor {
  String process(String x);
}

``` 

## Section 1.4: Implementing Functional Interfaces with Pre-Java 8 Constructs

A functional interface can be implemented by defining a named class that provides the functional method

```java

class NamedStringProcessor implements StringProcessor {
  @Override
  public String process(String s) {
    return s;
  }
}

```

A functional interface can also be implemented by an anonymous class that provides the functional method.

```

StringProcessor anonSP = new StringProcessor() {
  @Override
  public String process(String x){
    return x.toUpperCase();
  }
};

```

## Section 1.5: Providing Default Methods in Functional Interfaces

A functional interface can provide default methods. An implementing class can use the default methods or provide its own
versions. [Default Methods](../interfaces/five)

## Section 1.6: Providing Static Methods in Functional Interfaces

A functional interface can also have static methods. Static methods are useful to define helper methods that are not
meant to be overridden by implementing classes. [StringProcessor.java](../StringProcessor.java)

## Section 1.7: Generic Functional Interfaces

Many of the functional interfaces defined in the Java API are generic for one or more types. Suppose a program needs
methods that take two arguments of a type and returns a result of the same type, but both the type and the operation
performed can vary.

A functional interface can be defined that is generic for type X and has a functional method that accepts two arguments
of type X and return a value of type X. [TwoArgsProcessor.java](../interfaces/generic/TwoArgsProcessor.java)

See implementation here [TestTwoArgsProcessor.java](../interfaces/generic/TestTwoArgsProcessor.java)

