package com.globallogic.basecamp.comparator;

import com.globallogic.basecamp.model.Student;

import java.util.Comparator;
import java.util.function.Function;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/**
 * Custom comparator for the {@link com.globallogic.basecamp.model.Student Student} class
 */
public class StudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return 1;
    }

    @Override
    public Comparator<Student> reversed() {
        return Comparator.super.reversed();
    }

    @Override
    public Comparator<Student> thenComparing(Comparator<? super Student> other) {
        return Comparator.super.thenComparing(other);
    }

    @Override
    public <U> Comparator<Student> thenComparing(Function<? super Student, ? extends U> keyExtractor, Comparator<? super U> keyComparator) {
        return Comparator.super.thenComparing(keyExtractor, keyComparator);
    }

    @Override
    public <U extends Comparable<? super U>> Comparator<Student> thenComparing(Function<? super Student, ? extends U> keyExtractor) {
        return Comparator.super.thenComparing(keyExtractor);
    }

    @Override
    public Comparator<Student> thenComparingInt(ToIntFunction<? super Student> keyExtractor) {
        return Comparator.super.thenComparingInt(keyExtractor);
    }

    @Override
    public Comparator<Student> thenComparingLong(ToLongFunction<? super Student> keyExtractor) {
        return Comparator.super.thenComparingLong(keyExtractor);
    }

    @Override
    public Comparator<Student> thenComparingDouble(ToDoubleFunction<? super Student> keyExtractor) {
        return Comparator.super.thenComparingDouble(keyExtractor);
    }

    /**
     * TODO: implement `compare` method of the Comparator interface
     * Compare students in natural order by the last name. If last names are the same,
     * compare in natural order by the first name
     */



}
