package com.example.mentorship.catalin.facts.weekOne;

import org.openjdk.jol.info.ClassLayout;

import java.util.List;
import java.util.stream.IntStream;

public class WeekOneFacts {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Started app");
        Thread.sleep(10000);

        printMemoryLayout("Boolean Object", Boolean.TRUE);
        printMemoryLayout("Boolean primitive", true);
        printMemoryLayout("Array of primitives", new long[]{1L, 5L, 10_000L});
        printMemoryLayout("Array of objects", new Long[]{1L, 5L, 10_000L});
        printMemoryLayout("Empty object", new MemoryEmptyTestClass());
        printMemoryLayout("Custom object", new MemoryTestClass());

        Thread.sleep(10000);
        System.out.println("Allocating MemoryEmptyTestClasses");

        List<MemoryEmptyTestClass> emptyTestClasses = IntStream.range(0, 1_000_000)
                .mapToObj(_ -> new MemoryEmptyTestClass())
                .toList();

        Thread.sleep(10000);
        System.out.println("Invoking Garbage Collector");

        System.gc();

        Thread.sleep(10000);
        System.out.println("Allocating MemoryTestClasses");

        IntStream.range(0, 1_000_000)
                .mapToObj(_ -> new MemoryTestClass())
                .toList();

        Thread.sleep(10000);
        System.out.println("Invoking Garbage Collector");

        System.gc();

        Thread.sleep(10000);
    }

    private static void printMemoryLayout(final String tag,
                                          final Object objectToPrint) {
        System.out.println(tag);
        System.out.println(ClassLayout.parseInstance(objectToPrint).toPrintable());
    }

    private static class MemoryEmptyTestClass {
    }

    private static class MemoryTestClass {

        private boolean booleanPrimitive;

        private Boolean booleanObject;

        private short shortPrimitive;

        private Short shortObject;

        private char charPrimitive;

        private Character charObject;

        private int integerPrimitive;

        private Integer integerObject;

        private long longPrimitive;

        private Long longObject;

        private float floatPrimitive;

        private Float floatObject;

        private double doublePrimitive;

        private Double doubleObject;

        private int[] primitiveArray;

        private Integer[] objectArray;

        private List<Integer> list;
    }
}
