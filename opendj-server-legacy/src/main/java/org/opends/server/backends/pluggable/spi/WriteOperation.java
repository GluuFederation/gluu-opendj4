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
 * information: "Portions Copyright [year] [name of copyright owner]".
 *
 * Copyright 2014-2015 ForgeRock AS.
 */
package org.opends.server.backends.pluggable.spi;

/**
 * Function performing a write operation.
 */
// @FunctionalInterface
public interface WriteOperation
{
  /**
   * Executes a write operation. Implementation must be idempotent since
   * operation might be retried (for example in case of optimistic locking failure).
   *
   * @param txn
   *          the write transaction where to execute the write operation
   * @throws Exception
   *           if a problem occurs with the underlying storage engine
   */
  void run(WriteableTransaction txn) throws Exception;
}
