package typings.evernote.mod.Types

import typings.evernote.AnonAccessType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("evernote", "Types.RelatedContent")
@js.native
class RelatedContent () extends js.Object {
  def this(args: AnonAccessType) = this()
  var accessType: js.UndefOr[RelatedContentAccess] = js.native
  var authors: js.UndefOr[js.Array[String]] = js.native
  var clipUrl: js.UndefOr[String] = js.native
  var contact: js.UndefOr[Contact] = js.native
  var contentId: js.UndefOr[String] = js.native
  var contentType: js.UndefOr[RelatedContentType] = js.native
  var date: js.UndefOr[Timestamp] = js.native
  var sourceFaviconUrl: js.UndefOr[String] = js.native
  var sourceId: js.UndefOr[String] = js.native
  var sourceName: js.UndefOr[String] = js.native
  var sourceUrl: js.UndefOr[String] = js.native
  var teaser: js.UndefOr[String] = js.native
  var thumbnails: js.UndefOr[js.Array[RelatedContentImage]] = js.native
  var title: js.UndefOr[String] = js.native
  var url: js.UndefOr[String] = js.native
  var visibleUrl: js.UndefOr[String] = js.native
}

