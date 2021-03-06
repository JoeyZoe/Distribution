package typings.dojo.dojox.drawing.tools.custom.Vector

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Permalink: http://dojotoolkit.org/api/1.9/dojox/drawing/tools/custom/Vector.setup.html
  *
  * See stencil._Base ToolsSetup
  *
  */
trait setup extends js.Object {
  /**
    *
    */
  var iconClass: String
  /**
    *
    */
  var name: String
  /**
    *
    */
  var tooltip: String
}

object setup {
  @scala.inline
  def apply(iconClass: String, name: String, tooltip: String): setup = {
    val __obj = js.Dynamic.literal(iconClass = iconClass.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[setup]
  }
}

