/*
 * Copyright 2016-2020 the original author
 *
 * @D8GER(https://github.com/caofanCPU).
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *       https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.xyz.caofancpu.excel.xml.config;

import com.xyz.caofancpu.excel.enums.ListAlign;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Excel定义
 */
@Data
public class SheetConfig {

    private String data;

    /**
     * 导出时,sheet页的名称,可以不设置
     */
    private String name;

    private ListAlign align;

    private List<IAreaConfig> areaList = new ArrayList<>();
}
