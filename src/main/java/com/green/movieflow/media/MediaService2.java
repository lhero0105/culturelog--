package com.green.movieflow.media;

import com.green.movieflow.common2.Const2;
import com.green.movieflow.common2.ResVo2;
import com.green.movieflow.media.model2.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
@Slf4j
@RequiredArgsConstructor
public class MediaService2 {
    private final MediaMapper2 mapper;





    // 마이페이지 리스트
    public List<SelMediaAllVo> getMediaAll(SelMediaAllDto dto){
        // 쿼리문으로 첫사진만 빼오도록 하여 다 담김
        List<SelMediaAllVo> list = mapper.selMediaAll(dto);
        return list;
    }

    public SelMediaVo getMedia(SelMediaDto dto){
        SelMediaVo vo = mapper.selMedia(dto);
        List<String> pics = mapper.selMediaPics(dto);
        vo.setPics(pics);
        return vo;
    }

    // media 삭제
    public ResVo2 delMedia(DelMediaDto dto){
        // 셀렉트로 있는지 확인 먼저
        Integer imedia = mapper.selMediaByDelMedia(dto);
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
