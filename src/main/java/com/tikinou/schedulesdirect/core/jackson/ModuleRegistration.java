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

package com.tikinou.schedulesdirect.core.jackson;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.deser.std.StdDelegatingDeserializer;
import com.fasterxml.jackson.databind.module.SimpleModule;
import com.fasterxml.jackson.datatype.joda.JodaModule;
import com.tikinou.schedulesdirect.core.domain.ResponseCode;
import com.tikinou.schedulesdirect.core.jackson.converters.ResponseCodeConverter;

/**
 * @author Sebastien Astie
 */
public class ModuleRegistration {
    private final SimpleModule customModule;
    private ModuleRegistration(){
        StdDelegatingDeserializer<ResponseCode> delegatingDeserializer = new StdDelegatingDeserializer<>(new ResponseCodeConverter());
        customModule = new SimpleModule("com.tikinou.schedulesdirect.core.jackson.module", new Version(1, 0, 0, null, null, null)).addDeserializer(ResponseCode.class, delegatingDeserializer);
    }

    private static ModuleRegistration INSTANCE = new ModuleRegistration();

    public static ModuleRegistration getInstance(){
        return INSTANCE;
    }

    public ObjectMapper getConfiguredObjectMapper(){
        ObjectMapper objectMapper = new ObjectMapper();
        configureObjectMapper(objectMapper);
        return objectMapper;
    }

    public void configureObjectMapper(ObjectMapper objectMapper){
        objectMapper.registerModule( new JodaModule() );
        objectMapper.registerModule(customModule);
    }
}