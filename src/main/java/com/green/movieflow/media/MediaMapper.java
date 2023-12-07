package com.green.movieflow.media;

import com.green.movieflow.media.model.InsMediaDto;
import com.green.movieflow.media.model.MediaSelVo;
import com.green.movieflow.media.model.UpdMediaDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MediaMapper {

    int insMedia(InsMediaDto dto);

    int updMedia(UpdMediaDto dto);

    public List<MediaSelVo> dayMedia(int iuser, int imedia);
}
