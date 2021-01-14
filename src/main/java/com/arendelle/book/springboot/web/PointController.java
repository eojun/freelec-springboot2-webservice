package com.arendelle.book.springboot.web;

import com.arendelle.book.springboot.service.point.PointService;
import com.arendelle.book.springboot.service.posts.PostsService;
import com.arendelle.book.springboot.web.dto.PointChargeDto;
import com.arendelle.book.springboot.web.dto.PostsResponseDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@RequiredArgsConstructor
@Controller
public class PointController {

    private final PointService pointService;

    @GetMapping("/user/mypage/charge/point")
    public @ResponseBody void chargePoint(Long amount){
        System.out.println(amount);
        pointService.chargePoint(new PointChargeDto(amount, "김충전"));
    }
}