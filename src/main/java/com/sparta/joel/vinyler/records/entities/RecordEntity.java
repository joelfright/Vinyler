package com.sparta.joel.vinyler.records.entities;

import javax.persistence.*;
import java.sql.Date;
import java.util.Objects;

@Entity
@Table(name = "records", schema = "vinyler")
public class RecordEntity {

    private int recordId;
    private String recordName;
    private String artistName;
    private String genre;
    private int numOfPlays;
    private Date lastPlayed;

    @Id
    @Column(name = "record_id")
    public int getRecordId() {
        return recordId;
    }

    public void setRecordId(int recordId) {
        this.recordId = recordId;
    }

    @Basic
    @Column(name = "record_name")
    public String getRecordName() {
        return recordName;
    }

    public void setRecordName(String recordName) {
        this.recordName = recordName;
    }

    @Basic
    @Column(name = "artist_name")
    public String getArtistName() {
        return artistName;
    }

    public void setArtistName(String artistName) {
        this.artistName = artistName;
    }

    @Basic
    @Column(name = "genre")
    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    @Basic
    @Column(name = "num_of_plays")
    public int getNumOfPlays() {
        return numOfPlays;
    }

    public void setNumOfPlays(int numOfPlays) {
        this.numOfPlays = numOfPlays;
    }

    @Basic
    @Column(name = "last_played")
    public Date getLastPlayed() {
        return lastPlayed;
    }

    public void setLastPlayed(Date lastPlayed) {
        this.lastPlayed = lastPlayed;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RecordEntity that = (RecordEntity) o;
        return recordId == that.recordId && numOfPlays == that.numOfPlays && Objects.equals(recordName, that.recordName) && Objects.equals(artistName, that.artistName) && Objects.equals(genre, that.genre) && Objects.equals(lastPlayed, that.lastPlayed);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordId, recordName, artistName, genre, numOfPlays, lastPlayed);
    }
}
