# Chapter 1: Functional Interfaces

## Section 1.1: Interfaces in Java

In Java, an interface specifies one or more methods. The interface is a contract with must be honored by all
implementing classes.

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

See implementation here [TestTwoArgsProcessor.java](../interfaces/generic/impl/TestTwoArgsProcessor.java)

### Section 1.7.1: Generic Functional Interfaces with Type  Restrictions

Generic functional interfaces can be restricted to certain type. The class
in [CountyReceipt.java](../interfaces/generic/impl/restricted/CountyReceipt.java) extends
the [Receipt](../interfaces/five/Receipt.java) class to include county tax.

As a result, the version of [ReceiptPrinter](../interfaces/five/ReceiptPrinter.java) is no longer adequate. It should be
rewritten to be generic for classes that extend Receipt.

## Section 1.8: Specializing a Generic Functional Interface.

If the generic function interface of a particular type is used frequently, it is convenient to specialize it for that
type. Many examples exist in the Java API. Specialization is accomplished by extending or implementing the generic
functional interface of one type. The resulting interface or class is not generic for that type.

- Functional interface [TwoArgsProcessor](../interfaces/generic/TwoArgsProcessor.java) can be specialized for type
  Integer by defining a new functional interface that only processes
  Integers. [TwoIntsProcessor](../interfaces/generic/TwoIntsProcessor.java)

- [TwoArgsProcessor](../interfaces/generic/TwoArgsProcessor.java) can also be specialized by creating an abstract class
  that processes Integers. [TwoIntsProcessorAbstract](../interfaces/generic/TwoIntsProcessorAbstract.java)

The program in [TestTwoIntsProcessor](../interfaces/generic/impl/TestTwoIntsProcessor.java) demonstrates that the
functional interface `TwoIntsProcessor` is implemented by `multiplyInts`
and `subtractInts` and *abstract* class `TwoIntsProcessorAbstract` is extended by `divideInts`.
