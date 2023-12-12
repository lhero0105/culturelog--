package com.green.movieflow.media.model;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class UpdMediaPicsDto {
    private List<Integer> imediaPics;
    private List<String> pics= new ArrayList<>();
}
