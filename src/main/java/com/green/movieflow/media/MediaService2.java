package com.green.movieflow.media;

import com.green.movieflow.common2.Const2;
import com.green.movieflow.common2.ResVo2;
import com.green.movieflow.media.model2.DelMediaDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class MediaService2 {
    private final MediaMapper2 mapper;
    public ResVo2 delMedia(DelMediaDto dto){
        // 셀렉트로 있는지 확인 먼저
        Integer imedia = mapper.selMedia(dto);
        if(imedia == null){
            return new ResVo2(Const2.FAIL);
            // 없으면 리턴
        }
        // 있으면 사진 삭제 후 미디어 삭제
        mapper.delMediaPics(dto);
        mapper.delMedia(dto);
        return new ResVo2(Const2.SUCCESS);
    }
}
