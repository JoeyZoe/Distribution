package typings.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object tabsMod {
  type StateReducer = js.Function3[
    typings.baseui.baseuiStrings.change_, 
    /* nextState */ typings.baseui.tabsMod.State, 
    /* currentState */ typings.baseui.tabsMod.State, 
    typings.baseui.tabsMod.State
  ]
}
