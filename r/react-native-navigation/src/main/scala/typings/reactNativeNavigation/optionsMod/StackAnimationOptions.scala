package typings.reactNativeNavigation.optionsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait StackAnimationOptions extends js.Object {
  /**
    * Configure animations for the bottom tabs
    */
  var bottomTabs: js.UndefOr[ViewAnimationOptions] = js.undefined
  /**
    * Configure animations for the content (Screen)
    */
  var content: js.UndefOr[ViewAnimationOptions] = js.undefined
  /**
    * Animations to be applied on views in the appearing or disappearing screens
    */
  var elementTransitions: js.UndefOr[js.Array[ElementTransition]] = js.undefined
  /**
    * Enable or disable the animation
    * @default true
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
  /**
    * Animations to be applied on elements which are shared between the appearing and disappearing screens
    */
  var sharedElementTransitions: js.UndefOr[js.Array[SharedElementTransition]] = js.undefined
  /**
    * Configure animations for the top bar
    */
  var topBar: js.UndefOr[ViewAnimationOptions] = js.undefined
  /**
    * Wait for the View to render before start animation
    */
  var waitForRender: js.UndefOr[Boolean] = js.undefined
}

object StackAnimationOptions {
  @scala.inline
  def apply(
    bottomTabs: ViewAnimationOptions = null,
    content: ViewAnimationOptions = null,
    elementTransitions: js.Array[ElementTransition] = null,
    enabled: js.UndefOr[Boolean] = js.undefined,
    sharedElementTransitions: js.Array[SharedElementTransition] = null,
    topBar: ViewAnimationOptions = null,
    waitForRender: js.UndefOr[Boolean] = js.undefined
  ): StackAnimationOptions = {
    val __obj = js.Dynamic.literal()
    if (bottomTabs != null) __obj.updateDynamic("bottomTabs")(bottomTabs.asInstanceOf[js.Any])
    if (content != null) __obj.updateDynamic("content")(content.asInstanceOf[js.Any])
    if (elementTransitions != null) __obj.updateDynamic("elementTransitions")(elementTransitions.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    if (sharedElementTransitions != null) __obj.updateDynamic("sharedElementTransitions")(sharedElementTransitions.asInstanceOf[js.Any])
    if (topBar != null) __obj.updateDynamic("topBar")(topBar.asInstanceOf[js.Any])
    if (!js.isUndefined(waitForRender)) __obj.updateDynamic("waitForRender")(waitForRender.asInstanceOf[js.Any])
    __obj.asInstanceOf[StackAnimationOptions]
  }
}

