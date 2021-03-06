package typings.typeFest

import typings.std.Extract
import typings.typeFest.exceptMod.Except
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("type-fest/source/merge", JSImport.Namespace)
@js.native
object mergeMod extends js.Object {
  type Merge[FirstType, SecondType] = (Except[FirstType, Extract[String, String]]) with SecondType
}

