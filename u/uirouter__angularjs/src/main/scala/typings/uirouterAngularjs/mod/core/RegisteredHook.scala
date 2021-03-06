package typings.uirouterAngularjs.mod.core

import typings.uirouterCore.transitionInterfaceMod.HookFn
import typings.uirouterCore.transitionInterfaceMod.HookMatchCriteria
import typings.uirouterCore.transitionInterfaceMod.HookRegOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@uirouter/angularjs", "core.RegisteredHook")
@js.native
class RegisteredHook protected ()
  extends typings.uirouterCore.mod.RegisteredHook {
  def this(
    tranSvc: typings.uirouterCore.transitionServiceMod.TransitionService,
    eventType: typings.uirouterCore.transitionEventTypeMod.TransitionEventType,
    callback: HookFn,
    matchCriteria: HookMatchCriteria,
    removeHookFromRegistry: js.Function1[/* hook */ typings.uirouterCore.hookRegistryMod.RegisteredHook, Unit]
  ) = this()
  def this(
    tranSvc: typings.uirouterCore.transitionServiceMod.TransitionService,
    eventType: typings.uirouterCore.transitionEventTypeMod.TransitionEventType,
    callback: HookFn,
    matchCriteria: HookMatchCriteria,
    removeHookFromRegistry: js.Function1[/* hook */ typings.uirouterCore.hookRegistryMod.RegisteredHook, Unit],
    options: HookRegOptions
  ) = this()
}

