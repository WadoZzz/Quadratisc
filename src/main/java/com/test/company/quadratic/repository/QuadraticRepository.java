package com.test.company.quadratic.repository;

import com.test.company.quadratic.domain.Quadratic;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface QuadraticRepository extends CrudRepository<Quadratic, Long> {
}
