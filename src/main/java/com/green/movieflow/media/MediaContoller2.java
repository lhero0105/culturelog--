package com.green.movieflow.media;

import com.green.movieflow.common2.ResVo2;
import com.green.movieflow.media.model2.DelMediaDto;
import com.green.movieflow.media.model2.SelMediaDto;
import com.green.movieflow.media.model2.SelMediaVo;
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
    // 메인페이지 - 년월 데이터값 타입을 맞추어야 해서 나중에 작성..

/*    @GetMapping("/ym")
    public ?? getAllMedia(MidiaAllSelDto dto){

    }*/




    // 마이페이지 리스트 셀렉트
    @GetMapping
    public List<SelMediaVo> getMedia(SelMediaDto dto){
        return service.getMedia(dto);
    }
    // 미디어 삭제
    @DeleteMapping
    public ResVo2 delMedia(DelMediaDto dto){
        return service.delMedia(dto);
    }

}
