package typings.reactBootstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object dropdownButtonMod {
  type DropdownButtonProps = typings.reactBootstrap.dropdownButtonMod.DropdownButtonBaseProps with (typings.reactBootstrap.mod.Omit[
    typings.react.mod.HTMLProps[typings.reactBootstrap.dropdownButtonMod.DropdownButton], 
    typings.reactBootstrap.reactBootstrapStrings.title
  ])
}
