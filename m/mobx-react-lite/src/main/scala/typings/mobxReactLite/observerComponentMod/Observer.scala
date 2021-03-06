package typings.mobxReactLite.observerComponentMod

import org.scalablytyped.runtime.StringDictionary
import typings.react.mod.ReactElement
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mobx-react-lite/dist/ObserverComponent", "Observer")
@js.native
object Observer extends js.Object {
  var displayName: String = js.native
  def apply(hasChildrenRender: IObserverProps): ReactElement | Null = js.native
  @js.native
  object propTypes extends js.Object {
    var children: js.Function5[
        /* props */ StringDictionary[js.Any], 
        /* key */ String, 
        /* componentName */ String, 
        /* location */ js.Any, 
        /* propFullName */ String, 
        Error | Null
      ] = js.native
    var render: js.Function5[
        /* props */ StringDictionary[js.Any], 
        /* key */ String, 
        /* componentName */ String, 
        /* location */ js.Any, 
        /* propFullName */ String, 
        Error | Null
      ] = js.native
  }
  
}

