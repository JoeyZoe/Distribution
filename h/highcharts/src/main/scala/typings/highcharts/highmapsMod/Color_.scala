package typings.highcharts.highmapsMod

import typings.highcharts.mod.ColorType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("highcharts/highmaps", "Color")
@js.native
class Color_ protected ()
  extends typings.highcharts.mod.Color_ {
  /**
    * Handle color operations. Some object methods are chainable.
    *
    * @param input
    *        The input color in either rbga or hex format
    */
  def this(input: ColorType) = this()
}

/* static members */
@JSImport("highcharts/highmaps", "Color")
@js.native
object Color_ extends js.Object {
  /**
    * Creates a color instance out of a color string or object.
    *
    * @param input
    *        The input color in either rbga or hex format.
    *
    * @return Color instance.
    */
  def parse(input: ColorType): typings.highcharts.mod.Color_ = js.native
}

