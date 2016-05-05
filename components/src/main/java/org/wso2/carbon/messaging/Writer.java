/*
 * Copyright (c) 2015, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.wso2.carbon.messaging;

import java.nio.ByteBuffer;

/**
 * An interface which represents Write byte content directly
 */
public interface Writer {
    /**
     * A method which is used to write content to underlying IO channel directly
     * @param byteBuffer
     */
    public void write(ByteBuffer byteBuffer);

    /**
     * A method which is used to write Last content and flush  to underlying IO channel directly
     * @param carbonMessage
     */
    public void writeLastContent(CarbonMessage carbonMessage);
}
