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
    public ResVo putMedia(@RequestBody PutMedia dto){
        return service.putMedia(dto);
    }

    // 날짜별 media 리스트 (보류사유 - dto 받을 값 추가해야 한다고 생각)
    // iuser, date
    @GetMapping("day")
    public List<MediaDaySelVo> getDayMedia(int iuser, String date){
        return service.getDayMedia(MediaDaySelDto.builder()
                        .iuser(iuser)
                        .date(date)
                        .build());
    }

    // issaw(볼것, 본것) (보류사유 - dto 받을 값 추가해야 한다고 생각)
    // issaw, imedia, iuser
    @PatchMapping
    public ResVo patchIsSaw(MediaPatIsSawDto dto){
        return service.patchIsSaw(dto);
    }

    //----------------------------------------------------------

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
    public ResVo delMedia(DelMediaDto dto){
        return service.delMedia(dto);
    }
}
