package typings.rxjs.mod

import org.scalablytyped.runtime.Instantiable2
import typings.rxjs.actionMod.Action
import typings.rxjs.typesMod.SchedulerAction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("rxjs", "Scheduler")
@js.native
class Scheduler protected ()
  extends typings.rxjs.schedulerMod.Scheduler {
  def this(SchedulerAction: Instantiable2[
        /* scheduler */ typings.rxjs.schedulerMod.Scheduler, 
        /* work */ js.ThisFunction1[
          /* this */ SchedulerAction[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
          /* state */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
          Unit
        ], 
        Action[js.Object]
      ]) = this()
  def this(
    SchedulerAction: Instantiable2[
        /* scheduler */ typings.rxjs.schedulerMod.Scheduler, 
        /* work */ js.ThisFunction1[
          /* this */ SchedulerAction[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
          /* state */ js.UndefOr[/* import warning: RewrittenClass.unapply cls was tparam T */ js.Any], 
          Unit
        ], 
        Action[js.Object]
      ],
    now: js.Function0[Double]
  ) = this()
}

/* static members */
@JSImport("rxjs", "Scheduler")
@js.native
object Scheduler extends js.Object {
  /**
    * Note: the extra arrow function wrapper is to make testing by overriding
    * Date.now easier.
    * @nocollapse
    */
  def now(): Double = js.native
}

