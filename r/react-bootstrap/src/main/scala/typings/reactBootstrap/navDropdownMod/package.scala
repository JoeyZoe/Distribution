package typings.reactBootstrap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object navDropdownMod {
  type NavDropdownProps = typings.reactBootstrap.navDropdownMod.NavDropdownBaseProps with (typings.reactBootstrap.mod.Omit[
    typings.react.mod.HTMLProps[typings.reactBootstrap.navDropdownMod.NavDropdown], 
    typings.reactBootstrap.reactBootstrapStrings.title
  ])
}
