package typings.winjs.WinJS.Utilities.Scheduler

import typings.winjs.WinJS.Promise
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("WinJS.Utilities.Scheduler.schedulePromiseNormal")
@js.native
object schedulePromiseNormal extends js.Object {
  /**
    * Schedules a job to complete the returned Promise at WinJS.Utilities.Scheduler.Priority.normal priority.
    * @param promiseValue The value returned by the completed Promise.
    * @param jobName A string that describes the job for diagnostic purposes.
    * @returns A Promise that completes within a job of normal priority.
    **/
  def apply[U](): Promise[U] = js.native
  def apply[U](promiseValue: U): Promise[U] = js.native
  def apply[U](promiseValue: U, jobName: String): Promise[U] = js.native
}

