package com.arendelle.book.springboot.web.dto;

import com.arendelle.book.springboot.domain.point.Point;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
public class PointChargeDto {
    private Long amount;
    private String user;
    @Builder
    public PointChargeDto(Long amount, String user){
        this.amount = amount;
        this.user = user;
    }

    public Point toEntity(){
        return Point.builder()
                .amount(amount)
                .user(user)
                .build();
    }
}
