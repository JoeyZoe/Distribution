package typings.googleapis.visionV1Mod.visionV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Metadata for web pages.
  */
@js.native
trait SchemaWebPage extends js.Object {
  /**
    * Fully matching images on the page. Can include resized copies of the
    * query image.
    */
  var fullMatchingImages: js.UndefOr[js.Array[SchemaWebImage]] = js.native
  /**
    * Title for the web page, may contain HTML markups.
    */
  var pageTitle: js.UndefOr[String] = js.native
  /**
    * Partial matching images on the page. Those images are similar enough to
    * share some key-point features. For example an original image will likely
    * have partial matching for its crops.
    */
  var partialMatchingImages: js.UndefOr[js.Array[SchemaWebImage]] = js.native
  /**
    * (Deprecated) Overall relevancy score for the web page.
    */
  var score: js.UndefOr[Double] = js.native
  /**
    * The result web page URL.
    */
  var url: js.UndefOr[String] = js.native
}

object SchemaWebPage {
  @scala.inline
  def apply(
    fullMatchingImages: js.Array[SchemaWebImage] = null,
    pageTitle: String = null,
    partialMatchingImages: js.Array[SchemaWebImage] = null,
    score: Int | Double = null,
    url: String = null
  ): SchemaWebPage = {
    val __obj = js.Dynamic.literal()
    if (fullMatchingImages != null) __obj.updateDynamic("fullMatchingImages")(fullMatchingImages.asInstanceOf[js.Any])
    if (pageTitle != null) __obj.updateDynamic("pageTitle")(pageTitle.asInstanceOf[js.Any])
    if (partialMatchingImages != null) __obj.updateDynamic("partialMatchingImages")(partialMatchingImages.asInstanceOf[js.Any])
    if (score != null) __obj.updateDynamic("score")(score.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaWebPage]
  }
}

