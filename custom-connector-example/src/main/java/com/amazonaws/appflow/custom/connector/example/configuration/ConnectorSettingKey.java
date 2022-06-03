/*
 * -
 *  * #%L
 * * Example Custom Connector.
 *  *
 * %%
 * Copyright (C) 2021 Amazon Web Services
 *  *
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
 *
 */

package com.amazonaws.appflow.custom.connector.example.configuration;

/**
 * This class consists constants for Salesforce Connector setting keys.
 */
public final class ConnectorSettingKey {
    private ConnectorSettingKey() {
    }

    public static final String INSTANCE_URL = "instanceUrl";
    public static final String API_VERSION = "api_version";
    public static final String IS_SANDBOX_ACCOUNT = "IsSandboxAccount";
}
