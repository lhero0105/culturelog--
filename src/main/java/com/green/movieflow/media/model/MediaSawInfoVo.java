package com.green.movieflow.media.model;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class MediaSawInfoVo {
    private int star; // 본 것
    private String comment; // 본 것
}
