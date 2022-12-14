package com.lab3.journal2.services;

import com.lab3.journal2.entities.Mark;

import java.util.List;


public interface MarkService {
    List<Mark> getAllMarks();
    List<Mark> getMarksByStudentId(int id);
    List<Mark> getMarksByTeacherId(int id);
    List<Mark> getMarksBySubjectId(int id);
    List<Mark> getMarksByDate(String date);
    Mark getMarkById(int id);
    void updateMark(Mark mark);
    void createMark(Mark mark);
    void deleteMark(int id);
}
