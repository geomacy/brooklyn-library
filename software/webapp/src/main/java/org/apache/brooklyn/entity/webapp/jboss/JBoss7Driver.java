/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package org.apache.brooklyn.entity.webapp.jboss;

import org.apache.brooklyn.entity.webapp.JavaWebAppDriver;

/**
 * @deprecated since 1.0.0; JBoss 7 is EOF
 */
@Deprecated
public interface JBoss7Driver extends JavaWebAppDriver{

    /**
     * The path to the keystore file on the AS7 server machine.
     * Result is undefined if SSL is not enabled/configured.
     */
    public String getSslKeystoreFile();
}
