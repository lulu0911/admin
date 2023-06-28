package com.dmc.vo;

import lombok.Data;

import java.util.List;

@Data
public class DataTable<T> {
    private Integer draw;
    private Long recordsTotal;
    private Long recordsFiltered;
    private List<T> data;
}
