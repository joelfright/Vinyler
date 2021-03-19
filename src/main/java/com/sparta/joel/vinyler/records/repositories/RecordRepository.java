package com.sparta.joel.vinyler.records.repositories;

import com.sparta.joel.vinyler.records.entities.RecordEntity;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RecordRepository extends CrudRepository<RecordEntity, Integer> {

    @Query(value = "SELECT DISTINCT * FROM records WHERE num_of_plays = ?1 AND last_played <= DATE_ADD(NOW(), INTERVAL -2 MONTH) LIMIT 1", nativeQuery = true)
    RecordEntity findRecommendation(int numOfPlays);

    @Query(value = "SELECT DISTINCT * FROM records WHERE num_of_plays = ?1 AND last_played  <= DATE_ADD(NOW(), INTERVAL -2 MONTH) AND genre = ?2 LIMIT 1", nativeQuery = true)
    RecordEntity findRecommendation(int numOfPlays, String genre);

    @Query(value = "SELECT DISTINCT * FROM records WHERE genre = ?1", nativeQuery = true)
    Iterable<RecordEntity> findByGenre(String genre);

}
