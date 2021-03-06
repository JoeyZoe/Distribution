package typings.gapiClientContent.gapi.client.content

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ProductShipping extends js.Object {
  /** The CLDR territory code of the country to which an item will ship. */
  var country: js.UndefOr[String] = js.undefined
  /** The location where the shipping is applicable, represented by a location group name. */
  var locationGroupName: js.UndefOr[String] = js.undefined
  /** The numeric id of a location that the shipping rate applies to as defined in the AdWords API. */
  var locationId: js.UndefOr[String] = js.undefined
  /**
    * The postal code range that the shipping rate applies to, represented by a postal code, a postal code prefix followed by a &#42; wildcard, a range between
    * two postal codes or two postal code prefixes of equal length.
    */
  var postalCode: js.UndefOr[String] = js.undefined
  /** Fixed shipping price, represented as a number. */
  var price: js.UndefOr[Price] = js.undefined
  /** The geographic region to which a shipping rate applies. */
  var region: js.UndefOr[String] = js.undefined
  /** A free-form description of the service class or delivery speed. */
  var service: js.UndefOr[String] = js.undefined
}

object ProductShipping {
  @scala.inline
  def apply(
    country: String = null,
    locationGroupName: String = null,
    locationId: String = null,
    postalCode: String = null,
    price: Price = null,
    region: String = null,
    service: String = null
  ): ProductShipping = {
    val __obj = js.Dynamic.literal()
    if (country != null) __obj.updateDynamic("country")(country.asInstanceOf[js.Any])
    if (locationGroupName != null) __obj.updateDynamic("locationGroupName")(locationGroupName.asInstanceOf[js.Any])
    if (locationId != null) __obj.updateDynamic("locationId")(locationId.asInstanceOf[js.Any])
    if (postalCode != null) __obj.updateDynamic("postalCode")(postalCode.asInstanceOf[js.Any])
    if (price != null) __obj.updateDynamic("price")(price.asInstanceOf[js.Any])
    if (region != null) __obj.updateDynamic("region")(region.asInstanceOf[js.Any])
    if (service != null) __obj.updateDynamic("service")(service.asInstanceOf[js.Any])
    __obj.asInstanceOf[ProductShipping]
  }
}

