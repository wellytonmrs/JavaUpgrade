# Compact Profiles in Java 8

Compact Profiles in Java 8 are subsets of the Java SE platform designed to cater to embedded and mobile devices with limited resources. 
They provide smaller runtime environments tailored for specific use cases, reducing memory footprint and startup time.

## Overview

- **Smaller Footprint**: Compact Profiles include subsets of the Java SE platform, ranging from `compact1` to `compact3`, each offering progressively more functionality.
- **Tailored for Embedded Devices**: These profiles are optimized for resource-constrained environments such as embedded systems and mobile devices.
- **Reduced Memory Usage**: By using Compact Profiles, you can reduce the memory footprint of your Java applications, making them more suitable for devices with limited resources.
- **Maintaining Compatibility**: Applications compiled with Compact Profiles can still run on standard Java runtime environments, ensuring compatibility across different platforms.

## Usage

To use a Compact Profile, you can specify it when launching your Java application using the `-profile` option followed by the desired profile name.

## Examples

Here are some examples demonstrating how to use Compact Profiles with different levels of functionality:

### Example 1: Using `compact1` Profile

Suppose you have a Java program that only requires basic functionality:

```java
public class BasicExample {
    public static void main(String[] args) {
        System.out.println("This is a basic example.");
    }
}
```

To run this program with `compact1` profile:

```
java -profile compact1 BasicExample
```

### Example 2: Using `compact2` Profile

If your application requires additional functionality beyond the basics, you can use `compact2` profile:

```java
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ConcurrentExample {
    public static void main(String[] args) {
        // Create a fixed-size thread pool with 5 threads
        ExecutorService executor = Executors.newFixedThreadPool(5);

        // Submit tasks to the thread pool
        for (int i = 0; i < 10; i++) {
            final int taskId = i;
            executor.submit(() -> {
                System.out.println("Task " + taskId + " executed by thread " + Thread.currentThread().getName());
            });
        }

        // Shutdown the thread pool
        executor.shutdown();
    }
}
```

To run this program with `compact2` profile:

```
java -profile compact2 AdvancedExample
```

### Example 3: Using `compact3` Profile

For applications needing even more functionality, `compact3` profile provides additional APIs:

```java
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;
import java.io.StringWriter;

@XmlRootElement
class Person {
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    @XmlElement
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    @XmlElement
    public void setAge(int age) {
        this.age = age;
    }
}

public class JAXBExample {
    public static void main(String[] args) throws Exception {
        // Create a JAXBContext
        JAXBContext context = JAXBContext.newInstance(Person.class);

        // Create a marshaller
        Marshaller marshaller = context.createMarshaller();

        // Create a person object
        Person person = new Person();
        person.setName("John Doe");
        person.setAge(30);

        // Marshal the person object to XML
        StringWriter writer = new StringWriter();
        marshaller.marshal(person, writer);
        String xml = writer.toString();
        System.out.println("XML representation:");
        System.out.println(xml);

        // Unmarshal the XML back to a person object
        Unmarshaller unmarshaller = context.createUnmarshaller();
        Person unmarshalledPerson = (Person) unmarshaller.unmarshal(new StringReader(xml));
        System.out.println("\nUnmarshalled person:");
        System.out.println("Name: " + unmarshalledPerson.getName());
        System.out.println("Age: " + unmarshalledPerson.getAge());
    }
}
```

To run this program with `compact3` profile:

```
java -profile compact3 ComprehensiveExample
```

## Conclusion

Compact Profiles in Java 8 offer a flexible way to optimize Java applications for resource-constrained environments without sacrificing compatibility. By choosing the appropriate profile, you can tailor your applications to meet the specific requirements of embedded and mobile devices.