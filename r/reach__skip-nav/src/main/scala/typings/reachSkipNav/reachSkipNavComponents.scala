package typings.reachSkipNav

import typings.reachSkipNav.mod.SkipNavProps
import typings.react.mod.ComponentType
import typings.react.mod.HTMLProps
import typings.std.HTMLAnchorElement
import typings.std.HTMLDivElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

object reachSkipNavComponents extends reachSkipNavProps {
  @scala.inline
  def SkipNavContent: ComponentType[SkipNavProps with HTMLProps[HTMLDivElement]] = js.constructorOf[typings.reachSkipNav.mod.SkipNavContent].asInstanceOf[typings.react.mod.ComponentType[
  typings.reachSkipNav.mod.SkipNavProps with typings.react.mod.HTMLProps[typings.std.HTMLDivElement]]]
  @scala.inline
  def SkipNavLink: ComponentType[SkipNavProps with HTMLProps[HTMLAnchorElement]] = js.constructorOf[typings.reachSkipNav.mod.SkipNavLink].asInstanceOf[typings.react.mod.ComponentType[
  typings.reachSkipNav.mod.SkipNavProps with typings.react.mod.HTMLProps[typings.std.HTMLAnchorElement]]]
}

