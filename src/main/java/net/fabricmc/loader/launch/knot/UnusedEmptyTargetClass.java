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

package net.fabricmc.loader.launch.knot;

/** If the very first class transformed by mixin is also referenced by a mixin config then we'll crash due to an
 * "attempted duplicate class definition". To avoid this, {@link Knot} loads this class instead - since it's *very
 * unlikely* to be referenced by mixin plugin. */
final class UnusedEmptyTargetClass {

}
