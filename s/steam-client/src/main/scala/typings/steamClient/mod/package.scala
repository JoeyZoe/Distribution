package typings.steamClient

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object mod {
  type SendMessage = js.Function3[
    /* header */ typings.steamClient.AnonMsg, 
    /* body */ typings.node.Buffer | (/* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify ByteBuffer */ js.Any), 
    /* callback */ js.UndefOr[
      (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt applyOrElse Simplified recursive type alias steam-client.steam-client.SendMessage */ js.Object) | typings.steamClient.steamClientBooleans.`false`
    ], 
    scala.Unit
  ]
}
