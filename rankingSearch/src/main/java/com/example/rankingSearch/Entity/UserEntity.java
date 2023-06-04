package com.example.rankingSearch.Entity;

import jakarta.persistence.*;


@Entity
@Table(name = "userid")
public class UserEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;


    @Column(name = "user_id")
    private String user_id;


    @Column(name="ranking")
    private Long rank;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUser_id() {
        return user_id;
    }

    public void setUser_id(String user_id) {
        this.user_id = user_id;
    }


    public Long getRanking() {
        return rank;
    }

    public void setRanking(Long ranking) {
        this.rank = rank;
    }
}
