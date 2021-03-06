package typings.jestConfig.mod

import typings.jestConfig.AnonConfigs
import typings.jestTypes.configMod.Argv
import typings.jestTypes.configMod.Path
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("jest-config", "readConfigs")
@js.native
object readConfigs extends js.Object {
  def apply(argv: Argv, projectPaths: js.Array[Path]): js.Promise[AnonConfigs] = js.native
}

