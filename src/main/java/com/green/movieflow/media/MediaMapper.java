package com.green.movieflow.media;

import com.green.movieflow.media.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MediaMapper {

    int insMedia(InsMediaDto dto);

    int patchIsSaw(MediaPatIsSawDto dto);

    int updMedia(UpdMediaDto dto);

    List<MediaDaySelVo> dayMedia(MediaDaySelDto dto);
}
