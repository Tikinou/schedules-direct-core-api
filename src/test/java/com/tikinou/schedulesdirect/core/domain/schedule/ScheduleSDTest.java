/*
 * Copyright (c) 2014 TIKINOU LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.tikinou.schedulesdirect.core.domain.schedule;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tikinou.schedulesdirect.core.jackson.ModuleRegistration;
import org.junit.Test;

/**
 * @author Sebastien Astie.
 */
public class ScheduleSDTest {

    @Test
    public void testParsing() throws Exception {
        ObjectMapper mapper = ModuleRegistration.getInstance().getConfiguredObjectMapper();
        ScheduleSD sched = mapper.readValue(ScheduleSD.class.getResourceAsStream("/v20131021/schedule/schedule.json"), ScheduleSD.class);
        assert sched != null;
    }
}
