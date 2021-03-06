package typings.nodelibFsStat

import typings.nodelibFsStat.settingsMod.default
import typings.nodelibFsStat.typesMod.ErrnoException
import typings.nodelibFsStat.typesMod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@nodelib/fs.stat/out/providers/async", JSImport.Namespace)
@js.native
object asyncMod extends js.Object {
  def read(path: String, settings: default, callback: AsyncCallback): Unit = js.native
  type AsyncCallback = js.Function2[/* err */ ErrnoException, /* stats */ Stats, Unit]
}

