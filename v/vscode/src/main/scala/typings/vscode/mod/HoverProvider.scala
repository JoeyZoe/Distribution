package typings.vscode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HoverProvider extends js.Object {
  /**
  		 * Provide a hover for the given position and document. Multiple hovers at the same
  		 * position will be merged by the editor. A hover can have a range which defaults
  		 * to the word range at the position when omitted.
  		 *
  		 * @param document The document in which the command was invoked.
  		 * @param position The position at which the command was invoked.
  		 * @param token A cancellation token.
  		 * @return A hover or a thenable that resolves to such. The lack of a result can be
  		 * signaled by returning `undefined` or `null`.
  		 */
  def provideHover(document: TextDocument, position: Position, token: CancellationToken): ProviderResult[Hover]
}

object HoverProvider {
  @scala.inline
  def apply(provideHover: (TextDocument, Position, CancellationToken) => ProviderResult[Hover]): HoverProvider = {
    val __obj = js.Dynamic.literal(provideHover = js.Any.fromFunction3(provideHover))
  
    __obj.asInstanceOf[HoverProvider]
  }
}

