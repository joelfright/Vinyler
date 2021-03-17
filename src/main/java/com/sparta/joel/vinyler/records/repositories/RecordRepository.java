package com.sparta.joel.vinyler.records.repositories;

import com.sparta.joel.vinyler.records.entities.RecordEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordRepository extends CrudRepository<RecordEntity, Integer> {
}
