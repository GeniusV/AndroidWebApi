package com.geniusver.utils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Copyright (c) 2018 GeniusV
 * All rights reserved.
 * Created by GeniusV on 3/3/18.
 */
public class FullArrangement {
    public static List<List<Map<String, String>>> run(Map<String, String>[] original) {

        int nCnt = original.length;

        int nBit = (0xFFFFFFFF >>> (32 - nCnt));

        ArrayList<List<Map<String, String>>> result = new ArrayList<>();
        for (int i = 1; i <= nBit; i++) {
            ArrayList<Map<String, String>> line = new ArrayList<>();
            for (int j = 0; j < nCnt; j++) {
                if ((i << (31 - j)) >> 31 == -1) {
                    line.add(original[j]);
                }
            }
            result.add(line);
        }
        return result;
    }
}
