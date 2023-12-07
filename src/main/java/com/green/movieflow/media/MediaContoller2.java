package com.green.movieflow.media;

import com.green.movieflow.common.ResVo;
import com.green.movieflow.media.model.DelMediaDto;
import com.green.movieflow.media.model.InsMediaDto;
import com.green.movieflow.media.model2.MidiaAllSelDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/media")
public class MediaContoller2 {
    private final MediaService service;
    // 메인페이지 - 년월 데이터값 타입을 맞추어야 해서 나중에 작성..

/*    @GetMapping("/ym")
    public ?? getAllMedia(MidiaAllSelDto dto){

    }*/

/*    @DeleteMapping
    public ResVo delMedia(DelMediaDto dto){
        return service.delMedia(dto);
    }*/


}
