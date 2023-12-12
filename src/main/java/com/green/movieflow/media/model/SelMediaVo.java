package com.green.movieflow.media.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class SelMediaVo {
    private int imedia;
    private int day;
    @JsonIgnore
    private List<String> pics = new ArrayList<>();
    private String pic;
}
