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

package com.tikinou.schedulesdirect.core.domain.program;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.tikinou.schedulesdirect.core.jackson.ModuleRegistration;
import org.junit.Test;

/**
 * @author Sebastien Astie.
 */
public class ProgramSDTest {
    @Test
    public void testParsing() throws Exception {
        ObjectMapper mapper = ModuleRegistration.getInstance().getConfiguredObjectMapper();
        ProgramSD program = mapper.readValue(ProgramSDTest.class.getResourceAsStream("/v20131021/program/SH013762600000.json"), ProgramSD.class);
        assert program != null;
        program = mapper.readValue(ProgramSDTest.class.getResourceAsStream("/v20131021/program/MV003954050000.json"), ProgramSD.class);
        assert program != null;
        program = mapper.readValue(ProgramSDTest.class.getResourceAsStream("/v20131021/program/EP017398160007.json"), ProgramSD.class);
        assert program != null;
    }
}
