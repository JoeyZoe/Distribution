package typings.gulpJspm

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type GulpJspm = js.Function1[
    /* options */ js.UndefOr[typings.gulpJspm.mod.Options], 
    typings.node.NodeJS.ReadWriteStream
  ]
}
