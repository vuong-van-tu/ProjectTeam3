package com.codegym.service.Mark;

import com.codegym.model.Mark;
import com.codegym.repository.IMarkRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
@Service
public class MarkService implements IMarkService{
    @Autowired
    private IMarkRepository iMarkRepository;
    @Override
    public Iterable<Mark> findAll() {
        return iMarkRepository.findAll();
    }

    @Override
    public Optional<Mark> findById(Long id) {
        return iMarkRepository.findById(id);
    }

    @Override
    public void save(Mark mark) {
        iMarkRepository.save(mark);
    }

    @Override
    public void remove(Long id) {
        iMarkRepository.deleteById(id);
    }
}
