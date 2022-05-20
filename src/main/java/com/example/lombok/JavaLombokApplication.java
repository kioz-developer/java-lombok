package com.example.lombok;

import com.example.lombok.features.CleanupExample;
import com.example.lombok.features.ValExample;
import com.example.lombok.features.VarExample;
import lombok.val;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.nio.channels.Selector;
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


    }
	
}

