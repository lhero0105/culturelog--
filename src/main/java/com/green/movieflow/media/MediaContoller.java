package com.green.movieflow.media;

import com.green.movieflow.common.ResVo;
import com.green.movieflow.media.model.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
@RequestMapping("/api/media")
public class MediaContoller {
    private final MediaService service;

    // 미디어 등록
    @PostMapping
    public ResVo postMedia(@RequestBody InsMediaDto dto){
        return service.postMedia(dto);
    }

    // 미디어 수정
    @PutMapping
    public ResVo putMedia(@RequestBody UpdMediaDto dto){
        return service.putMedia(dto);
    }

    // 날짜별 media 리스트 (보류사유 - dto 받을 값 추가해야 한다고 생각)
    @GetMapping("day")
    public List<MediaDaySelVo> getDayMedia(int iuser, int imedia){
        return service.dayMedia(MediaDaySelDto.builder()
                        .iuser(iuser)
                        .imedia(imedia)
                        .build());
    }

    // issaw(볼것, 본것) (보류사유 - dto 받을 값 추가해야 한다고 생각)
    @PatchMapping
    public ResVo patchIsSaw(int isSaw){
        return service.patchIsSaw(isSaw);
    }

}
