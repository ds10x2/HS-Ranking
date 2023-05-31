package com.example.rankingSearch.Entity;

import jakarta.persistence.*;


@Entity
@Table(name = "ranking")
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "usernum")
    private Integer userNum;

    @Column(name = "id")
    private String id;


    @Column(name="ranking")
    private Long ranking;


    public Integer getUserNum() {
        return userNum;
    }

    public void setUserNum(Integer userNum) {
        this.userNum = userNum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Long getRanking() {
        return ranking;
    }

    public void setRanking(Long ranking) {
        this.ranking = ranking;
    }
}
