package com.practice.egork.lib.collections.comparators;

import com.practice.egork.lib.generated.collections.pair.IntIntPair;

import java.util.Comparator;

/**
 * @author Egor Kulikov (kulikov@devexperts.com)
 */
public class ReverseComparator<T extends Comparable<T>> implements Comparator<T> {
    public int compare(T o1, T o2) {
        return o2.compareTo(o1);
    }
}