package typings.gapiClientClassroom.gapi.client

import typings.gapiClientClassroom.gapiClientClassroomStrings.v1
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("gapi.client.load")
@js.native
object load extends js.Object {
  /** Load Google Classroom API v1 */
  def apply(name: typings.gapiClientClassroom.gapiClientClassroomStrings.classroom, version: v1): js.Thenable[Unit] = js.native
  def apply(
    name: typings.gapiClientClassroom.gapiClientClassroomStrings.classroom,
    version: v1,
    callback: js.Function0[_]
  ): Unit = js.native
}

