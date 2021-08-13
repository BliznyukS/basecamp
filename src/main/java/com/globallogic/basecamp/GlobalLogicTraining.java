package com.globallogic.basecamp;

import com.globallogic.basecamp.model.Grade;
import com.globallogic.basecamp.model.Student;

import java.util.*;

/**
 * GlobalLogicTraining is an implementation of the {@link com.globallogic.basecamp.Training Training} interface.
 * Contains the training name and student grades.
 */
public class GlobalLogicTraining implements Training {

    /**
     * TODO: implement methods of the Training interface and add the necessary functionality
     */

    private final String name;

    private final HashMap<Student, Grade> grades = new HashMap<>();

    public GlobalLogicTraining(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<Student> getStudents() {
        return new ArrayList<>(grades.keySet());
    }

    @Override
    public boolean addStudent(Student student) {
        return false;
    }

    @Override
    public boolean removeStudent(Student student) {
        return false;
    }

    @Override
    public boolean rateFirstSemester(Student student, int mark) {
        return false;
    }

    @Override
    public boolean rateSecondSemester(Student student, int mark) {
        return false;
    }

    @Override
    public boolean isPresent(Student student) {
        return false;
    }

    @Override
    public Optional<Grade> getStudentGrade(Student student) {
        return Optional.empty();
    }
}
