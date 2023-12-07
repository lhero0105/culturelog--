package com.green.movieflow.media;

import com.green.movieflow.common.ResVo;
import com.green.movieflow.media.model.DelMediaDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class MediaService2 {
    private final MediaMapper mapper;
/*    public ResVo delMedia(DelMediaDto dto){
        // 셀렉트로 있는지 확인 먼저
        Integer imedia = mapper.selMedia(dto);
        if(imedia == null){
            return new ResVo(0);
        }
        mapper.delMediaPics(dto);
        mapper.delMedia(dto);
        return new ResVo(1);
        // 없으면 리턴
        // 있으면 사진 삭제 후 미디어 삭제
    }*/

}
