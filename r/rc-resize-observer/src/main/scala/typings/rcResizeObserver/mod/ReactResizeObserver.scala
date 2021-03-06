package typings.rcResizeObserver.mod

import typings.rcResizeObserver.AnonWidth
import typings.react.mod.Component
import typings.resizeObserverPolyfill.mod.ResizeObserver
import typings.resizeObserverPolyfill.mod._Global_.ResizeObserverCallback
import typings.std.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ReactResizeObserver
  extends Component[ResizeObserverProps, ResizeObserverState, js.Any] {
  var childNode: RefNode = js.native
  var currentElement: Element | Null = js.native
  var onResize: ResizeObserverCallback = js.native
  var resizeObserver: ResizeObserver | Null = js.native
  @JSName("state")
  var state_ReactResizeObserver: AnonWidth = js.native
  @JSName("componentDidMount")
  def componentDidMount_MReactResizeObserver(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MReactResizeObserver(): Unit = js.native
  @JSName("componentWillUnmount")
  def componentWillUnmount_MReactResizeObserver(): Unit = js.native
  def destroyObserver(): Unit = js.native
  def onComponentUpdated(): Unit = js.native
  def setChildNode(node: Component[_, js.Object, _]): Unit = js.native
  def setChildNode(node: Element): Unit = js.native
  def setChildNode(node: HTMLElement): Unit = js.native
}

