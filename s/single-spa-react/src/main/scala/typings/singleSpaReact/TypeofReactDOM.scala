package typings.singleSpaReact

import typings.react.mod.CElement
import typings.react.mod.Component
import typings.react.mod.ComponentState
import typings.react.mod.DOMAttributes
import typings.react.mod.DOMElement
import typings.react.mod.ReactElement
import typings.react.mod.ReactInstance
import typings.react.mod.ReactNode
import typings.react.mod.ReactPortal
import typings.reactDom.mod.Renderer
import typings.std.DocumentFragment
import typings.std.Element
import typings.std.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofReactDOM extends js.Object {
  val hydrate: Renderer = js.native
  val render: Renderer = js.native
  val version: String = js.native
  def createPortal(children: ReactNode, container: Element): ReactPortal = js.native
  def createPortal(children: ReactNode, container: Element, key: String): ReactPortal = js.native
  def findDOMNode(): Element | Null | Text = js.native
  def findDOMNode(instance: ReactInstance): Element | Null | Text = js.native
  def unmountComponentAtNode(container: DocumentFragment): Boolean = js.native
  def unmountComponentAtNode(container: Element): Boolean = js.native
  def unstable_batchedUpdates(callback: js.Function0[_]): Unit = js.native
  def unstable_batchedUpdates[A](callback: js.Function1[/* a */ A, _], a: A): Unit = js.native
  def unstable_batchedUpdates[A, B](callback: js.Function2[/* a */ A, /* b */ B, _], a: A, b: B): Unit = js.native
  def unstable_renderSubtreeIntoContainer[T /* <: Element */](
    parentComponent: Component[_, js.Object, _],
    element: DOMElement[DOMAttributes[T], T],
    container: Element
  ): T = js.native
  def unstable_renderSubtreeIntoContainer[T /* <: Element */](
    parentComponent: Component[_, js.Object, _],
    element: DOMElement[DOMAttributes[T], T],
    container: Element,
    callback: js.Function1[/* element */ T, _]
  ): T = js.native
  def unstable_renderSubtreeIntoContainer[P](parentComponent: Component[_, js.Object, _], element: ReactElement, container: Element): (Component[P, ComponentState, _]) | Element | Unit = js.native
  def unstable_renderSubtreeIntoContainer[P](
    parentComponent: Component[_, js.Object, _],
    element: ReactElement,
    container: Element,
    callback: js.Function1[/* component */ js.UndefOr[(Component[P, ComponentState, _]) | Element], _]
  ): (Component[P, ComponentState, _]) | Element | Unit = js.native
  def unstable_renderSubtreeIntoContainer[P, T /* <: Component[P, ComponentState, _] */](parentComponent: Component[_, js.Object, _], element: CElement[P, T], container: Element): T = js.native
  def unstable_renderSubtreeIntoContainer[P, T /* <: Component[P, ComponentState, _] */](
    parentComponent: Component[_, js.Object, _],
    element: CElement[P, T],
    container: Element,
    callback: js.Function1[/* component */ T, _]
  ): T = js.native
}

