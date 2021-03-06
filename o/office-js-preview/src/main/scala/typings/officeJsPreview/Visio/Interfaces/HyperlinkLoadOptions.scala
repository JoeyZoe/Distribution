package typings.officeJsPreview.Visio.Interfaces

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  *
  * Represents the Hyperlink.
  *
  * [Api set:  1.1]
  */
trait HyperlinkLoadOptions extends js.Object {
  @JSName("$all")
  var $all: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the address of the Hyperlink object. Read-only.
    *
    * [Api set:  1.1]
    */
  var address: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the description of a hyperlink. Read-only.
    *
    * [Api set:  1.1]
    */
  var description: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the extra URL request information used to resolve the hyperlink's URL. Read-only.
    *
    * [Api set:  1.1]
    */
  var extraInfo: js.UndefOr[Boolean] = js.undefined
  /**
    *
    * Gets the sub-address of the Hyperlink object. Read-only.
    *
    * [Api set:  1.1]
    */
  var subAddress: js.UndefOr[Boolean] = js.undefined
}

object HyperlinkLoadOptions {
  @scala.inline
  def apply(
    $all: js.UndefOr[Boolean] = js.undefined,
    address: js.UndefOr[Boolean] = js.undefined,
    description: js.UndefOr[Boolean] = js.undefined,
    extraInfo: js.UndefOr[Boolean] = js.undefined,
    subAddress: js.UndefOr[Boolean] = js.undefined
  ): HyperlinkLoadOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined($all)) __obj.updateDynamic("$all")($all.asInstanceOf[js.Any])
    if (!js.isUndefined(address)) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (!js.isUndefined(description)) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (!js.isUndefined(extraInfo)) __obj.updateDynamic("extraInfo")(extraInfo.asInstanceOf[js.Any])
    if (!js.isUndefined(subAddress)) __obj.updateDynamic("subAddress")(subAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[HyperlinkLoadOptions]
  }
}

