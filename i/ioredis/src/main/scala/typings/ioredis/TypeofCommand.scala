package typings.ioredis

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import org.scalablytyped.runtime.Instantiable4
import typings.ioredis.mod.Command
import typings.ioredis.mod.CommandOptions
import typings.ioredis.mod.ValueType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofCommand
  extends Instantiable2[/* name */ String, /* args */ js.Array[ValueType], Command]
     with Instantiable3[/* name */ String, /* args */ js.Array[ValueType], /* opts */ CommandOptions, Command]
     with Instantiable4[
      /* name */ String, 
      /* args */ js.Array[ValueType], 
      /* opts */ CommandOptions, 
      /* callback */ js.Function2[/* err */ Null, /* result */ js.Any, Unit], 
      Command
    ] {
  def setArgumentTransformer(name: String, fn: js.Function1[/* args */ js.Array[ValueType], js.Array[ValueType]]): Unit = js.native
  def setReplyTransformer(name: String, fn: js.Function1[/* result */ js.Any, _]): Unit = js.native
}

