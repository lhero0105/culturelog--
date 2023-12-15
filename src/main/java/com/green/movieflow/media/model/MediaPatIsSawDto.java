package com.green.movieflow.media.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(title = "미디어 시청여부 변경 데이터")

public class MediaPatIsSawDto {
    @Schema(title = "유저번호")
    private int iuser;
    @Schema(title = "미디어번호")
    private int imedia;
    @Schema(title = "시청여부")
    private int isSaw;
}
