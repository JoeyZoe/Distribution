package typings.prosemirrorMenu.mod

import typings.prosemirrorMenu.AnonDomUpdate
import typings.prosemirrorModel.mod.Schema
import typings.prosemirrorView.mod.EditorView
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("prosemirror-menu", "renderGrouped")
@js.native
object renderGrouped extends js.Object {
  def apply[S /* <: Schema[_, _] */](view: EditorView[S], content: js.Array[MenuElement[S] | js.Array[MenuElement[S]]]): AnonDomUpdate[S] = js.native
}

