package com.green.movieflow.common;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Schema(title = "결과 값 출력 데이터")
public class ResVo {
    @Schema(title = "결과 값")
    private int result;
}
