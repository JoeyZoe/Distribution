package typings.stremioAddonSdk.mod

import typings.stremioAddonSdk.stremioAddonSdkStrings.landscape
import typings.stremioAddonSdk.stremioAddonSdkStrings.regular
import typings.stremioAddonSdk.stremioAddonSdkStrings.square
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Summarized collection of meta items.
  *
  * Catalogs are displayed on the Stremio's Board, Discover and Search.
  */
trait MetaPreview extends js.Object {
  /**
    * The background shown on the stremio detail page.
    *
    * Heavily encouraged if you want your content to look good.
    *
    * URL to PNG, max file size 500kb.
    */
  var background: js.UndefOr[String] = js.undefined
  /**
    * A few sentences describing your content.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * Universal identifier.
    * You may use a prefix unique to your addon.
    *
    * Example: 'yt_id:UCrDkAvwZum-UTjHmzDI2iIw'
    */
  var id: String
  /**
    * The logo shown on the stremio detail page.
    *
    * Encouraged if you want your content to look good.
    *
    * URL to PNG.
    */
  var logo: js.UndefOr[String] = js.undefined
  /**
    * Name of the content.
    */
  var name: String
  /**
    * URL to PNG of poster.
    *
    * Accepted aspect ratios: 1:0.675 (IMDb poster type) or 1:1 (square).
    *
    * You can use any resolution, as long as the file size is below 100kb.
    * Below 50kb is recommended
    */
  var poster: js.UndefOr[String] = js.undefined
  /**
    * Poster can be square (1:1 aspect) or regular (1:0.675) or landscape (1:1.77).
    *
    * Defaults to 'regular'.
    */
  var posterShape: js.UndefOr[square | regular | landscape] = js.undefined
  /**
    * Type of the content.
    */
  var `type`: ContentType
}

object MetaPreview {
  @scala.inline
  def apply(
    id: String,
    name: String,
    `type`: ContentType,
    background: String = null,
    description: String = null,
    logo: String = null,
    poster: String = null,
    posterShape: square | regular | landscape = null
  ): MetaPreview = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (background != null) __obj.updateDynamic("background")(background.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (logo != null) __obj.updateDynamic("logo")(logo.asInstanceOf[js.Any])
    if (poster != null) __obj.updateDynamic("poster")(poster.asInstanceOf[js.Any])
    if (posterShape != null) __obj.updateDynamic("posterShape")(posterShape.asInstanceOf[js.Any])
    __obj.asInstanceOf[MetaPreview]
  }
}

