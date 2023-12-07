package com.green.movieflow.media;

import com.green.movieflow.common.ResVo;
import com.green.movieflow.media.model.InsMediaDto;
import com.green.movieflow.media.model.MediaSelVo;
import com.green.movieflow.media.model.UpdMediaDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class MediaService {
    private final MediaMapper mapper;

    public ResVo insMedia(InsMediaDto dto){
        mapper.insMedia(dto);
        return new ResVo(dto.getImedia());
    }

    public ResVo putMedia(UpdMediaDto dto){
        int result = mapper.updMedia(dto);
        return new ResVo(result);
    }

    public List<MediaSelVo> dayMedia(int iuser, int imedia){
        return mapper.dayMedia(iuser, imedia);
    }
}
