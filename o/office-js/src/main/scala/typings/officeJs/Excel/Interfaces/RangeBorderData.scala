package typings.officeJs.Excel.Interfaces

import typings.officeJs.Excel.BorderIndex
import typings.officeJs.Excel.BorderLineStyle
import typings.officeJs.Excel.BorderWeight
import typings.officeJs.officeJsStrings.Continuous
import typings.officeJs.officeJsStrings.Dash
import typings.officeJs.officeJsStrings.DashDot
import typings.officeJs.officeJsStrings.DashDotDot
import typings.officeJs.officeJsStrings.DiagonalDown
import typings.officeJs.officeJsStrings.DiagonalUp
import typings.officeJs.officeJsStrings.Dot
import typings.officeJs.officeJsStrings.Double
import typings.officeJs.officeJsStrings.EdgeBottom
import typings.officeJs.officeJsStrings.EdgeLeft
import typings.officeJs.officeJsStrings.EdgeRight
import typings.officeJs.officeJsStrings.EdgeTop
import typings.officeJs.officeJsStrings.Hairline
import typings.officeJs.officeJsStrings.InsideHorizontal
import typings.officeJs.officeJsStrings.InsideVertical
import typings.officeJs.officeJsStrings.Medium
import typings.officeJs.officeJsStrings.None
import typings.officeJs.officeJsStrings.SlantDashDot
import typings.officeJs.officeJsStrings.Thick
import typings.officeJs.officeJsStrings.Thin
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An interface describing the data returned by calling `rangeBorder.toJSON()`. */
trait RangeBorderData extends js.Object {
  /**
    *
    * HTML color code representing the color of the border line, of the form #RRGGBB (e.g. "FFA500") or as a named HTML color (e.g. "orange").
    *
    * [Api set: ExcelApi 1.1]
    */
  var color: js.UndefOr[String] = js.undefined
  /**
    *
    * Constant value that indicates the specific side of the border. See Excel.BorderIndex for details. Read-only.
    *
    * [Api set: ExcelApi 1.1]
    */
  var sideIndex: js.UndefOr[
    BorderIndex | EdgeTop | EdgeBottom | EdgeLeft | EdgeRight | InsideVertical | InsideHorizontal | DiagonalDown | DiagonalUp
  ] = js.undefined
  /**
    *
    * One of the constants of line style specifying the line style for the border. See Excel.BorderLineStyle for details.
    *
    * [Api set: ExcelApi 1.1]
    */
  var style: js.UndefOr[
    BorderLineStyle | None | Continuous | Dash | DashDot | DashDotDot | Dot | Double | SlantDashDot
  ] = js.undefined
  /**
    *
    * Returns or sets a double that lightens or darkens a color for Range Border, the value is between -1 (darkest) and 1 (brightest), with 0 for the original color.
    A null value indicates that the border doesn't have uniform tintAndShade setting.
    *
    * [Api set: ExcelApi 1.9]
    */
  var tintAndShade: js.UndefOr[scala.Double] = js.undefined
  /**
    *
    * Specifies the weight of the border around a range. See Excel.BorderWeight for details.
    *
    * [Api set: ExcelApi 1.1]
    */
  var weight: js.UndefOr[BorderWeight | Hairline | Thin | Medium | Thick] = js.undefined
}

object RangeBorderData {
  @scala.inline
  def apply(
    color: String = null,
    sideIndex: BorderIndex | EdgeTop | EdgeBottom | EdgeLeft | EdgeRight | InsideVertical | InsideHorizontal | DiagonalDown | DiagonalUp = null,
    style: BorderLineStyle | None | Continuous | Dash | DashDot | DashDotDot | Dot | Double | SlantDashDot = null,
    tintAndShade: Int | scala.Double = null,
    weight: BorderWeight | Hairline | Thin | Medium | Thick = null
  ): RangeBorderData = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (sideIndex != null) __obj.updateDynamic("sideIndex")(sideIndex.asInstanceOf[js.Any])
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    if (tintAndShade != null) __obj.updateDynamic("tintAndShade")(tintAndShade.asInstanceOf[js.Any])
    if (weight != null) __obj.updateDynamic("weight")(weight.asInstanceOf[js.Any])
    __obj.asInstanceOf[RangeBorderData]
  }
}

