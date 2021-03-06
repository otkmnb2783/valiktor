/*
 * Copyright 2018-2019 https://www.valiktor.org
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

package org.valiktor.springframework.boot.autoconfigure

import org.springframework.boot.context.properties.ConfigurationProperties
import org.valiktor.springframework.config.ValiktorConfiguration

/**
 * Represents the SpringBoot Configuration Properties for [ValiktorConfiguration]
 *
 * @property baseBundleName specifies the base name of the message properties
 *
 * @author Rodolpho S. Couto
 * @see ValiktorConfiguration
 * @see ValiktorAutoConfiguration
 * @since 0.1.0
 */
@ConfigurationProperties(prefix = "valiktor", ignoreUnknownFields = true)
class ValiktorProperties {

    var baseBundleName: String? = null
}
