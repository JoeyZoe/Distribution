package typings.arcgisJsApi.esri

import typings.std.Object
import typings.std.PropertyKey
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SupportingWidgetDefaultsSketch extends Object {
  /**
    * An object containing the `defaultUpdateOptions` for the [Sketch](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Sketch.html) widget.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#SupportingWidgetDefaults)
    */
  var defaultUpdateOptions: js.UndefOr[js.Any] = js.undefined
  /**
    * The marker symbol used to symbolize any point feature updates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#SupportingWidgetDefaults)
    */
  var markerSymbol: js.UndefOr[SimpleMarkerSymbol] = js.undefined
  /**
    * The polygon symbol used to symbolize any polygon feature updates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#SupportingWidgetDefaults)
    */
  var polygonSymbol: js.UndefOr[SimpleFillSymbol] = js.undefined
  /**
    * The line symbol used to symbolize any line feature updates.
    *
    * [Read more...](https://developers.arcgis.com/javascript/latest/api-reference/esri-widgets-Editor.html#SupportingWidgetDefaults)
    */
  var polylineSymbol: js.UndefOr[SimpleLineSymbol] = js.undefined
}

object SupportingWidgetDefaultsSketch {
  @scala.inline
  def apply(
    constructor: js.Function,
    hasOwnProperty: PropertyKey => Boolean,
    propertyIsEnumerable: PropertyKey => Boolean,
    defaultUpdateOptions: js.Any = null,
    markerSymbol: SimpleMarkerSymbol = null,
    polygonSymbol: SimpleFillSymbol = null,
    polylineSymbol: SimpleLineSymbol = null
  ): SupportingWidgetDefaultsSketch = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    if (defaultUpdateOptions != null) __obj.updateDynamic("defaultUpdateOptions")(defaultUpdateOptions.asInstanceOf[js.Any])
    if (markerSymbol != null) __obj.updateDynamic("markerSymbol")(markerSymbol.asInstanceOf[js.Any])
    if (polygonSymbol != null) __obj.updateDynamic("polygonSymbol")(polygonSymbol.asInstanceOf[js.Any])
    if (polylineSymbol != null) __obj.updateDynamic("polylineSymbol")(polylineSymbol.asInstanceOf[js.Any])
    __obj.asInstanceOf[SupportingWidgetDefaultsSketch]
  }
}

