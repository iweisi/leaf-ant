/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at http://www.apache.org/licenses/LICENSE-2.0
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package com.kaishustory.message.common.model;

import lombok.Data;

import java.util.UUID;

/**
 * 请求参数
 *
 * @author liguoyang
 * @create 2019-07-29 11:20
 **/
@Data
public class RpcRequest {

    public RpcRequest() {
    }

    public RpcRequest(String action, String data) {
        this.msgId = UUID.randomUUID().toString();
        this.action = action;
        this.data = data;
    }

    /**
     * 消息ID
     */
    private String msgId;

    /**
     * 消息类型（动作类型）
     */
    private String action;

    /**
     * 消息内容
     */
    private String data;

}
