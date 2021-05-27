/*
 * Copyright 2021 Shulie Technology, Co.Ltd
 * Email: shulie@shulie.io
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.shulie.tro.web.data.param.whitelist;

import java.util.Date;

import lombok.Data;

/**
* @Package io.shulie.tro.web.app.request.whitelist
* @author 无涯
* @description:
* @date 2021/4/12 5:58 下午
*/
@Data
public class WhitelistUpdatePartAppNameParam {

    private Long id;

    private String interfaceName;

    private String type;

    private String effectiveAppName;

    private Date gmtModified;

    private Date gmtCreate;

    /**
     * 租户id
     */
    private Long customerId;

    /**
     * 用户id
     */
    private Long userId;

    private Long wlistId;


    public WhitelistUpdatePartAppNameParam() {
        this.gmtModified = new Date();
        this.gmtCreate = new Date();
    }
}