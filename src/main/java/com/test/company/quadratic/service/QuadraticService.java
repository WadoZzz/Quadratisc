package com.test.company.quadratic.service;

import com.test.company.quadratic.domain.Quadratic;
import com.test.company.quadratic.repository.QuadraticRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QuadraticService {

    private final QuadraticRepository quadraticRepository;

    @Autowired
    public QuadraticService(QuadraticRepository quadraticRepository) {
        this.quadraticRepository = quadraticRepository;
    }

    public Quadratic saveEquation(Quadratic quadratic) {
        return quadraticRepository.save(quadratic);
    }
}
