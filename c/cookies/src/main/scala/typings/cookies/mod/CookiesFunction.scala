package typings.cookies.mod

import org.scalablytyped.runtime.Instantiable2
import org.scalablytyped.runtime.Instantiable3
import typings.connect.mod.NextHandleFunction
import typings.cookies.AnonInstantiable
import typings.express.mod.Handler
import typings.keygrip.mod.Keygrip
import typings.node.httpMod.IncomingMessage
import typings.node.httpMod.ServerResponse
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CookiesFunction
  extends /**
  * "options" array of key strings is deprecated, provide using options {"keys": keygrip}
  */
// tslint:disable-next-line:unified-signatures
/**
  * "options" instance of Keygrip is deprecated, provide using options {"keys": keygrip}
  */
Instantiable3[
      /* request */ IncomingMessage, 
      /* response */ ServerResponse, 
      (/* options */ js.Array[String]) | (/* options */ Keygrip) | (/* options */ Option), 
      Cookies
    ]
     with Instantiable2[/* request */ IncomingMessage, /* response */ ServerResponse, Cookies] {
  var Cookie: AnonInstantiable = js.native
  def apply(request: IncomingMessage, response: ServerResponse): Cookies = js.native
  /**
    * "options" array of key strings is deprecated, provide using options {"keys": keygrip}
    */
  // tslint:disable-next-line:unified-signatures
  def apply(request: IncomingMessage, response: ServerResponse, options: js.Array[String]): Cookies = js.native
  def apply(request: IncomingMessage, response: ServerResponse, options: Option): Cookies = js.native
  /**
    * "options" instance of Keygrip is deprecated, provide using options {"keys": keygrip}
    */
  // tslint:disable-next-line:unified-signatures
  def apply(request: IncomingMessage, response: ServerResponse, options: Keygrip): Cookies = js.native
  def connect(keys: js.Array[String]): NextHandleFunction = js.native
  def connect(keys: Keygrip): NextHandleFunction = js.native
  def express(keys: js.Array[String]): Handler = js.native
  def express(keys: Keygrip): Handler = js.native
}

