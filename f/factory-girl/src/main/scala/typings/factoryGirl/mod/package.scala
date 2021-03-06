package typings.factoryGirl

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type Attributes[T] = typings.factoryGirl.mod.Definition[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: factory-girl.factory-girl.Definition<T[P]>}
    */ typings.factoryGirl.factoryGirlStrings.Attributes with T
  ]
  type Definition[T] = T | typings.factoryGirl.mod.Generator[T]
  type Generator[T] = js.Function0[T]
  type Hook[T] = js.Function3[/* model */ js.Any, /* attrs */ js.Array[T], /* options */ js.Any, scala.Unit]
}
