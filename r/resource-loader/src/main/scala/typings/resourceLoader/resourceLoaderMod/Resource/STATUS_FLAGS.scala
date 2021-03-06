package typings.resourceLoader.resourceLoaderMod.Resource

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait STATUS_FLAGS extends js.Object

/**
  * The types of resources a resource could represent.
  *
  * @static
  * @readonly
  * @enum {number}
  */
@JSImport("resource-loader", "Resource.STATUS_FLAGS")
@js.native
object STATUS_FLAGS extends js.Object {
  @js.native
  sealed trait COMPLETE extends STATUS_FLAGS
  
  @js.native
  sealed trait DATA_URL extends STATUS_FLAGS
  
  @js.native
  sealed trait LOADING extends STATUS_FLAGS
  
  @js.native
  sealed trait NONE extends STATUS_FLAGS
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[STATUS_FLAGS with Double] = js.native
  /* 2 */ @js.native
  object COMPLETE extends TopLevel[COMPLETE with Double]
  
  /* 1 */ @js.native
  object DATA_URL extends TopLevel[DATA_URL with Double]
  
  /* 3 */ @js.native
  object LOADING extends TopLevel[LOADING with Double]
  
  /* 0 */ @js.native
  object NONE extends TopLevel[NONE with Double]
  
}

