/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 * 
 *      http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ro.nextreports.server.distribution;

/**
 * User: mihai.panaitescu
 * Date: 23-Sep-2010
 * Time: 18:22:58
 */
public enum DestinationType {

    SMTP("Mail"),
    FTP("FTP"),
    SFTP("SSH"),
    Samba("Windows share"),
    WebDAV("WebDAV"),
    ALERT("Alert"),
    COPY("Copy");

    private final String name;

    private DestinationType(String name) {
        this.name = name;
    }

    public String toString() {
        return name;
    }

}
