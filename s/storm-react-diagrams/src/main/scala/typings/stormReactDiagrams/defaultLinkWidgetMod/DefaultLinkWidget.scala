package typings.stormReactDiagrams.defaultLinkWidgetMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod._Global_.JSX.Element
import typings.std.HTMLElement
import typings.std.MouseEvent
import typings.std.SVGPathElement
import typings.stormReactDiagrams.AnonPath
import typings.stormReactDiagrams.baseWidgetMod.BaseWidget
import typings.stormReactDiagrams.labelModelMod.LabelModel
import typings.stormReactDiagrams.pathFindingMod.default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("storm-react-diagrams/dist/src/defaults/widgets/DefaultLinkWidget", "DefaultLinkWidget")
@js.native
class DefaultLinkWidget protected () extends BaseWidget[DefaultLinkProps, DefaultLinkState] {
  def this(props: DefaultLinkProps) = this()
  var pathFinding: default = js.native
  var refLabels: StringDictionary[HTMLElement] = js.native
  var refPaths: js.Array[SVGPathElement] = js.native
  def addPointToLink(event: MouseEvent, index: Double): Unit = js.native
  def calculateAllLabelPosition(): Unit = js.native
  def calculateLabelPosition(label: js.Any, index: Double): Unit = js.native
  @JSName("componentDidMount")
  def componentDidMount_MDefaultLinkWidget(): Unit = js.native
  @JSName("componentDidUpdate")
  def componentDidUpdate_MDefaultLinkWidget(): Unit = js.native
  def findPathAndRelativePositionToRenderLabel(index: Double): AnonPath = js.native
  def generateLabel(label: LabelModel): Element = js.native
  def generateLink(path: String, extraProps: js.Any, id: String): Element = js.native
  def generateLink(path: String, extraProps: js.Any, id: Double): Element = js.native
  def generatePoint(pointIndex: Double): Element = js.native
  /**
    * Smart routing is only applicable when all conditions below are true:
    * - smart routing is set to true on the engine
    * - current link is between two nodes (not between a node and an empty point)
    * - no custom points exist along the line
    */
  def isSmartRoutingApplicable(): Boolean = js.native
}

/* static members */
@JSImport("storm-react-diagrams/dist/src/defaults/widgets/DefaultLinkWidget", "DefaultLinkWidget")
@js.native
object DefaultLinkWidget extends js.Object {
  var defaultProps: DefaultLinkProps = js.native
}

