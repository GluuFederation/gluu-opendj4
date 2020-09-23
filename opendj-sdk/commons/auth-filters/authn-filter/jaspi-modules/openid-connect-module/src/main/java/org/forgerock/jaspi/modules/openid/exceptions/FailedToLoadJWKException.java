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
* Copyright 2014-2016 ForgeRock AS.
*/
package org.forgerock.jaspi.modules.openid.exceptions;

/**
 * Unable to load the JWK/x5u location points.
 */
public class FailedToLoadJWKException extends OpenIdConnectVerificationException {

    static final long serialVersionUID = 1L;

    /** Construct the exception. */
    public FailedToLoadJWKException() {
        super();
    }

    /**
     * Construct the exception with the given message.
     * @param message The message.
     */
    public FailedToLoadJWKException(final String message) {
        super(message);
    }

    /**
     * Construct the exception with the given message and cause.
     * @param message The message.
     * @param cause The cause.
     */
    public FailedToLoadJWKException(final String message, final Throwable cause) {
        super(message, cause);
    }

    /**
     * Construct the exception with the given cause.
     * @param cause The cause.
     */
    public FailedToLoadJWKException(final Throwable cause) {
        super(cause);
    }

}
