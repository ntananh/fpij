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
 
  