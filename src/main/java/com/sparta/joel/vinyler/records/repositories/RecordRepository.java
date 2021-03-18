package com.sparta.joel.vinyler.records.repositories;

import com.sparta.joel.vinyler.records.entities.RecordEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordRepository extends CrudRepository<RecordEntity, Integer> {

    @Query(value = "SELECT DISTINCT * FROM records WHERE num_of_plays = ?1 AND last_played <= DATE_ADD(NOW(), INTERVAL -3 MONTH)", nativeQuery = true)
    RecordEntity findRecommendation(int numOfPlays);

    @Query(value = "SELECT DISTINCT * FROM records WHERE num_of_plays = ?1 AND last_played <= DATE_ADD(NOW(), INTERVAL -3 MONTH) AND genre = ?2", nativeQuery = true)
    RecordEntity findRecommendation(int numOfPlays, String genre);

}
