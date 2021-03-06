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

package com.tikinou.schedulesdirect.core.domain.postalcode;

import com.tikinou.schedulesdirect.core.domain.Country;
import com.tikinou.schedulesdirect.core.exceptions.ValidationException;

/**
 * @author Sebastien Astie
 */
public class DefaultPostalCodeFormatter implements PostalCodeFormatter {
    @Override
    public String format(Country country, String postalCode) throws ValidationException{
        switch (country) {
            case Canada:
                if (postalCode.length() < 4)
                    throw new ValidationException("postal code for Canada must be at least 4 characters long");
                return postalCode.substring(0,3); // grab the 4 left most
            case UnitedStates:
                if (postalCode.length() < 5)
                    throw new ValidationException("postal code for United States must be at least 5 characters long");
                return postalCode.substring(0,5);
        }
        return postalCode;
    }
}
