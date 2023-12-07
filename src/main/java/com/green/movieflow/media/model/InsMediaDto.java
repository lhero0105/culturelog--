package com.green.movieflow.media.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.List;

@Data
public class InsMediaDto {
    @JsonIgnore
    private int imedia;
    private int iuser;
    private String title;
    private int genre;
    private String date;
    private int star;
    private String comment;
    private List<String> pics;
    private int isSaw;
}
