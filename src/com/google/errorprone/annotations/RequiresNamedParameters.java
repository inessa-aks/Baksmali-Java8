/*
 * Copyright 2017 Google Inc. All Rights Reserved.
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

package com.google.errorprone.annotations;

import static java.lang.annotation.ElementType.METHOD;
import static java.lang.annotation.RetentionPolicy.CLASS;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

/**
 * Requires invocations of the method to record the corresponding formal parameter name for each
 * argument in a comment, e.g. {@code foo(/*x=*&#47; 1, /*y=&#47; 2)}.
 *
 * <p>Labelling comments must be before the argument and must contain the parameter name followed by
 * an equals character. All arguments must be labelled.
 *
 * @author andrewrice@google.com (Andrew Rice)
 */
@Documented
@Retention(CLASS)
@Target(METHOD)
public @interface RequiresNamedParameters {}
