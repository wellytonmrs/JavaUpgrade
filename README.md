This project has the goal to document and exemplify the principal changes made to the java from 7 to 21.

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

# Java 9 Features and Improvements

1. **Modular System (Project Jigsaw)**:
   - Introduced the module system to organize code into modules.
   - Enables better encapsulation and improved maintainability.
   - Example: Creating custom modules using `module-info.java`.

2. **Private Methods in Interfaces**:
   - Interfaces can now have private methods.
   - Helps reduce code duplication and improves readability.
   - Example:
     ```java
     interface MyInterface {
         private void myPrivateMethod() {
             // Implementation
         }
     }
     ```

3. **Collection Factory Methods**:
   - Added convenient factory methods for creating immutable collections.
   - Example:
     ```java
     List<String> myList = List.of("Java", "Kotlin");
     ```

4. **Stream Improvements**:
   - New methods like `takeWhile`, `dropWhile`, and `ofNullable`.
   - Enhances stream processing capabilities.
   - Example:
     ```java
     myList.stream().takeWhile(s -> s.length() > 3).forEach(System.out::println);
     ```

# Java 10 Features and Improvements

1. **Local Variable Type Inference (var)**:
   - Allows type inference for local variables.
   - Reduces boilerplate code.
   - Example:
     ```java
     var myList = List.of("Java", "Kotlin");
     ```

2. **Optional.orElseThrow()**:
   - Simplifies handling of `Optional` values.
   - Throws an exception if the value is absent.
   - Example:
     ```java
     String result = myList.stream().findFirst().orElseThrow();
     ```

3. **Unmodifiable Collections with `copyOf()`**:
   - Creates unmodifiable views of collections.
   - Example:
     ```java
     List<String> unmodifiableList = List.copyOf(myList);
     ```

# Java 11 Features and Improvements

1. **New String Methods**:
   - `isBlank`, `lines`, `strip`, `stripLeading`, `stripTrailing`, and `repeat`.
   - Simplifies string manipulation.
   - Example:
     ```java
     String multilineString = "Baeldung helps\n\ndevelopers\nexplore Java.";
     List<String> lines = multilineString.lines()
             .filter(line -> !line.isBlank())
             .map(String::strip)
             .collect(Collectors.toList());
     ```

2. **Reading/Writing Strings to and from Files**:
   - New utility methods in the `Files` class.
   - Example:
     ```java
     Path filePath = Files.writeString(Files.createTempFile(tempDir, "demo", ".txt"), "Sample text");
     String fileContent = Files.readString(filePath);
     ```

3. **HTTP Client (JEP 321)**:
   - Integrated HTTP client for making HTTP requests.
   - Replaces the old `HttpURLConnection`.
   - Example:
     ```java
     HttpClient client = HttpClient.newHttpClient();
     HttpRequest request = HttpRequest.newBuilder()
             .uri(new URI("https://baeldung.com"))
             .build();
     HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
     ```