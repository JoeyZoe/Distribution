package typings.wordpressElement.mod._Global_

import typings.react.mod.ReactInstance
import typings.react.mod.ReactNode
import typings.react.mod.ReactPortal
import typings.react.mod._Global_.JSX.Element
import typings.reactDom.mod.Renderer
import typings.std.DocumentFragment
import typings.std.Text
import typings.wordpressElement.AnonChildren
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("React")
@js.native
object React extends js.Object {
  val render: Renderer = js.native
  /**
    * Component used as equivalent of Fragment with unescaped HTML, in cases where
    * it is desirable to render dangerous HTML without needing a wrapper element.
    * To preserve additional props, a `div` wrapper _will_ be created if any props
    * aside from `children` are passed.
    *
    * @param props.children - HTML to render.
    *
    * @return Dangerously-rendering element.
    */
  def RawHTML(
    props: AnonChildren with (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify HTMLProps<HTMLDivElement> */ js.Any)
  ): Element = js.native
  /**
    * Checks if the provided WP element is empty.
    *
    * @param element - WP element to check.
    * @return True when an element is considered empty.
    */
  def isEmptyElement(
    element: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ReactNode */ js.Any
  ): Boolean = js.native
  /**
    * Serializes a React element to string.
    *
    * @param element       - Element to serialize.
    * @param context       - Context object.
    * @param legacyContext - Legacy context object.
    *
    * @return Serialized element.
    */
  def renderToString(
    element: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ReactNode */ js.Any
  ): String = js.native
  def renderToString(
    element: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ReactNode */ js.Any,
    context: js.Any
  ): String = js.native
  def renderToString(
    element: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ReactNode */ js.Any,
    context: js.Any,
    legacyContext: js.Any
  ): String = js.native
  //
  // ReactDOM re-exports
  //
  @js.native
  object createPortal extends js.Object {
    def apply(children: ReactNode, container: typings.std.Element): ReactPortal = js.native
    def apply(children: ReactNode, container: typings.std.Element, key: String): ReactPortal = js.native
  }
  
  @js.native
  object findDOMNode extends js.Object {
    def apply(): typings.std.Element | Null | Text = js.native
    def apply(instance: ReactInstance): typings.std.Element | Null | Text = js.native
  }
  
  @js.native
  object unmountComponentAtNode extends js.Object {
    def apply(container: DocumentFragment): Boolean = js.native
    def apply(container: typings.std.Element): Boolean = js.native
  }
  
}

