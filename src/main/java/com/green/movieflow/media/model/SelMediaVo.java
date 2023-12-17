package com.green.movieflow.media.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class SelMediaVo {
    @Schema(title = "미디어 번호")
    private int imedia;
    @Schema(title = "날짜")
    private String date;
    @JsonIgnore
    private List<String> pics = new ArrayList<>();
    @Schema(title = "미디어 사진")
    private String pic;
}
