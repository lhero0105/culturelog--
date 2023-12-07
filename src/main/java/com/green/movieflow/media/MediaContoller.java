package com.green.movieflow.media;

import com.green.movieflow.common.ResVo;
import com.green.movieflow.media.model.InsMediaDto;
import com.green.movieflow.media.model.MediaSelVo;
import com.green.movieflow.media.model.UpdMediaDto;
import lombok.Getter;
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

    @PostMapping
    public ResVo insMedia(@RequestBody InsMediaDto dto){
        return service.insMedia(dto);
    }

    @PutMapping
    public ResVo putMedia(@RequestBody UpdMediaDto dto){
        return service.putMedia(dto);
    }

    @GetMapping("day")
    public List<MediaSelVo> getDayMedia(int iuser, int imedia){
        return service.dayMedia(iuser,imedia);
    }

}
