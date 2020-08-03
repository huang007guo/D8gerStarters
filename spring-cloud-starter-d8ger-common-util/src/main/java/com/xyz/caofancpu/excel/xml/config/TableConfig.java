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

import com.xyz.caofancpu.excel.xml.config.field.IFieldConfig;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * Excel定义
 */
@Data
public class TableConfig implements IAreaConfig {

    private List<DataConfig> dataList = new ArrayList<>();
    private Boolean showTitle;
    private Boolean mergeTitle;

    /**
     * 校验是否展示
     **/
    private String filter;

    /**
     * 样式
     */
    private PoiStyleConfig style;

    /**
     * 标题样式
     */
    private PoiStyleConfig titleStyle;

    private List<SetConfig> sets = new ArrayList<>();

    private TableHeadConfig tableHead;

    /**
     * Field属性的全部定义
     */
    private List<IFieldConfig> fields = new ArrayList<>();
}
