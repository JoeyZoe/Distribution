package typings.jupyterlabOutputarea.widgetMod

import typings.jupyterlabNbformat.mod.ExecutionCount
import typings.luminoWidgets.mod.Widget
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IOutputPrompt extends Widget {
  /**
    * The execution count for the prompt.
    */
  var executionCount: ExecutionCount = js.native
}

