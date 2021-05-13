package com.example;

import java.util.List;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional(rollbackOn = Exception.class)
public class CheckService {
	@Autowired
    private CheckRepository checkRepository;

    public List<Check> findAll() {
        return checkRepository.findAll();
    }
    
    public Check save(Check result) {
        return checkRepository.save(result);
    }
    
}
