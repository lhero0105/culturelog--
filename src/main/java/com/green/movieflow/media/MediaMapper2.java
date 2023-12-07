package com.green.movieflow.media;

import com.green.movieflow.media.model2.DelMediaDto;
import com.green.movieflow.media.model2.SelMediaDto;
import com.green.movieflow.media.model2.SelMediaVo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MediaMapper2 {
    Integer selMedia(DelMediaDto dto);
    int delMediaPics(DelMediaDto dto);
    int delMedia(DelMediaDto dto);
    List<SelMediaVo> selMediaAll(SelMediaDto dto);
}
