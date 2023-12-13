package com.green.movieflow.media.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Data
@Schema(title = "미디어 수정 데이터")
public class PutMedia {
    private int imedia;
    private int iuser;
    private int genrepk;
    private String title;
    private String date;
    private String comment;
    private int star;
    private List<String> pics;
}
