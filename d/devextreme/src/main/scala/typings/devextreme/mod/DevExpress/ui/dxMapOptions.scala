package typings.devextreme.mod.DevExpress.ui

import typings.devextreme.AnonBing
import typings.devextreme.AnonColor
import typings.devextreme.AnonComponentElement
import typings.devextreme.AnonElement
import typings.devextreme.AnonIconSrc
import typings.devextreme.AnonJQueryEventLocation
import typings.devextreme.AnonModel
import typings.devextreme.AnonModelOptions
import typings.devextreme.AnonName
import typings.devextreme.AnonOptions
import typings.devextreme.AnonOriginalMap
import typings.devextreme.AnonOriginalRoute
import typings.devextreme.devextremeStrings.bing
import typings.devextreme.devextremeStrings.google
import typings.devextreme.devextremeStrings.googleStatic
import typings.devextreme.devextremeStrings.hybrid
import typings.devextreme.devextremeStrings.roadmap
import typings.devextreme.devextremeStrings.satellite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait dxMapOptions extends WidgetOptions[dxMap] {
  /** @name dxMap.Options.autoAdjust */
  var autoAdjust: js.UndefOr[Boolean] = js.undefined
  /** @name dxMap.Options.center */
  var center: js.UndefOr[js.Any | String | js.Array[Double]] = js.undefined
  /** @name dxMap.Options.controls */
  var controls: js.UndefOr[Boolean] = js.undefined
  /** @name dxMap.Options.key */
  var key: js.UndefOr[String | AnonBing] = js.undefined
  /** @name dxMap.Options.markerIconSrc */
  var markerIconSrc: js.UndefOr[String] = js.undefined
  /** @name dxMap.Options.markers */
  var markers: js.UndefOr[js.Array[AnonIconSrc]] = js.undefined
  /** @name dxMap.Options.onClick */
  var onClick: js.UndefOr[(js.Function1[/* e */ AnonJQueryEventLocation, _]) | String] = js.undefined
  /** @name dxMap.Options.onMarkerAdded */
  var onMarkerAdded: js.UndefOr[js.Function1[/* e */ AnonOptions, _]] = js.undefined
  /** @name dxMap.Options.onMarkerRemoved */
  var onMarkerRemoved: js.UndefOr[js.Function1[/* e */ AnonModelOptions, _]] = js.undefined
  /** @name dxMap.Options.onReady */
  var onReady: js.UndefOr[js.Function1[/* e */ AnonOriginalMap, _]] = js.undefined
  /** @name dxMap.Options.onRouteAdded */
  var onRouteAdded: js.UndefOr[js.Function1[/* e */ AnonOriginalRoute, _]] = js.undefined
  /** @name dxMap.Options.onRouteRemoved */
  var onRouteRemoved: js.UndefOr[js.Function1[/* e */ AnonModelOptions, _]] = js.undefined
  /** @name dxMap.Options.provider */
  var provider: js.UndefOr[bing | google | googleStatic] = js.undefined
  /** @name dxMap.Options.routes */
  var routes: js.UndefOr[js.Array[AnonColor]] = js.undefined
  /** @name dxMap.Options.type */
  var `type`: js.UndefOr[hybrid | roadmap | satellite] = js.undefined
  /** @name dxMap.Options.zoom */
  var zoom: js.UndefOr[Double] = js.undefined
}

object dxMapOptions {
  @scala.inline
  def apply(
    accessKey: String = null,
    activeStateEnabled: js.UndefOr[Boolean] = js.undefined,
    autoAdjust: js.UndefOr[Boolean] = js.undefined,
    bindingOptions: js.Any = null,
    center: js.Any | String | js.Array[Double] = null,
    controls: js.UndefOr[Boolean] = js.undefined,
    disabled: js.UndefOr[Boolean] = js.undefined,
    elementAttr: js.Any = null,
    focusStateEnabled: js.UndefOr[Boolean] = js.undefined,
    height: Double | String | (js.Function0[Double | String]) = null,
    hint: String = null,
    hoverStateEnabled: js.UndefOr[Boolean] = js.undefined,
    key: String | AnonBing = null,
    markerIconSrc: String = null,
    markers: js.Array[AnonIconSrc] = null,
    onClick: (js.Function1[/* e */ AnonJQueryEventLocation, _]) | String = null,
    onContentReady: /* e */ AnonComponentElement[dxMap] => _ = null,
    onDisposing: /* e */ AnonModel[dxMap] => _ = null,
    onInitialized: /* e */ AnonElement[dxMap] => _ = null,
    onMarkerAdded: /* e */ AnonOptions => _ = null,
    onMarkerRemoved: /* e */ AnonModelOptions => _ = null,
    onOptionChanged: /* e */ AnonName[dxMap] => _ = null,
    onReady: /* e */ AnonOriginalMap => _ = null,
    onRouteAdded: /* e */ AnonOriginalRoute => _ = null,
    onRouteRemoved: /* e */ AnonModelOptions => _ = null,
    provider: bing | google | googleStatic = null,
    routes: js.Array[AnonColor] = null,
    rtlEnabled: js.UndefOr[Boolean] = js.undefined,
    tabIndex: Int | Double = null,
    `type`: hybrid | roadmap | satellite = null,
    visible: js.UndefOr[Boolean] = js.undefined,
    width: Double | String | (js.Function0[Double | String]) = null,
    zoom: Int | Double = null
  ): dxMapOptions = {
    val __obj = js.Dynamic.literal()
    if (accessKey != null) __obj.updateDynamic("accessKey")(accessKey.asInstanceOf[js.Any])
    if (!js.isUndefined(activeStateEnabled)) __obj.updateDynamic("activeStateEnabled")(activeStateEnabled.asInstanceOf[js.Any])
    if (!js.isUndefined(autoAdjust)) __obj.updateDynamic("autoAdjust")(autoAdjust.asInstanceOf[js.Any])
    if (bindingOptions != null) __obj.updateDynamic("bindingOptions")(bindingOptions.asInstanceOf[js.Any])
    if (center != null) __obj.updateDynamic("center")(center.asInstanceOf[js.Any])
    if (!js.isUndefined(controls)) __obj.updateDynamic("controls")(controls.asInstanceOf[js.Any])
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (elementAttr != null) __obj.updateDynamic("elementAttr")(elementAttr.asInstanceOf[js.Any])
    if (!js.isUndefined(focusStateEnabled)) __obj.updateDynamic("focusStateEnabled")(focusStateEnabled.asInstanceOf[js.Any])
    if (height != null) __obj.updateDynamic("height")(height.asInstanceOf[js.Any])
    if (hint != null) __obj.updateDynamic("hint")(hint.asInstanceOf[js.Any])
    if (!js.isUndefined(hoverStateEnabled)) __obj.updateDynamic("hoverStateEnabled")(hoverStateEnabled.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (markerIconSrc != null) __obj.updateDynamic("markerIconSrc")(markerIconSrc.asInstanceOf[js.Any])
    if (markers != null) __obj.updateDynamic("markers")(markers.asInstanceOf[js.Any])
    if (onClick != null) __obj.updateDynamic("onClick")(onClick.asInstanceOf[js.Any])
    if (onContentReady != null) __obj.updateDynamic("onContentReady")(js.Any.fromFunction1(onContentReady))
    if (onDisposing != null) __obj.updateDynamic("onDisposing")(js.Any.fromFunction1(onDisposing))
    if (onInitialized != null) __obj.updateDynamic("onInitialized")(js.Any.fromFunction1(onInitialized))
    if (onMarkerAdded != null) __obj.updateDynamic("onMarkerAdded")(js.Any.fromFunction1(onMarkerAdded))
    if (onMarkerRemoved != null) __obj.updateDynamic("onMarkerRemoved")(js.Any.fromFunction1(onMarkerRemoved))
    if (onOptionChanged != null) __obj.updateDynamic("onOptionChanged")(js.Any.fromFunction1(onOptionChanged))
    if (onReady != null) __obj.updateDynamic("onReady")(js.Any.fromFunction1(onReady))
    if (onRouteAdded != null) __obj.updateDynamic("onRouteAdded")(js.Any.fromFunction1(onRouteAdded))
    if (onRouteRemoved != null) __obj.updateDynamic("onRouteRemoved")(js.Any.fromFunction1(onRouteRemoved))
    if (provider != null) __obj.updateDynamic("provider")(provider.asInstanceOf[js.Any])
    if (routes != null) __obj.updateDynamic("routes")(routes.asInstanceOf[js.Any])
    if (!js.isUndefined(rtlEnabled)) __obj.updateDynamic("rtlEnabled")(rtlEnabled.asInstanceOf[js.Any])
    if (tabIndex != null) __obj.updateDynamic("tabIndex")(tabIndex.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(visible)) __obj.updateDynamic("visible")(visible.asInstanceOf[js.Any])
    if (width != null) __obj.updateDynamic("width")(width.asInstanceOf[js.Any])
    if (zoom != null) __obj.updateDynamic("zoom")(zoom.asInstanceOf[js.Any])
    __obj.asInstanceOf[dxMapOptions]
  }
}

