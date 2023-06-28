/*
 * Copyright (c) 2014 xiaomaihd and/or its affiliates.All Rights Reserved.
 *            http://www.xiaomaihd.com
 */
package com.dmc.util.id;

public class IdUtil {

    private static IdWorker idWorker = new IdWorker(1);

    private IdUtil() {


    }

    public static long generateId() {
        return idWorker.nextId();
    }
}