package com.arendelle.book.springboot.service.point;

import com.arendelle.book.springboot.domain.point.PointRepository;
import com.arendelle.book.springboot.web.dto.*;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@RequiredArgsConstructor
@Service
public class PointService {

    private final PointRepository pointRepository;

    @Transactional
    public Long chargePoint(PointChargeDto requestDto){
        return pointRepository.save(requestDto.toEntity()).getId();
    }

}
