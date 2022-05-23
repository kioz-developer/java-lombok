package com.example.lombok;

import com.example.lombok.features.*;
import lombok.val;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.Selector;
import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class JavaLombokApplication {

    public static void main(String[] args) {

        // val
        // Infer the type and add make it 'final'
        val list = ValExample.getValue();
        System.out.println(list); // [fire, water]

        // var
        // Infer the type but DO NOT make it 'final'
        // Java 10 added the var keyword, so var can simply be used without the import.
        var map = VarExample.getValue();
        System.out.println(map); // {latitude=-21.00508, longitude=45.85421}

        // NonNull
        // Throws a NullPointerException("name is marked non-null but is null")
        // new NonNullExample(null);

        // @Cleanup
        // Automatically close given resources
        try {
            Selector selector = CleanupExample.readAll();
            System.out.println("Is the stream open? " + selector.isOpen());
        } catch (IOException e) {
            e.printStackTrace();
        }

        // @Getter generate default getter automatically
        // @Setter generate default setter automatically
        // (Both are included in @Data annotation)
        GetterAndSetterExample getterAndSetterExample = new GetterAndSetterExample();
        getterAndSetterExample.setName("Value without define a setter");
        System.out.println(getterAndSetterExample.getName());

        // @ToString (included in @Data annotation)
        // Generate an implementation of toString including configured fields
        ToStringExample toStringExample = new ToStringExample();
        toStringExample.setName("Neo");
        toStringExample.setDateOfBirth(LocalDate.of(1962, Month.MARCH, 11));
        System.out.println(toStringExample.toString());

        EqualsAndHashCodeExample objectA = new EqualsAndHashCodeExample();
        objectA.setLog("Timeout error");
        objectA.setStarted(LocalDate.now());

        // @EqualsAndHashCode (included in @Data annotation)
        // Generate the implementation of equals and hashCode methods
        // By default, it'll use all non-static, non-transient fields,
        // but could be configured to include it
        EqualsAndHashCodeExample objectB = new EqualsAndHashCodeExample();
        objectB.setLog("Timeout error");
        objectB.setStarted(LocalDate.now());
        System.out.println("Are the objects equals? " + objectA.equals(objectB));

        // @NoArgsConstructor Create a default constructor
        new ArgsConstructorExample();

        // @RequiredArgsConstructor Create a constructor with @NonNull fields
        new ArgsConstructorExample("C3PO");

        // @AllArgsConstructor Create a constructor with all fields
        new ArgsConstructorExample("", 34);

        // @Data Includes:
        //  - @ToString
        //  - @EqualsAndHashCode
        //  - @Getter on all fields
        //  - @Setter on all non-final fields
        //  - @RequiredArgsConstructor
        DataExample dataExample = new DataExample("");

        // @Value Mark all fields are made private and final by default, includes:
        //  - @ToString
        //  - @EqualsAndHashCode
        //  - @AllArgsConstructor
        //  - @FieldDefaults(makeFinal = true, level = AccessLevel.PRIVATE)
        //  - @Getter
        // @NonFinal can be used to avoid mark as final some fields
        ValueExample valueExample = new ValueExample("Sun", 4_603_000_000_000L);

        // @Builder
        // Implement the builder pattern
        BuilderExample builderExample = BuilderExample.builder()
                .name("Someone")
                .address("Somewhere")
                .dayOfBirth(LocalDate.now())
                .build();
        System.out.println(builderExample.toString());

        // @SneakyThrows
        // wrap exceptions into, add throws to signature is not needed:
        //  - Lombok.sneakyThrow(e)
        //  - Lombok.sneakyThrow(t)
        new SneakyThrowsExample().utf8ToString("".getBytes());

        // @With
        // Create immutable setters and
        // Create with methods to crete clones with new values
        WithExample withExample = new WithExample("Moon");
        withExample.withName("Earth");
        System.out.println(withExample);
        // Clone with new value
        System.out.println(withExample.withName("Earth"));

        // @Getter(lazy = true)
        // Implement a cache in getter methods
        GetterlazyExample getterlazyExample = new GetterlazyExample();

        Instant startTest1 = Instant.now();
        getterlazyExample.getCached();
        Instant endTest1 = Instant.now();
        System.out.println("Elapsed Time in test 1: "+ Duration.between(startTest1, endTest1).toString());

        Instant startTest2 = Instant.now();
        getterlazyExample.getCached();
        Instant endTest2 = Instant.now();
        System.out.println("Elapsed Time in test 2: "+ Duration.between(startTest2, endTest2).toString());

        // @Log
        // Implement static final log field for:
        //  - @CommonsLog (logging by Apache)
        //  - @Flogger (logging by Google)
        //  - @JBossLog (logging by JBoss)
        //  - @Log (logging by Java)
        //  - @Log4j (logging by Apache)
        //  - @Log4j2 (logging by Apache)
        //  - @Slf4j (logging by Slf4j)
        //  - @XSlf4j (logging by Slf4j)
        //  - @CustomLog (logging by Yourself)
        LogExample logExample = new LogExample();
        logExample.print();
    }
	
}

