package typings.extjs.Ext.util

import typings.extjs.Ext.Array
import typings.extjs.Ext.IBase
import typings.extjs.Ext.IClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IKeyNav extends IBase {
  /** [Config Option] (String) */
  var defaultEventAction: js.UndefOr[String] = js.undefined
  /** [Method] Destroy this KeyNav
  		* @param removeEl Boolean Pass true to remove the element associated with this KeyNav.
  		*/
  var destroy: js.UndefOr[js.Function1[/* removeEl */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Method] Disables this KeyNav  */
  var disable: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (Boolean) */
  var disabled: js.UndefOr[Boolean] = js.undefined
  /** [Method] Enables this KeyNav  */
  var enable: js.UndefOr[js.Function0[Unit]] = js.undefined
  /** [Config Option] (String) */
  var eventName: js.UndefOr[String] = js.undefined
  /** [Config Option] (Boolean) */
  var forceKeyDown: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Boolean) */
  var ignoreInputFields: js.UndefOr[Boolean] = js.undefined
  /** [Config Option] (Ext.util.KeyMap) */
  var keyMap: js.UndefOr[IKeyMap] = js.undefined
  /** [Config Option] (Function) */
  var processEvent: js.UndefOr[js.Any] = js.undefined
  /** [Config Option] (Object) */
  var processEventScope: js.UndefOr[js.Any] = js.undefined
  /** [Method] Convenience function for setting disabled enabled by boolean
  		* @param disabled Boolean
  		*/
  var setDisabled: js.UndefOr[js.Function1[/* disabled */ js.UndefOr[Boolean], Unit]] = js.undefined
  /** [Config Option] (Ext.Component/Ext.Element/HTMLElement/String) */
  var target: js.UndefOr[js.Any] = js.undefined
}

object IKeyNav {
  @scala.inline
  def apply(
    alias: Array = null,
    alternateClassName: js.Any = null,
    callOverridden: /* args */ js.UndefOr[js.Any] => _ = null,
    callParent: /* args */ js.UndefOr[js.Any] => _ = null,
    callSuper: /* args */ js.UndefOr[js.Any] => _ = null,
    config: js.Any = null,
    defaultEventAction: String = null,
    destroy: /* removeEl */ js.UndefOr[Boolean] => Unit = null,
    disable: () => Unit = null,
    disabled: js.UndefOr[Boolean] = js.undefined,
    enable: () => Unit = null,
    eventName: String = null,
    extend: String = null,
    forceKeyDown: js.UndefOr[Boolean] = js.undefined,
    getInitialConfig: /* name */ js.UndefOr[String] => _ = null,
    ignoreInputFields: js.UndefOr[Boolean] = js.undefined,
    inheritableStatics: js.Any = null,
    initConfig: /* config */ js.UndefOr[js.Any] => IKeyNav = null,
    keyMap: IKeyMap = null,
    mixins: js.Any = null,
    processEvent: js.Any = null,
    processEventScope: js.Any = null,
    requires: Array = null,
    self: IClass = null,
    setDisabled: /* disabled */ js.UndefOr[Boolean] => Unit = null,
    singleton: js.UndefOr[Boolean] = js.undefined,
    statics: js.Any = null,
    target: js.Any = null,
    uses: Array = null
  ): IKeyNav = {
    val __obj = js.Dynamic.literal()
    if (alias != null) __obj.updateDynamic("alias")(alias.asInstanceOf[js.Any])
    if (alternateClassName != null) __obj.updateDynamic("alternateClassName")(alternateClassName.asInstanceOf[js.Any])
    if (callOverridden != null) __obj.updateDynamic("callOverridden")(js.Any.fromFunction1(callOverridden))
    if (callParent != null) __obj.updateDynamic("callParent")(js.Any.fromFunction1(callParent))
    if (callSuper != null) __obj.updateDynamic("callSuper")(js.Any.fromFunction1(callSuper))
    if (config != null) __obj.updateDynamic("config")(config.asInstanceOf[js.Any])
    if (defaultEventAction != null) __obj.updateDynamic("defaultEventAction")(defaultEventAction.asInstanceOf[js.Any])
    if (destroy != null) __obj.updateDynamic("destroy")(js.Any.fromFunction1(destroy))
    if (disable != null) __obj.updateDynamic("disable")(js.Any.fromFunction0(disable))
    if (!js.isUndefined(disabled)) __obj.updateDynamic("disabled")(disabled.asInstanceOf[js.Any])
    if (enable != null) __obj.updateDynamic("enable")(js.Any.fromFunction0(enable))
    if (eventName != null) __obj.updateDynamic("eventName")(eventName.asInstanceOf[js.Any])
    if (extend != null) __obj.updateDynamic("extend")(extend.asInstanceOf[js.Any])
    if (!js.isUndefined(forceKeyDown)) __obj.updateDynamic("forceKeyDown")(forceKeyDown.asInstanceOf[js.Any])
    if (getInitialConfig != null) __obj.updateDynamic("getInitialConfig")(js.Any.fromFunction1(getInitialConfig))
    if (!js.isUndefined(ignoreInputFields)) __obj.updateDynamic("ignoreInputFields")(ignoreInputFields.asInstanceOf[js.Any])
    if (inheritableStatics != null) __obj.updateDynamic("inheritableStatics")(inheritableStatics.asInstanceOf[js.Any])
    if (initConfig != null) __obj.updateDynamic("initConfig")(js.Any.fromFunction1(initConfig))
    if (keyMap != null) __obj.updateDynamic("keyMap")(keyMap.asInstanceOf[js.Any])
    if (mixins != null) __obj.updateDynamic("mixins")(mixins.asInstanceOf[js.Any])
    if (processEvent != null) __obj.updateDynamic("processEvent")(processEvent.asInstanceOf[js.Any])
    if (processEventScope != null) __obj.updateDynamic("processEventScope")(processEventScope.asInstanceOf[js.Any])
    if (requires != null) __obj.updateDynamic("requires")(requires.asInstanceOf[js.Any])
    if (self != null) __obj.updateDynamic("self")(self.asInstanceOf[js.Any])
    if (setDisabled != null) __obj.updateDynamic("setDisabled")(js.Any.fromFunction1(setDisabled))
    if (!js.isUndefined(singleton)) __obj.updateDynamic("singleton")(singleton.asInstanceOf[js.Any])
    if (statics != null) __obj.updateDynamic("statics")(statics.asInstanceOf[js.Any])
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (uses != null) __obj.updateDynamic("uses")(uses.asInstanceOf[js.Any])
    __obj.asInstanceOf[IKeyNav]
  }
}

