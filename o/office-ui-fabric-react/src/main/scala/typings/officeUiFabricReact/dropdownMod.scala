package typings.officeUiFabricReact

import typings.officeUiFabricReact.dropdownTypesMod.IDropdownProps
import typings.officeUiFabricReact.selectableOptionTypesMod.SelectableOptionMenuItemType
import typings.react.mod.FunctionComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("office-ui-fabric-react/lib/components/Dropdown", JSImport.Namespace)
@js.native
object dropdownMod extends js.Object {
  @js.native
  class DropdownBase protected ()
    extends typings.officeUiFabricReact.dropdownBaseMod.DropdownBase {
    def this(props: IDropdownProps) = this()
  }
  
  val Dropdown: FunctionComponent[IDropdownProps] = js.native
  /* static members */
  @js.native
  object DropdownBase extends js.Object {
    var defaultProps: AnonOptions = js.native
  }
  
  @js.native
  object DropdownMenuItemType extends js.Object {
    /* 1 */ val Divider: typings.officeUiFabricReact.selectableOptionTypesMod.SelectableOptionMenuItemType.Divider with Double = js.native
    /* 2 */ val Header: typings.officeUiFabricReact.selectableOptionTypesMod.SelectableOptionMenuItemType.Header with Double = js.native
    /* 0 */ val Normal: typings.officeUiFabricReact.selectableOptionTypesMod.SelectableOptionMenuItemType.Normal with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[SelectableOptionMenuItemType with Double] = js.native
  }
  
  @js.native
  object ResponsiveMode extends js.Object {
    /* 2 */ val large: typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.large with Double = js.native
    /* 1 */ val medium: typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.medium with Double = js.native
    /* 0 */ val small: typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.small with Double = js.native
    /* 999 */ val unknown: typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.unknown with Double = js.native
    /* 3 */ val xLarge: typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.xLarge with Double = js.native
    /* 4 */ val xxLarge: typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.xxLarge with Double = js.native
    /* 5 */ val xxxLarge: typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode.xxxLarge with Double = js.native
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[typings.officeUiFabricReact.withResponsiveModeMod.ResponsiveMode with Double] = js.native
  }
  
}

