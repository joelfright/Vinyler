package com.sparta.joel.vinyler.records.services;

import com.sparta.joel.vinyler.records.entities.RecordEntity;
import com.sparta.joel.vinyler.records.repositories.RecordRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Optional;

@Service
public class RecordService {

    private final RecordRepository recordRepository;

    public RecordService(RecordRepository recordRepository) {
        this.recordRepository = recordRepository;
    }

    public Iterable<RecordEntity> getAllRecords(){
        return recordRepository.findAll();
    }

    public void addNewRecord(RecordEntity recordEntity){
        recordRepository.save(recordEntity);
    }

    public void deleteRecord(Integer id){
        recordRepository.deleteById(id);
    }

    public boolean idExists(Integer id){
        Optional optional = recordRepository.findById(id);
        if(optional.isPresent()){
            return true;
        }else{
            return false;
        }
    }

    public int getMedian(){
        Iterable<RecordEntity> recordEntitiesList = recordRepository.findAll();
        ArrayList<Integer> numOfPlays = new ArrayList<>();
        recordEntitiesList.forEach(element -> numOfPlays.add(element.getNumOfPlays()));
        Collections.sort(numOfPlays);
        return numOfPlays.get(numOfPlays.size() / 2 + (numOfPlays.size() % 2));
    }

    public RecordEntity getRecommendation(){
        return recordRepository.findRecommendation(getMedian());
    }

    public RecordEntity getFilteredRecommendation(String filter){
        return recordRepository.findRecommendation(getMedian(),filter);
    }

}
