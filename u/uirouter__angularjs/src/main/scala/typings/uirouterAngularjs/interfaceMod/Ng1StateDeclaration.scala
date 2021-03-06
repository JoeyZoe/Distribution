package typings.uirouterAngularjs.interfaceMod

import org.scalablytyped.runtime.StringDictionary
import typings.uirouterCore.commonCommonMod.IInjectable
import typings.uirouterCore.paramsInterfaceMod.ParamDeclaration
import typings.uirouterCore.resolveInterfaceMod.ResolvePolicy
import typings.uirouterCore.stateInterfaceMod.LazyLoadResult
import typings.uirouterCore.stateInterfaceMod.RedirectToResult
import typings.uirouterCore.stateInterfaceMod.ResolveTypes
import typings.uirouterCore.stateInterfaceMod.StateDeclaration
import typings.uirouterCore.stateObjectMod.StateObject
import typings.uirouterCore.transitionTransitionMod.Transition
import typings.uirouterCore.viewInterfaceMod.ViewContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Ng1StateDeclaration
  extends _Ng1StateDeclaration
     with Ng1ViewDeclaration {
  /**
    * A state hook invoked when a state is being entered.
    *
    * The hook can inject global services.
    * It can also inject `$transition$` or `$state$` (from the current transition).
    *
    * ### Example:
    * ```js
    * $stateProvider.state({
    *   name: 'mystate',
    *   onEnter: (MyService, $transition$, $state$) => {
    *     return MyService.doSomething($state$.name, $transition$.params());
    *   }
    * });
    * ```
    *
    * #### Example:`
    * ```js
    * $stateProvider.state({
    *   name: 'mystate',
    *   onEnter: [ 'MyService', '$transition$', '$state$', function (MyService, $transition$, $state$) {
    *     return MyService.doSomething($state$.name, $transition$.params());
    *   } ]
    * });
    * ```
    */
  @JSName("onEnter")
  var onEnter_Ng1StateDeclaration: js.UndefOr[Ng1StateTransitionHook | IInjectable] = js.undefined
  /**
    * A state hook invoked when a state is being exited.
    *
    * The hook can inject global services.
    * It can also inject `$transition$` or `$state$` (from the current transition).
    *
    * ### Example:
    * ```js
    * $stateProvider.state({
    *   name: 'mystate',
    *   onExit: (MyService, $transition$, $state$) => {
    *     return MyService.doSomething($state$.name, $transition$.params());
    *   }
    * });
    * ```
    *
    * #### Example:`
    * ```js
    * $stateProvider.state({
    *   name: 'mystate',
    *   onExit: [ 'MyService', '$transition$', '$state$', function (MyService, $transition$, $state$) {
    *     return MyService.doSomething($state$.name, $transition$.params());
    *   } ]
    * });
    * ```
    */
  @JSName("onExit")
  var onExit_Ng1StateDeclaration: js.UndefOr[Ng1StateTransitionHook | IInjectable] = js.undefined
  /**
    * A state hook invoked when a state is being retained.
    *
    * The hook can inject global services.
    * It can also inject `$transition$` or `$state$` (from the current transition).
    *
    * #### Example:
    * ```js
    * $stateProvider.state({
    *   name: 'mystate',
    *   onRetain: (MyService, $transition$, $state$) => {
    *     return MyService.doSomething($state$.name, $transition$.params());
    *   }
    * });
    * ```
    *
    * #### Example:`
    * ```js
    * $stateProvider.state({
    *   name: 'mystate',
    *   onRetain: [ 'MyService', '$transition$', '$state$', function (MyService, $transition$, $state$) {
    *     return MyService.doSomething($state$.name, $transition$.params());
    *   } ]
    * });
    * ```
    */
  @JSName("onRetain")
  var onRetain_Ng1StateDeclaration: js.UndefOr[Ng1StateTransitionHook | IInjectable] = js.undefined
  /**
    * An optional object which defines multiple named views.
    *
    * Each key is the name of a view, and each value is a [[Ng1ViewDeclaration]].
    * Unnamed views are internally renamed to `$default`.
    *
    * A view's name is used to match an active `<ui-view>` directive in the DOM.  When the state
    * is entered, the state's views are activated and matched with active `<ui-view>` directives:
    *
    * - The view's name is processed into a ui-view target:
    *   - ui-view address: an address to a ui-view
    *   - state anchor: the state to anchor the address to
    *
    *  Examples:
    *
    *  Targets three named ui-views in the parent state's template
    *
    * #### Example:
    * ```js
    * views: {
    *   header: {
    *     controller: "headerCtrl",
    *     templateUrl: "header.html"
    *   },
    *   body: {
    *     controller: "bodyCtrl",
    *     templateUrl: "body.html"
    *   },
    *   footer: "footerComponent"
    * }
    * ```
    *
    * #### Example:
    * ```js
    * // Targets named ui-view="header" in the template of the ancestor state 'top'
    * // and the named `ui-view="body" from the parent state's template.
    * views: {
    *   'header@top': {
    *     controller: "msgHeaderCtrl",
    *     templateUrl: "msgHeader.html"
    *   },
    *   'body': {
    *     controller: "messagesCtrl",
    *     templateUrl: "messages.html"
    *   }
    * }
    * ```
    *
    * ## View targeting details
    *
    * There are a few styles of view addressing/targeting.
    * The most common is a simple `ui-view` name
    *
    * #### Simple ui-view name
    *
    * Addresses without an `@` are anchored to the parent state.
    *
    * #### Example:
    * ```js
    * // target the `<div ui-view='foo'></div>` created in the parent state's view
    * views: {
    *   foo: {...}
    * }
    * ```
    *
    * #### View name anchored to a state
    *
    * You can anchor the `ui-view` name to a specific state by including an `@`
    *
    * #### Example:
    * targets the `<div ui-view='foo'></div>` which was created in a view owned by the state `bar.baz`
    * ```js
    * views: {
    *   'foo@bar.baz': {...}
    * }
    * ```
    *
    * #### Absolute addressing
    *
    * You can address a `ui-view` absolutely, using dotted notation, by prefixing the address with a `!`.
    * Dotted addresses traverse the hierarchy of `ui-view`s active in the DOM:
    *
    * #### Example:
    * absolutely targets the `<div ui-view='nested'></div>`
    * ... which was created in the unnamed/$default root `<ui-view></ui-view>`
    * ```js
    * views: {
    *   '!$default.nested': {...}
    * }
    * ```
    *
    * #### Relative addressing
    *
    * Absolute addressing is actually relative addressing, anchored to the unnamed root state (`""`).
    * You can also use relative addressing anchored to *any state*, in order to target a target deeply nested `ui-views`:
    * The `ui-view` is targeted relative to the anchored state by traversing the nested `ui-view` names.
    *
    * #### Example:
    * targets the `<div ui-view='bar'></div>`
    * ... which was created inside the
    * `<div ui-view='foo'></div>`
    * ... which was created inside the parent state's template.
    * ```js
    * views: {
    *   'foo.bar': {...}
    * }
    * ```
    *
    * #### Example:
    * targets the `<div ui-view='bar'></div>`
    * ... which was created in `<div ui-view='foo'></div>`
    * ... which was created in a template from the state `baz.qux`
    * ```js
    * views: {
    *   'foo.bar@baz.qux': {...}
    * }
    * ```
    *
    * #### Example:
    * a view can relatively target a named `ui-view` defined on an ancestor using `^` (meaning "parent")
    * ```js
    * views: {
    *   'foo@^': {...}, // foo@(parent state) (same as simply 'foo')
    *   'bar@^.^': {...}, // bar@(grandparent state)
    *   'baz@^.^.^': {...}, // baz@(great-grandparent state)
    * }
    * ```
    *
    * For additional in-depth details about how `ui-view` addressing works, see the internal api [[ViewService.match]].
    *
    * ---
    *
    * ## State template+controller and `views:` incompatiblity
    *
    * If a state has a `views` object, any state-level view properties ([[Ng1ViewDeclaration]]) are ignored.  Therefore,
    * if _any view_ for a state is declared in the `views` object, then _all of the state's views_ must be defined in
    * the `views` object.  The state declaration must not have any of the following fields:
    * - component
    * - bindings
    * - resolveAs
    * - template
    * - templateUrl
    * - templateProvider
    * - controller
    * - controllerAs
    * - controllerProvider
    */
  @JSName("views")
  var views_Ng1StateDeclaration: js.UndefOr[StringDictionary[String | Ng1ViewDeclaration]] = js.undefined
}

object Ng1StateDeclaration {
  @scala.inline
  def apply(
    $context: ViewContext = null,
    $name: String = null,
    $type: String = null,
    $uiViewContextAnchor: String = null,
    $uiViewName: String = null,
    DollarDollarstate: () => StateObject = null,
    `abstract`: js.UndefOr[Boolean] = js.undefined,
    bindings: StringDictionary[String] = null,
    component: String = null,
    componentProvider: IInjectable = null,
    controller: IInjectable | String = null,
    controllerAs: String = null,
    controllerProvider: IInjectable = null,
    data: js.Any = null,
    dynamic: js.UndefOr[Boolean] = js.undefined,
    lazyLoad: (/* transition */ Transition, /* state */ StateDeclaration) => js.Promise[LazyLoadResult] = null,
    name: String = null,
    onEnter: Ng1StateTransitionHook | IInjectable = null,
    onExit: Ng1StateTransitionHook | IInjectable = null,
    onRetain: Ng1StateTransitionHook | IInjectable = null,
    params: StringDictionary[ParamDeclaration | js.Any] = null,
    parent: String | StateDeclaration = null,
    redirectTo: RedirectToResult | (js.Function1[/* transition */ Transition, js.Promise[RedirectToResult] | RedirectToResult]) = null,
    reloadOnSearch: js.UndefOr[Boolean] = js.undefined,
    resolve: js.Array[ResolveTypes] | StringDictionary[IInjectable] = null,
    resolveAs: String = null,
    resolvePolicy: ResolvePolicy = null,
    template: js.Function | String = null,
    templateProvider: IInjectable = null,
    templateUrl: String | js.Function = null,
    url: String = null,
    views: StringDictionary[String | Ng1ViewDeclaration] = null
  ): Ng1StateDeclaration = {
    val __obj = js.Dynamic.literal()
    if ($context != null) __obj.updateDynamic("$context")($context.asInstanceOf[js.Any])
    if ($name != null) __obj.updateDynamic("$name")($name.asInstanceOf[js.Any])
    if ($type != null) __obj.updateDynamic("$type")($type.asInstanceOf[js.Any])
    if ($uiViewContextAnchor != null) __obj.updateDynamic("$uiViewContextAnchor")($uiViewContextAnchor.asInstanceOf[js.Any])
    if ($uiViewName != null) __obj.updateDynamic("$uiViewName")($uiViewName.asInstanceOf[js.Any])
    if (DollarDollarstate != null) __obj.updateDynamic("$$state")(js.Any.fromFunction0(DollarDollarstate))
    if (!js.isUndefined(`abstract`)) __obj.updateDynamic("abstract")(`abstract`.asInstanceOf[js.Any])
    if (bindings != null) __obj.updateDynamic("bindings")(bindings.asInstanceOf[js.Any])
    if (component != null) __obj.updateDynamic("component")(component.asInstanceOf[js.Any])
    if (componentProvider != null) __obj.updateDynamic("componentProvider")(componentProvider.asInstanceOf[js.Any])
    if (controller != null) __obj.updateDynamic("controller")(controller.asInstanceOf[js.Any])
    if (controllerAs != null) __obj.updateDynamic("controllerAs")(controllerAs.asInstanceOf[js.Any])
    if (controllerProvider != null) __obj.updateDynamic("controllerProvider")(controllerProvider.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (!js.isUndefined(dynamic)) __obj.updateDynamic("dynamic")(dynamic.asInstanceOf[js.Any])
    if (lazyLoad != null) __obj.updateDynamic("lazyLoad")(js.Any.fromFunction2(lazyLoad))
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (onEnter != null) __obj.updateDynamic("onEnter")(onEnter.asInstanceOf[js.Any])
    if (onExit != null) __obj.updateDynamic("onExit")(onExit.asInstanceOf[js.Any])
    if (onRetain != null) __obj.updateDynamic("onRetain")(onRetain.asInstanceOf[js.Any])
    if (params != null) __obj.updateDynamic("params")(params.asInstanceOf[js.Any])
    if (parent != null) __obj.updateDynamic("parent")(parent.asInstanceOf[js.Any])
    if (redirectTo != null) __obj.updateDynamic("redirectTo")(redirectTo.asInstanceOf[js.Any])
    if (!js.isUndefined(reloadOnSearch)) __obj.updateDynamic("reloadOnSearch")(reloadOnSearch.asInstanceOf[js.Any])
    if (resolve != null) __obj.updateDynamic("resolve")(resolve.asInstanceOf[js.Any])
    if (resolveAs != null) __obj.updateDynamic("resolveAs")(resolveAs.asInstanceOf[js.Any])
    if (resolvePolicy != null) __obj.updateDynamic("resolvePolicy")(resolvePolicy.asInstanceOf[js.Any])
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    if (templateProvider != null) __obj.updateDynamic("templateProvider")(templateProvider.asInstanceOf[js.Any])
    if (templateUrl != null) __obj.updateDynamic("templateUrl")(templateUrl.asInstanceOf[js.Any])
    if (url != null) __obj.updateDynamic("url")(url.asInstanceOf[js.Any])
    if (views != null) __obj.updateDynamic("views")(views.asInstanceOf[js.Any])
    __obj.asInstanceOf[Ng1StateDeclaration]
  }
}

