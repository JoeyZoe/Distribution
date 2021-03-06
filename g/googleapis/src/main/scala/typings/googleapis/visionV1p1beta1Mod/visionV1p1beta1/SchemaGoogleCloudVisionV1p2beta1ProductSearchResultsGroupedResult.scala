package typings.googleapis.visionV1p1beta1Mod.visionV1p1beta1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Information about the products similar to a single product in a query
  * image.
  */
@js.native
trait SchemaGoogleCloudVisionV1p2beta1ProductSearchResultsGroupedResult extends js.Object {
  /**
    * The bounding polygon around the product detected in the query image.
    */
  var boundingPoly: js.UndefOr[SchemaGoogleCloudVisionV1p2beta1BoundingPoly] = js.native
  /**
    * List of results, one for each product match.
    */
  var results: js.UndefOr[js.Array[SchemaGoogleCloudVisionV1p2beta1ProductSearchResultsResult]] = js.native
}

object SchemaGoogleCloudVisionV1p2beta1ProductSearchResultsGroupedResult {
  @scala.inline
  def apply(
    boundingPoly: SchemaGoogleCloudVisionV1p2beta1BoundingPoly = null,
    results: js.Array[SchemaGoogleCloudVisionV1p2beta1ProductSearchResultsResult] = null
  ): SchemaGoogleCloudVisionV1p2beta1ProductSearchResultsGroupedResult = {
    val __obj = js.Dynamic.literal()
    if (boundingPoly != null) __obj.updateDynamic("boundingPoly")(boundingPoly.asInstanceOf[js.Any])
    if (results != null) __obj.updateDynamic("results")(results.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaGoogleCloudVisionV1p2beta1ProductSearchResultsGroupedResult]
  }
}

