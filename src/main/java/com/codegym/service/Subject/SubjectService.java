package com.codegym.service.Subject;

import com.codegym.model.Subject;
import com.codegym.repository.ISubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class SubjectService implements ISubjectService{
    @Autowired
    private ISubjectRepository iSubjectRepository;
    @Override
    public Iterable<Subject> findAll() {
        return iSubjectRepository.findAll();
    }

    @Override
    public Optional<Subject> findById(Long id) {
        return iSubjectRepository.findById(id);
    }

    @Override
    public void save(Subject subject) {
        iSubjectRepository.save(subject);
    }

    @Override
    public void remove(Long id) {
        iSubjectRepository.deleteById(id);
    }
}
