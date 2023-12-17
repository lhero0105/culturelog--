package com.green.movieflow.media;

import com.green.movieflow.media.model.*;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface MediaMapper {

    // 메인페이지
    List<SelMediaVo> selMediaAll(MidiaAllSelDto dto);
    List<SelMediaPicsProcVo> selMediapic(List<Integer> imediaList);

    // 날짜별 media리스트
    int delMedia(DelMediaDto dto);

    // 마이페이지
    List<SelMediaAllProcVo> selMedia(SelMediaAllDto dto);

    // 상세페이지
    SelMediaDetailVo selDetailMedia(SelMediaDto dto);
    List<String> selMediaPics(SelMediaDto dto);

    // 미디어 등록
    int insMedia(InsMediaDto dto);

    // 시청여부 수정
    int patchIsSaw(MediaPatIsSawDto dto);

    // 미디어 수정
    int putMedia(PutMedia dto);
    int delMediaPics(DelMediaDto dto);
    int insMediaPics(InsMediaDto dto);

    // media 삭제
    Integer selMediaByDelMedia(DelMediaDto dto);
    List<MediaDaySelVo> dayMedia(MediaDaySelDto dto);
}
