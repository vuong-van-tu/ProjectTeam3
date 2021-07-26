package com.codegym.service.DiaryClass;

import com.codegym.model.DiaryClass;
import com.codegym.repository.IDiaryClassRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DiaryClassService implements IDiaryClassService {
    @Autowired
    private IDiaryClassRepository iDiaryClassRepository;

    @Override
    public Iterable<DiaryClass> findAll() {
        return iDiaryClassRepository.findAll();
    }

    @Override
    public Optional<DiaryClass> findById(Long id) {
        return iDiaryClassRepository.findById(id);
    }

    @Override
    public void save(DiaryClass diaryClass) {
        iDiaryClassRepository.save(diaryClass);
    }

    @Override
    public void remove(Long id) {
    iDiaryClassRepository.deleteById(id);
    }
}
