package typings.googleapis.classroomV1Mod.classroomV1

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Student work for an assignment.
  */
@js.native
trait SchemaAssignmentSubmission extends js.Object {
  /**
    * Attachments added by the student. Drive files that correspond to
    * materials with a share mode of STUDENT_COPY may not exist yet if the
    * student has not accessed the assignment in Classroom.  Some attachment
    * metadata is only populated if the requesting user has permission to
    * access it. Identifier and alternate_link fields are always available, but
    * others (e.g. title) may not be.
    */
  var attachments: js.UndefOr[js.Array[SchemaAttachment]] = js.native
}

object SchemaAssignmentSubmission {
  @scala.inline
  def apply(attachments: js.Array[SchemaAttachment] = null): SchemaAssignmentSubmission = {
    val __obj = js.Dynamic.literal()
    if (attachments != null) __obj.updateDynamic("attachments")(attachments.asInstanceOf[js.Any])
    __obj.asInstanceOf[SchemaAssignmentSubmission]
  }
}

