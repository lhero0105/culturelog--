package com.green.movieflow.media;

import com.green.movieflow.media.model2.DelMediaDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MediaMapper2 {
    Integer selMedia(DelMediaDto dto);
    int delMediaPics(DelMediaDto dto);
    int delMedia(DelMediaDto dto);
}
