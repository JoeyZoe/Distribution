package typings.minappEnv.wx

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadTask extends js.Object {
  /** [DownloadTask.abort()](DownloadTask.abort.md)
    *
    * 中断下载任务
    *
    * 最低基础库： `1.4.0` */
  def abort(): Unit
  /** [DownloadTask.offHeadersReceived(function callback)](DownloadTask.offHeadersReceived.md)
    *
    * 取消监听 HTTP Response Header 事件
    *
    * 最低基础库： `2.1.0` */
  def offHeadersReceived(/** HTTP Response Header 事件的回调函数 */
  callback: DownloadTaskOffHeadersReceivedCallback): Unit
  /** [DownloadTask.offProgressUpdate(function callback)](DownloadTask.offProgressUpdate.md)
    *
    * 取消监听下载进度变化事件
    *
    * 最低基础库： `2.1.0` */
  def offProgressUpdate(/** 下载进度变化事件的回调函数 */
  callback: DownloadTaskOffProgressUpdateCallback): Unit
  /** [DownloadTask.onHeadersReceived(function callback)](DownloadTask.onHeadersReceived.md)
    *
    * 监听 HTTP Response Header 事件。会比请求完成事件更早
    *
    * 最低基础库： `2.1.0` */
  def onHeadersReceived(/** HTTP Response Header 事件的回调函数 */
  callback: DownloadTaskOnHeadersReceivedCallback): Unit
  /** [DownloadTask.onProgressUpdate(function callback)](DownloadTask.onProgressUpdate.md)
    *
    * 监听下载进度变化事件
    *
    * 最低基础库： `1.4.0` */
  def onProgressUpdate(/** 下载进度变化事件的回调函数 */
  callback: DownloadTaskOnProgressUpdateCallback): Unit
}

object DownloadTask {
  @scala.inline
  def apply(
    abort: () => Unit,
    offHeadersReceived: DownloadTaskOffHeadersReceivedCallback => Unit,
    offProgressUpdate: DownloadTaskOffProgressUpdateCallback => Unit,
    onHeadersReceived: DownloadTaskOnHeadersReceivedCallback => Unit,
    onProgressUpdate: DownloadTaskOnProgressUpdateCallback => Unit
  ): DownloadTask = {
    val __obj = js.Dynamic.literal(abort = js.Any.fromFunction0(abort), offHeadersReceived = js.Any.fromFunction1(offHeadersReceived), offProgressUpdate = js.Any.fromFunction1(offProgressUpdate), onHeadersReceived = js.Any.fromFunction1(onHeadersReceived), onProgressUpdate = js.Any.fromFunction1(onProgressUpdate))
  
    __obj.asInstanceOf[DownloadTask]
  }
}

