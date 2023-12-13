package com.green.movieflow.media;

import com.green.movieflow.media.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

@Mapper
public interface MediaMapper {

    int insMedia(InsMediaDto dto);
    int insMediaPics(InsMediaDto dto);

    int patchIsSaw(MediaPatIsSawDto dto);

    int putMedia(PutMedia dto);

    int DelMediaPics(DelMediaDto dto);

    List<MediaDaySelVo> dayMedia(MediaDaySelDto dto);

    //-------------------------------------------------
    List<SelMediaVo> selMediaAll(MidiaAllSelDto dto);
    List<SelMediaPicsProcVo> selMediapic(List<Integer> imediaList);
    Integer selMediaByDelMedia(DelMediaDto dto);
    int delMediaPics(DelMediaDto dto);
    int delMedia(DelMediaDto dto);
    List<SelMediaAllVo> selMedia(SelMediaAllDto dto);
    SelMediaDetailVo selDetailMedia(SelMediaDto dto);
    List<String> selMediaPics(SelMediaDto dto);
}
