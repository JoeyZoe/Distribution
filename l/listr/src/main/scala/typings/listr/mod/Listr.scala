package typings.listr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Listr[Ctx] extends js.Object {
  var tasks: js.Array[ListrTaskWrapper[Ctx]] = js.native
  def add(tasks: js.Array[ListrTask[Ctx]]): Unit = js.native
  def add(tasks: ListrTask[Ctx]): Unit = js.native
  def render(): Unit = js.native
  def run(): js.Promise[Ctx] = js.native
  def run(ctx: Ctx): js.Promise[Ctx] = js.native
  def setRenderer(value: ListrRendererValue[Ctx]): Unit = js.native
}

