/*
 * Copyright (c) 2013 Tikinou LLC
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

package com.tikinou.schedulesdirect.core.domain;

/**
 * @author Sebastien Astie
 */
public enum ResponseCode {
    OK(0, ""),
    INVALID_JSON(1001, "JSON decode error"),
    API_VERSION_MISSING(1002, "No API sent"),
    INVALID_API_VERSION(1003, "Wrong API"),
    HASH_MISSING(1004, "randhash wasn't sent"),
    UNSUPPORTED_COMMAND(2000, "Unsupported action"),
    REQUIRED_ACTION_MISSING(2001, "No action"),
    REQUIRED_OBJECT_MISSING(2002, "No object"),
    REQUIRED_PARAMETER_INVALID(2003, "Returned error text will contain specific information"),
    DUPLICATE_HEADEND(2100, "Adding a headend which is already in account"),
    INVALID_HEADEND(2101, "Requested a headend which isn't in the system"),
    INVALID_HEADEND_DELETE(2102, "Deleting a headend not in account"),
    SERVICE_OFFLINE(3000, "Service offline for maintenance"),
    ACCOUNT_EXPIRED(4001, "Account Expired"),
    INVALID_HASH(4002, "Wrong hash"),
    INVALID_USER(4003, "User account doesn't exist"),
    ACCOUNT_LOCKOUT(4004, "Too many failed attempts to login"),
    MAX_HEADEND_CHANGES_REACHED(4100, "Max changes for lineup"),
    MAX_HEADENDS(4101, "Max headends in account reached"),
    NO_HEADENDS(4102, "User doesn't have headends in account"),
    HCF(9999, "Unknown error");

    private final int code;
    private final String description;

    private ResponseCode(int code, String description) {
        this.code = code;
        this.description = description;
    }

    public int getCode() {
        return code;
    }

    public String getDescription() {
        return description;
    }

    public static ResponseCode fromCode(Integer code) {
        if(code == null)
            return null;
        switch (code) {
            case 0:
                return OK;
            case 1001:
                return INVALID_JSON;
            case 1002:
                return API_VERSION_MISSING;
            case 1003:
                return INVALID_API_VERSION;
            case 1004:
                return HASH_MISSING;
            case 2000:
                return UNSUPPORTED_COMMAND;
            case 2001:
                return REQUIRED_ACTION_MISSING;
            case 2002:
                return REQUIRED_OBJECT_MISSING;
            case 2003:
                return REQUIRED_PARAMETER_INVALID;
            case 2100:
                return DUPLICATE_HEADEND;
            case 2101:
                return INVALID_HEADEND;
            case 2102:
                return INVALID_HEADEND_DELETE;
            case 3000:
                return SERVICE_OFFLINE;
            case 4001:
                return ACCOUNT_EXPIRED;
            case 4002:
                return INVALID_HASH;
            case 4003:
                return INVALID_USER;
            case 4004:
                return ACCOUNT_LOCKOUT;
            case 4100:
                return MAX_HEADEND_CHANGES_REACHED;
            case 4101:
                return MAX_HEADENDS;
            case 4102:
                return NO_HEADENDS;
            default:
                return HCF;
        }
    }
}
