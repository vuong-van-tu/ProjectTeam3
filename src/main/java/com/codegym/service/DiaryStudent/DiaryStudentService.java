package com.codegym.service.DiaryStudent;

import com.codegym.model.DiaryStudent;
import com.codegym.repository.IDiaryStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class DiaryStudentService implements IDiaryStudentService{
    @Autowired
    private IDiaryStudentRepository iDiaryStudentRepository;
    @Override
    public Iterable<DiaryStudent> findAll() {
        return iDiaryStudentRepository.findAll();
    }

    @Override
    public Optional<DiaryStudent> findById(Long id) {
        return iDiaryStudentRepository.findById(id);
    }

    @Override
    public void save(DiaryStudent diaryStudent) {
            iDiaryStudentRepository.save(diaryStudent);
    }

    @Override
    public void remove(Long id) {
        iDiaryStudentRepository.deleteById(id);
    }
}
