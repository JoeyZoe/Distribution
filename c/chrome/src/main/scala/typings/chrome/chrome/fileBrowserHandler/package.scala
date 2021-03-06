package typings.chrome.chrome

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object fileBrowserHandler {
  type FileBrowserHandlerExecuteEvent = typings.chrome.chrome.events.Event[
    js.Function2[
      /* id */ java.lang.String, 
      /* details */ typings.chrome.chrome.fileBrowserHandler.FileHandlerExecuteEventDetails, 
      scala.Unit
    ]
  ]
}
