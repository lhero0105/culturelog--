package com.green.movieflow.media.model;

import lombok.Data;

import java.util.List;

@Data
public class updMediaDto {
    private int iuser;
    private int imedia;
    private String title;
    private int genre;
    private String date;
    private int star;
    private String comment;
    private List<String> pics;
    private int isSaw;
}
