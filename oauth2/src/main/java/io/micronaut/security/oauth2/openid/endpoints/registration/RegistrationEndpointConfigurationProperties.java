/*
 * Copyright 2017-2018 original authors
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package io.micronaut.security.oauth2.openid.endpoints.registration;

import io.micronaut.context.annotation.ConfigurationProperties;
import io.micronaut.security.oauth2.configuration.OauthConfigurationProperties;

import javax.annotation.Nullable;

/**
 * {@link ConfigurationProperties} implementation of {@link RegistrationEndpointConfiguration}.
 *
 * @since 1.0.0
 * @author Sergio del Amo
 */
@ConfigurationProperties(RegistrationEndpointConfigurationProperties.PREFIX)
public class RegistrationEndpointConfigurationProperties implements RegistrationEndpointConfiguration {

    @SuppressWarnings("WeakerAccess")
    public static final String PREFIX = OauthConfigurationProperties.PREFIX + ".registration";

    private String url;

    @Nullable
    @Override
    public String getUrl() {
        return url;
    }

    /**
     *
     * @param url registration endpoint's url
     */
    public void setUrl(@Nullable String url) {
        this.url = url;
    }
}