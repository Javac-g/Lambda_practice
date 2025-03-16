# Java Lambda Expressions Practice

<div id="header">
  <img src="https://github.com/Javac-g/Lambda_practice/blob/master/LAMBDAS.png?raw=true"/>
</div>

## Overview

This repository is dedicated to practicing and mastering **Java Lambda Expressions**, based on **Herbert Schildt's - Java 8 Complete Reference**. The goal is to understand functional programming concepts in Java, including lambda expressions, method references, and functional interfaces.

## Topics Covered

| Topic | Description |
|-------------------------------|----------------------------------------------------------------|
| **Functional Interface (SAM)** | Understanding Single Abstract Method (SAM) interfaces. |
| **Lambda One-line Expressions** | Writing simple lambda expressions using concise syntax. |
| **Block Lambda Expressions** | Using multi-line lambda expressions for complex logic. |
| **Lambda Expressions as Method Arguments** | Passing lambda expressions as parameters to methods. |
| **Method References** | Referencing instance and static methods using the `::` operator. |
| **Static Method References** | Calling static methods directly within lambda expressions. |
| **References to Static Members** | Using method references with interfaces that accept two parameters. |
| **Constructor References** | Using lambda expressions to refer to constructors. |

## Detailed Sections

### Functional Interfaces & Lambda Expressions
Functional interfaces contain a **single abstract method (SAM)** and serve as the foundation for lambda expressions.
```java
@FunctionalInterface
interface MyFunction {
    int calculate(int a, int b);
}

public class LambdaExample {
    public static void main(String[] args) {
        MyFunction sum = (a, b) -> a + b;
        System.out.println(sum.calculate(5, 10)); // Output: 15
    }
}
```

### Block Lambda Expressions
Block lambdas allow for multiple statements within the lambda body.
```java
@FunctionalInterface
interface Factorial {
    int compute(int n);
}

public class BlockLambdaExample {
    public static void main(String[] args) {
        Factorial fact = (n) -> {
            int result = 1;
            for (int i = 1; i <= n; i++) {
                result *= i;
            }
            return result;
        };
        System.out.println(fact.compute(5)); // Output: 120
    }
}
```

### Method References
#### Instance Method Reference
```java
class StringUtils {
    public String reverse(String str) {
        return new StringBuilder(str).reverse().toString();
    }
}

public class MethodReferenceExample {
    public static void main(String[] args) {
        StringUtils utils = new StringUtils();
        Function<String, String> reverser = utils::reverse;
        System.out.println(reverser.apply("Lambda")); // Output: adbmaL
    }
}
```
#### Static Method Reference
```java
class MathUtils {
    public static int square(int x) {
        return x * x;
    }
}

public class StaticMethodReferenceExample {
    public static void main(String[] args) {
        Function<Integer, Integer> squareFunction = MathUtils::square;
        System.out.println(squareFunction.apply(6)); // Output: 36
    }
}
```

### Constructor References
Constructor references allow lambda expressions to refer to class constructors.
```java
class Person {
    String name;
    Person(String name) { this.name = name; }
}

public class ConstructorReferenceExample {
    public static void main(String[] args) {
        Function<String, Person> personCreator = Person::new;
        Person p = personCreator.apply("John");
        System.out.println(p.name); // Output: John
    }
}
```


## Getting Started

### Prerequisites
- Java 8 or later
- Maven or Gradle (for dependency management)
- IDE such as IntelliJ IDEA or VS Code

### Clone the Repository
```sh
git clone https://github.com/Javac-g/Lambda-practice.git
cd Lambda-practice
```

### Running the Examples
Compile and execute the examples using:
```sh
mvn clean compile exec:java -Dexec.mainClass="lambda.LambdaExpressions"
```


## Features to Explore
- Using lambda expressions for functional programming.
- Exploring different types of method references.
- Implementing functional interfaces efficiently.
- Understanding constructor references.
- Performance comparison of lambda expressions vs. anonymous classes.

## Contributing
Feel free to fork this repository and contribute by adding more lambda-related examples or optimizing existing ones.

## License
This project is licensed under the MIT License.

