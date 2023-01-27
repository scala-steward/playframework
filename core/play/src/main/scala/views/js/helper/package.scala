/*
 * Copyright (C) from 2022 The Play Framework Contributors <https://github.com/playframework>, 2011-2021 Lightbend Inc. <https://www.lightbend.com>
 */

package views.js

import play.api.libs.json.Json
import play.api.libs.json.Writes
import play.twirl.api.JavaScript

/**
 * Contains helpers intended to be used in JavaScript templates
 */
package object helper {

  /**
   * Generates a JavaScript value from a Scala value.
   *
   * {{{
   *   @(username: String)
   *   alert(@helper.json(username));
   * }}}
   *
   * @param a The value to convert to JavaScript
   * @return A JavaScript value
   */
  def json[A: Writes](a: A): JavaScript = JavaScript(Json.stringify(Json.toJson(a)))
}
