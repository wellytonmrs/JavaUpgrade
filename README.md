Certainly! Below is the formatted `README.md` content summarizing the key changes from Java 7 to Java 8:

---

# Java 8 Features and Improvements

Java 8 introduced several powerful features and enhancements that significantly impacted the way we write Java code. Let's explore some of the key changes:

1. **Lambda Expressions**:
   - Lambda expressions allow concise representation of anonymous functions.
   - Enables functional programming constructs, making code more expressive.
   - Example:
     ```java
     (x, y) -> x + y
     ```

2. **Streams API**:
   - The Streams API provides a powerful way to process collections of data.
   - Allows parallel processing and functional-style operations (e.g., `map`, `filter`, `reduce`).
   - Example:
     ```java
     List<Integer> evenNumbers = numbers.stream()
             .filter(n -> n % 2 == 0)
             .collect(Collectors.toList());
     ```

3. **Default Methods**:
   - Interfaces can now have default method implementations.
   - Helps evolve existing interfaces without breaking backward compatibility.
   - Example:
     ```java
     interface MyInterface {
         default void myDefaultMethod() {
             // Implementation
         }
     }
     ```

4. **Functional Interfaces**:
   - New annotations (`@FunctionalInterface`) indicate functional interfaces.
   - Ensures that an interface has exactly one abstract method.
   - Example:
     ```java
     @FunctionalInterface
     interface MyFunctionalInterface {
         void myAbstractMethod();
     }
     ```

5. **Method References**:
   - Simplifies lambda expressions by referring to methods directly.
   - Example:
     ```java
     list.forEach(System.out::println);
     ```

6. **Date and Time API**:
   - The `java.time` package provides improved date and time handling.
   - Replaces the old `Date` and `Calendar` classes.
   - Example:
     ```java
     LocalDate today = LocalDate.now();
     ```

7. **Type Annotations**:
   - Annotations can be applied to types (e.g., `int`, `String`, etc.).
   - Useful for tools like static analyzers and code quality checks.
   - Example:
     ```java
     @NonNull String myString;
     ```

8. **Nashorn JavaScript Engine**:
   - A lightweight JavaScript engine integrated into the JDK.
   - Allows executing JavaScript code from Java.
   - Example:
     ```java
     ScriptEngine engine = new ScriptEngineManager().getEngineByName("nashorn");
     ```

9. **Compact Profiles**:
   - Introduced smaller profiles for embedded and mobile devices.
   - Includes subsets of the Java SE platform.
   - Example:
     ```java
     java -profile compact1 MyProgram
     ```

10. **PermGen Removal**:
    - The permanent generation (PermGen) was removed.
    - Class metadata is now stored in native memory (Metaspace).
    - Improved memory management.
    - No more `OutOfMemoryError: PermGen space`.

---

