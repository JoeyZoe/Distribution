package typings.officeUiFabricReact

import typings.officeUiFabricReact.stackItemTypesMod.IStackItemProps
import typings.officeUiFabricReact.stackTypesMod.IStackProps
import typings.react.mod.FunctionComponent
import typings.react.mod.PropsWithChildren
import typings.react.mod.ReactElement
import typings.react.mod.ValidationMap
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Stack/Stack", JSImport.Namespace)
@js.native
object stackStackMod extends js.Object {
  @js.native
  object Stack extends js.Object {
    var Item: FunctionComponent[IStackItemProps] = js.native
    var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
    var defaultProps: js.UndefOr[PartialIStackProps] = js.native
    var displayName: js.UndefOr[String] = js.native
    var propTypes: js.UndefOr[WeakValidationMapIStackPr] = js.native
    def apply(props: PropsWithChildren[IStackProps]): ReactElement | Null = js.native
    def apply(props: PropsWithChildren[IStackProps], context: js.Any): ReactElement | Null = js.native
  }
  
  @js.native
  object default extends js.Object {
    var Item: FunctionComponent[IStackItemProps] = js.native
    var contextTypes: js.UndefOr[ValidationMap[_]] = js.native
    var defaultProps: js.UndefOr[PartialIStackProps] = js.native
    var displayName: js.UndefOr[String] = js.native
    var propTypes: js.UndefOr[WeakValidationMapIStackPr] = js.native
    def apply(props: PropsWithChildren[IStackProps]): ReactElement | Null = js.native
    def apply(props: PropsWithChildren[IStackProps], context: js.Any): ReactElement | Null = js.native
  }
  
}

