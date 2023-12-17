package com.green.movieflow.media.model;


import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class SelMediaAllVo {
    private int imedia;
    private String title;
    private String date;
    private String pic;
    private MediaSawInfoVo sawInfo;

    public void setSawInfo(MediaSawInfoVo sawInfo) {
        this.sawInfo = sawInfo;
    }
}