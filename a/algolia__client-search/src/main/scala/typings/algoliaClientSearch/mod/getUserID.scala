package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.ReadonlyPromiseUserIDResp
import typings.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/client-search", "getUserID")
@js.native
object getUserID extends js.Object {
  def apply(base: SearchClient): js.Function2[
    /* userID */ String, 
    /* requestOptions */ js.UndefOr[RequestOptions], 
    ReadonlyPromiseUserIDResp
  ] = js.native
}

