package com.green.movieflow.media;

import com.green.movieflow.common.ResVo;
import com.green.movieflow.media.model.*;
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

    public ResVo postMedia(InsMediaDto dto){
        mapper.insMedia(dto);
        return new ResVo(dto.getImedia());
    }

    public ResVo putMedia(UpdMediaDto dto){
        int result = mapper.updMedia(dto);
        return new ResVo(result);
    }

    public List<MediaDaySelVo> dayMedia(MediaDaySelDto dto){
        return mapper.dayMedia(dto);
    }

    public ResVo patchIsSaw(int isSaw){
        return new ResVo(mapper.patchIsSaw(isSaw));
    }
}
