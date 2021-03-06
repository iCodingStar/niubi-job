/*
 * Copyright 2002-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */


package com.zuoxiaolong.niubi.job.api;

import com.zuoxiaolong.niubi.job.api.data.MasterSlaveJobData;

import java.util.List;

/**
 * 主从模式下Job节点操作API
 *
 * @author Xiaolong Zuo
 * @since 0.9.3
 */
public interface MasterSlaveJobApi {

    List<MasterSlaveJobData> getAllJobs();

    void saveJob(String group, String name, MasterSlaveJobData.Data data);

    void updateJob(String group, String name, MasterSlaveJobData.Data data);

    MasterSlaveJobData getJob(String group, String name);

    MasterSlaveJobData getJob(String path);

}
