package com.sparta.joel.vinyler.records.services;

import com.sparta.joel.vinyler.records.entities.RecordEntity;
import com.sparta.joel.vinyler.records.repositories.RecordRepository;
import org.springframework.stereotype.Service;

@Service
public class RecordService {

    private final RecordRepository recordRepository;

    public RecordService(RecordRepository recordRepository) {
        this.recordRepository = recordRepository;
    }

    public Iterable<RecordEntity> getAllRecords(){
        return recordRepository.findAll();
    }

    public RecordEntity addNewRecord(RecordEntity recordEntity){
        recordRepository.save(recordEntity);
        return recordEntity;
    }
}
