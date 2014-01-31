/*
 * Copyright (c) 2008-2014 MongoDB, Inc.
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

package org.mongodb.connection;

/**
 * This exception is thrown when there is an exception reading a response from a Socket.
 */
public class MongoSocketReadException extends MongoSocketException {
    private static final long serialVersionUID = -1142547119966956531L;

    public MongoSocketReadException(final String message, final ServerAddress address) {
        super(message, address);
    }

    public MongoSocketReadException(final String message, final ServerAddress address, final Throwable t) {
        super(message, address, t);
    }
}