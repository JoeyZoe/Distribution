package typings.typedoc.mod.TypeScript

import typings.typescript.AnonFileExists
import typings.typescript.mod.Diagnostic
import typings.typescript.mod.Push
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typedoc", "TypeScript.validateLocaleAndSetLanguage")
@js.native
object validateLocaleAndSetLanguage extends js.Object {
  /**
    * Checks to see if the locale is in the appropriate format,
    * and if it is, attempts to set the appropriate language.
    */
  def apply(locale: String, sys: AnonFileExists): Unit = js.native
  def apply(locale: String, sys: AnonFileExists, errors: Push[Diagnostic]): Unit = js.native
}

