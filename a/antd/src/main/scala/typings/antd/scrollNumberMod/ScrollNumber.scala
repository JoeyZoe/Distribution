package typings.antd.scrollNumberMod

import typings.antd.contextMod.ConfigConsumerProps
import typings.react.mod.CElement
import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.react.mod._Global_.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScrollNumber
  extends Component[ScrollNumberProps, ScrollNumberState, js.Any] {
  var clearTimeout: js.Any = js.native
  var lastCount: js.UndefOr[String | Double | Null] = js.native
  var timeout: js.UndefOr[js.Any] = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MScrollNumber(_underscore: js.Any, prevState: ScrollNumberState): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MScrollNumber(): Unit = js.native
  def getPositionByNum(num: Double, i: Double): Double = js.native
  def onAnimated(): Unit = js.native
  def renderCurrentNumber(prefixCls: String, num: String, i: Double): Element = js.native
  def renderCurrentNumber(prefixCls: String, num: Double, i: Double): Element = js.native
  def renderNumberElement(prefixCls: String): js.UndefOr[String | Double | js.Array[Element] | Null] = js.native
  def renderScrollNumber(hasGetPrefixCls: ConfigConsumerProps): (CElement[_, Component[_, _, _]]) | ReactElement = js.native
}

