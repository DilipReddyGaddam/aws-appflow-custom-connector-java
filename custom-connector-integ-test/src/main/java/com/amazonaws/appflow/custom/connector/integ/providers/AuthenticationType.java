/*-
 * #%L
 * custom-connector-integ-test
 * %%
 * Copyright (C) 2021 Amazon Web Services
 * %%
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
 * #L%
 */
package com.amazonaws.appflow.custom.connector.integ.providers;

/**
 * Authentication types supported by the SDK interface.
 */
public enum AuthenticationType {
    OAUTH2("OAuth2"),
    BASIC("Basic"),
    API_KEY("ApiKey"),
    CUSTOM("Custom"),
    NO_AUTH("NoAuth");

    private final String type;

    AuthenticationType(final String type) {
        this.type = type;
    }
}