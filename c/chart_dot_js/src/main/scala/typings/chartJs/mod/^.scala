package typings.chartJs.mod

import org.scalablytyped.runtime.StringDictionary
import typings.chartJs.AnonDictkey
import typings.chartJs.AnonDisableCSSInjection
import typings.chartJs.TypeofChart
import typings.std.ArrayLike
import typings.std.CanvasRenderingContext2D
import typings.std.HTMLCanvasElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("chart.js", JSImport.Namespace)
@js.native
class ^ protected () extends Chart {
  def this(context: String, options: ChartConfiguration) = this()
  def this(context: ArrayLike[CanvasRenderingContext2D | HTMLCanvasElement], options: ChartConfiguration) = this()
  def this(context: CanvasRenderingContext2D, options: ChartConfiguration) = this()
  def this(context: HTMLCanvasElement, options: ChartConfiguration) = this()
}

@JSImport("chart.js", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val Chart: TypeofChart = js.native
  // Tooltip Static Options
  var Tooltip: ChartTooltipsStaticConfiguration = js.native
  var controllers: StringDictionary[js.Any] = js.native
  var defaults: AnonDictkey = js.native
  var helpers: StringDictionary[js.Any] = js.native
  val instances: StringDictionary[typings.chartJs.mod.Chart] = js.native
  var platform: AnonDisableCSSInjection = js.native
  var pluginService: PluginServiceStatic = js.native
  var plugins: PluginServiceStatic = js.native
}

