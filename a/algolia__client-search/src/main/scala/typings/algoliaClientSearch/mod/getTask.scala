package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.ReadonlyPromiseTaskStatus
import typings.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/client-search", "getTask")
@js.native
object getTask extends js.Object {
  def apply(base: SearchIndex): js.Function2[
    /* taskID */ Double, 
    /* requestOptions */ js.UndefOr[RequestOptions], 
    ReadonlyPromiseTaskStatus
  ] = js.native
}

