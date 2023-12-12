package com.green.movieflow.media;

import com.green.movieflow.common.Const;
import com.green.movieflow.common.ResVo;
import com.green.movieflow.media.model.*;
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
public class MediaService {
    private final MediaMapper mapper;

    public ResVo postMedia(InsMediaDto dto){
        mapper.insMedia(dto);
        return new ResVo(dto.getImedia());
    }

    public ResVo putMedia(UpdMediaDto dto){
        int result = mapper.updMedia(dto);

        if(dto.getImediaPics().size() == 0){
            InsMediaDto mediaDto = new InsMediaDto();
            mediaDto.setPics(dto.getPics());
            mediaDto.setImedia(dto.getImedia());
            mapper.insMediaPics(mediaDto);

        }

        if(dto.getImediaPics().size() > 0){
            UpdMediaPicsDto dto1 = new UpdMediaPicsDto();
            Map<Integer, UpdMediaPicsDto> Map = new HashMap();
            for (int i = 0; i < dto.getImediaPics().size(); i++) {
                Map.put(dto.getImediaPics().get(i), dto1);

            }
            for (int i = 0; i < dto.getImediaPics().size(); i++){

                mapper.updMediaPics(Map);
            } {

            }
            return new ResVo(Const.SUCCESS);
        }
        return new ResVo(result);
    }

    public List<MediaDaySelVo> getDayMedia(MediaDaySelDto dto){
        return mapper.dayMedia(dto);
    }

    public ResVo patchIsSaw(MediaPatIsSawDto dto){
        return new ResVo(mapper.patchIsSaw(dto));
    }
    //-----------------------------------------------------

    // 메인페이지
    public List<SelMediaVo> getMediaAll(MidiaAllSelDto dto){
        List<SelMediaVo> list = mapper.selMediaAll(dto);
        List<Integer> imediaList = new ArrayList<>();
        HashMap<Integer, SelMediaVo> mediaMap = new HashMap<>();
        for ( SelMediaVo vo : list ) {
            imediaList.add(vo.getImedia());
            mediaMap.put(vo.getImedia(), vo);
        }
        List<SelMediaPicsProcVo> pics = mapper.selMediapic(imediaList);
        for ( SelMediaPicsProcVo pic : pics ) {
            SelMediaVo vo = mediaMap.get(pic.getImedia());
            List<String> strpics = vo.getPics();
            strpics.add(pic.getPic());
        }
        for ( SelMediaVo vo : list ) {
            while (vo.getPics().size() > 1){
                vo.getPics().remove(vo.getPics().size() - 1);
            }
            vo.setPic(vo.getPics().get(0));
        }
        return list;
    }

    // 마이페이지
    public List<SelMediaAllVo> getMedia(SelMediaAllDto dto){
        // 쿼리문으로 첫사진만 빼오도록 하여 다 담김
        List<SelMediaAllVo> list = mapper.selMedia(dto);
        return list;
    }

    // 상세페이지
    public SelMediaDetailVo getDetailMedia(SelMediaDto dto){
        SelMediaDetailVo vo = mapper.selDetailMedia(dto);
        List<String> pics = mapper.selMediaPics(dto);
        vo.setPics(pics);
        return vo;
    }

    // media 삭제
    public ResVo delMedia(DelMediaDto dto){
        // 셀렉트로 있는지 확인 먼저
        Integer imedia = mapper.selMediaByDelMedia(dto);
        if(imedia == null){
            return new ResVo(Const.FAIL);
            // 없으면 리턴
        }
        // 있으면 사진 삭제 후 미디어 삭제
        mapper.delMediaPics(dto);
        mapper.delMedia(dto);
        return new ResVo(Const.SUCCESS);
    }
}
