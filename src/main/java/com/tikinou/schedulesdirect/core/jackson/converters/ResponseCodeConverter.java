/*
 * Copyright (c) 2013 TIKINOU LLC
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

package com.tikinou.schedulesdirect.core.jackson.converters;

import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.type.TypeFactory;
import com.fasterxml.jackson.databind.util.Converter;
import com.tikinou.schedulesdirect.core.domain.ResponseCode;

/**
 * @author Sebastien Astie
 */
public class ResponseCodeConverter implements Converter<Integer, ResponseCode> {
    /**
     * Main conversion method.
     *
     * @param value
     */
    @Override
    public ResponseCode convert(Integer value) {
        return ResponseCode.fromCode(value);
    }

    /**
     * Method that can be used to find out actual input (source) type; this
     * usually can be determined from type parameters, but may need
     * to be implemented differently from programmatically defined
     * converters (which can not change static type parameter bindings).
     *
     * @param typeFactory
     * @since 2.2
     */
    @Override
    public JavaType getInputType(TypeFactory typeFactory) {
        return typeFactory.constructType(Integer.class);
    }

    /**
     * Method that can be used to find out actual output (target) type; this
     * usually can be determined from type parameters, but may need
     * to be implemented differently from programmatically defined
     * converters (which can not change static type parameter bindings).
     *
     * @param typeFactory
     * @since 2.2
     */
    @Override
    public JavaType getOutputType(TypeFactory typeFactory) {
        return typeFactory.constructType(ResponseCode.class);
    }
}
