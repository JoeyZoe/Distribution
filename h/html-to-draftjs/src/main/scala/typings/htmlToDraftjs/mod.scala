package typings.htmlToDraftjs

import org.scalablytyped.runtime.StringDictionary
import typings.draftJs.mod.Draft.Model.Encoding.RawDraftEntity
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("html-to-draftjs", JSImport.Namespace)
@js.native
object mod extends js.Object {
  def default(text: String): AnonContentBlocks = js.native
  def default(
    text: String,
    customChunkRenderer: js.Function2[
      /* nodeName */ String, 
      /* node */ HTMLElement, 
      js.UndefOr[RawDraftEntity[StringDictionary[_]]]
    ]
  ): AnonContentBlocks = js.native
}

