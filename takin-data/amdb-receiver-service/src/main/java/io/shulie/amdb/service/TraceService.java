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

package io.shulie.amdb.service;

import com.pamirs.pradar.log.parser.trace.RpcBased;
import io.shulie.amdb.common.Response;
import io.shulie.amdb.common.request.trace.EntryTraceQueryParam;
import io.shulie.amdb.common.trace.EntryTraceInfoDTO;

import java.util.List;
import java.util.Map;

public interface TraceService {

    Response<List<EntryTraceInfoDTO>> getEntryTraceInfo(EntryTraceQueryParam param);

    List<RpcBased> getTraceDetail(String traceId);

    Response<Map<String,List<RpcBased>>> getTraceInfo(EntryTraceQueryParam param);

}
