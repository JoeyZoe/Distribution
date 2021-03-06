package typings.inversify

import typings.inversify.interfacesMod.interfaces.BindingScope
import typings.inversify.interfacesMod.interfaces.ServiceIdentifier
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("inversify/dts/bindings/binding", JSImport.Namespace)
@js.native
object bindingMod extends js.Object {
  @js.native
  class Binding[T] protected ()
    extends typings.inversify.interfacesMod.interfaces.Binding[T] {
    def this(serviceIdentifier: ServiceIdentifier[T], scope: BindingScope) = this()
  }
  
}

