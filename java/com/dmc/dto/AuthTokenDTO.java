/*
 * Copyright (c) 2016 xiaomaihd and/or its affiliates.All Rights Reserved.
 *            http://www.xiaomaihd.com
 */
package com.dmc.dto;

import lombok.Data;

import java.util.List;

@Data
public class AuthTokenDTO {
    private String token;
    private Long userId;
    private List<String> resourceList;
    private String name;

}
