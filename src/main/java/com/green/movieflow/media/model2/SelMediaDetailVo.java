package com.green.movieflow.media.model2;

import lombok.Data;

import java.util.List;

@Data
public class SelMediaDetailVo {
    private int imedia;
    private String title;
    private String comment;
    private String date;
    private List<String> pics;
    private int issaw;
    private int star;
}
