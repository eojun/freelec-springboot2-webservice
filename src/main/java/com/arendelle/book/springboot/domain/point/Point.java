package com.arendelle.book.springboot.domain.point;

import com.arendelle.book.springboot.domain.posts.BaseTimeEntity;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class Point extends BaseTimeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 500, nullable = false)
    private Long amount;

    @Column(columnDefinition = "TEXT", nullable = false)
    private String user;

    @Builder
    public Point(Long amount, String user){
        this.amount = amount;
        this.user = user;
    }

    public void update(Long amount, String user){
        this.amount = amount;
        this.user = user;
    }
}
