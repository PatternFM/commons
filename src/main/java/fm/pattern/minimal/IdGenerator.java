/*
 * Copyright 2012-2017 the original author or authors.
 *
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
 */

package fm.pattern.minimal;

import static org.apache.commons.lang3.StringUtils.isBlank;

import java.security.SecureRandom;

import org.apache.commons.lang3.RandomStringUtils;

public final class IdGenerator {

	private static Integer DEFAULT_LENGTH = 25;
	private static SecureRandom RANDOM_SOURCE = new SecureRandom();

	private IdGenerator() {

	}

	public static String generateId(String prefix) {
		return isBlank(prefix) ? generateId() : prefix + "_" + generateId();
	}

	public static String generateId(Integer length) {
		return RandomStringUtils.random(length, 0, 0, true, true, null, RANDOM_SOURCE);
	}

	public static String generateId(String prefix, Integer length) {
		return isBlank(prefix) ? generateId(length) : prefix + "_" + generateId(length);
	}

	public static String generateId() {
		return generateId(DEFAULT_LENGTH);
	}

}
