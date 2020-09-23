/*
 * The contents of this file are subject to the terms of the Common Development and
 * Distribution License (the License). You may not use this file except in compliance with the
 * License.
 *
 * You can obtain a copy of the License at legal/CDDLv1.0.txt. See the License for the
 * specific language governing permission and limitations under the License.
 *
 * When distributing Covered Software, include this CDDL Header Notice in each file and include
 * the License file at legal/CDDLv1.0.txt. If applicable, add the following below the CDDL
 * Header, with the fields enclosed by brackets [] replaced by your own identifying
 * information: "Portions copyright [year] [name of copyright owner]".
 *
 * Copyright 2015 ForgeRock AS.
 */

package org.forgerock.selfservice.core.config;

import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.databind.annotation.JsonTypeResolver;

/**
 * Represents the configuration for a given progress stage.
 * It is recommended to implement hash code as the hash taken from the config is used to determine service uniqueness.
 *
 * @since 0.1.0
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "name")
@JsonTypeResolver(ClassNameFallbackPropertyTypeResolver.class)
public interface StageConfig {

    /**
     * Gets the name of the stage configuration.
     *
     * @return the config name
     */
    String getName();

    /**
     * Gets the class name of the consuming progress stage.
     *
     * @return the progress stage class name
     */
    String getProgressStageClassName();

}
