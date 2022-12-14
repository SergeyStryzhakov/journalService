package com.lab3.journal2.services;

import com.lab3.journal2.entities.Teacher;
import com.lab3.journal2.repositories.TeacherRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TeacherServiceImp implements TeacherService {
    TeacherRepository teacherRepository;

    public TeacherServiceImp(TeacherRepository teacherRepository) {
        super();
        this.teacherRepository = teacherRepository;
    }

    @Override
    public List<Teacher> getAllTeachers() {
        return teacherRepository.findAll();
    }

    @Override
    public List<Teacher> getAllTeachersBySubject(int id) {
        return teacherRepository.getBySubjectId(id);
    }

    @Override
    public Teacher getTeacherById(int id) {
        return teacherRepository.getById(id);
    }

    @Override
    public void createTeacher(Teacher teacher) {
        teacherRepository.create(teacher);
    }

    @Override
    public int updateTeacher(Teacher teacher) {
        return teacherRepository.update(teacher);
    }

    @Override
    public void removeTeacher(int id) {
        teacherRepository.deleteById(id);
    }

}
