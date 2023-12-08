package com.green.movieflow.media;

import com.green.movieflow.media.model2.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MediaMapper2 {
    List<SelMediaVo> selMediaAll(MidiaAllSelDto dto);
    List<SelMediaPicsProcVo> selMediapic(List<Integer> imediaList);
    Integer selMediaByDelMedia(DelMediaDto dto);
    int delMediaPics(DelMediaDto dto);
    int delMedia(DelMediaDto dto);
    List<SelMediaAllVo> selMedia(SelMediaAllDto dto);
    SelMediaDetailVo selDetailMedia(SelMediaDto dto);
    List<String> selMediaPics(SelMediaDto dto);

}
