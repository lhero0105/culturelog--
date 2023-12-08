package com.green.movieflow.media;

import com.green.movieflow.common2.ResVo2;
import com.green.movieflow.media.model2.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/media")
public class MediaContoller2 {
    private final MediaService2 service;

    // 메인페이지
    @GetMapping("/ym")
    public List<SelMediaVo> getMediaAll(MidiaAllSelDto dto){
        return service.getMediaAll(dto);
    }

    // 마이페이지
    @GetMapping
    public List<SelMediaAllVo> getMedia(SelMediaAllDto dto){
        return service.getMedia(dto);
    }

    // 상세페이지
    @GetMapping("/{imedia}")
    public SelMediaDetailVo getDetailMedia(@PathVariable int imedia, int iuser){
        return service.getDetailMedia(SelMediaDto.builder()
                .imedia(imedia)
                .iuser(iuser)
                .build());
    }

    // 미디어삭제
    @DeleteMapping
    public ResVo2 delMedia(DelMediaDto dto){
        return service.delMedia(dto);
    }
}
