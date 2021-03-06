package typings.algoliaClientSearch.mod

import typings.algoliaClientSearch.ReadonlyPromisevoid
import typings.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/client-search", "browseObjects")
@js.native
object browseObjects extends js.Object {
  def apply(base: SearchIndex): js.Function1[
    /* requestOptions */ js.UndefOr[SearchOptions with BrowseOptions[_] with RequestOptions], 
    ReadonlyPromisevoid
  ] = js.native
}

