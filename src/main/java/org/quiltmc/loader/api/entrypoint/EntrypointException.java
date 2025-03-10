/*
 * Copyright 2016 FabricMC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.quiltmc.loader.api.entrypoint;

import org.quiltmc.loader.api.QuiltLoader;

/**
 * Represents an exception that arises when obtaining entrypoints.
 * 
 * @see QuiltLoader#getEntrypointContainers(String, Class) 
 */
@SuppressWarnings("serial")
public abstract class EntrypointException extends RuntimeException {

	public EntrypointException() {}

	public EntrypointException(String message) {
		super(message);
	}

	public EntrypointException(String message, Throwable cause) {
		super(message, cause);
	}

	public EntrypointException(Throwable cause) {
		super(cause);
	}

	/**
	 * Returns the key of entrypoint in which the exception arose.
	 *
	 * @return the key
	 */
	public abstract String getKey();
}
