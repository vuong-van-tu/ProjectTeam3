package com.codegym.service.DiaryClass;

import com.codegym.model.DiaryClass;
import com.codegym.repository.IDiaryClassRepository;
import com.codegym.service.IGeneralService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;


public interface IDiaryClassService extends IGeneralService<DiaryClass> {
}
