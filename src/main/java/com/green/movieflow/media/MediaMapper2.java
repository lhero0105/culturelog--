package com.green.movieflow.media;

import com.green.movieflow.media.model2.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MediaMapper2 {
    Integer selMediaByDelMedia(DelMediaDto dto);
    int delMediaPics(DelMediaDto dto);
    int delMedia(DelMediaDto dto);
    List<SelMediaAllVo> selMediaAll(SelMediaAllDto dto);
    SelMediaVo selMedia(SelMediaDto dto);
    List<SelMediaPicsProcVo> selMediaPics(SelMediaDto dto);
}
