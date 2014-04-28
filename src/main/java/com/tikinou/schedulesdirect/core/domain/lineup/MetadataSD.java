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

package com.tikinou.schedulesdirect.core.domain.lineup;

import com.fasterxml.jackson.annotation.JsonInclude;
import org.joda.time.DateTime;

/**
 * @author Sebastien Astie.
 */
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class MetadataSD {
    private String lineup;
    private DateTime modified;
    private String transport;

    public String getLineup() {
        return lineup;
    }

    public void setLineup(String lineup) {
        this.lineup = lineup;
    }

    public DateTime getModified() {
        return modified;
    }

    public void setModified(DateTime modified) {
        this.modified = modified;
    }

    public String getTransport() {
        return transport;
    }

    public void setTransport(String transport) {
        this.transport = transport;
    }

    @Override
    public String toString() {
        return "Metadata{" +
                "lineup='" + lineup + '\'' +
                ", modified=" + modified +
                ", transport='" + transport + '\'' +
                '}';
    }
}
