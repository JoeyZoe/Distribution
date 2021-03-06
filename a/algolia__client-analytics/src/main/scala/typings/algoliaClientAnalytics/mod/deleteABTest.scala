package typings.algoliaClientAnalytics.mod

import typings.algoliaClientAnalytics.ReadonlyPromiseDeleteABTe
import typings.algoliaTransporter.mod.RequestOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@algolia/client-analytics", "deleteABTest")
@js.native
object deleteABTest extends js.Object {
  def apply(base: AnalyticsClient): js.Function2[
    /* abTestID */ Double, 
    /* requestOptions */ js.UndefOr[RequestOptions], 
    ReadonlyPromiseDeleteABTe
  ] = js.native
}

