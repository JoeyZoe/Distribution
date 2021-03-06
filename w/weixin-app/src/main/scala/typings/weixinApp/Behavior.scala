package typings.weixinApp

import typings.weixinApp.wx.ThisTypedComponentOptionsWithRecordProps
import typings.weixinApp.wx.UnboxBehaviorsData
import typings.weixinApp.wx.UnboxBehaviorsMethods
import typings.weixinApp.wx.UnboxBehaviorsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Behavior")
@js.native
object Behavior extends js.Object {
  /**
    * behaviors 是用于组件间代码共享的特性
    * 类似于一些编程语言中的“mixins”或“traits”
    * 每个 behavior 可以包含一组属性、数据、生命周期函数和方法
    * 组件引用它时，它的属性、数据和方法会被合并到组件中，生命周期函数也会在对应时机被调用
    * 每个组件可以引用多个 behavior
    * behavior 也可以引用其他 behavior
    */
  def apply[D, M, P, B /* <: js.Array[(typings.weixinApp.wx.Behavior[js.Object, js.Object, js.Object]) | String] */](): typings.weixinApp.wx.Behavior[
    D with UnboxBehaviorsData[B], 
    P with UnboxBehaviorsProps[B], 
    M with UnboxBehaviorsMethods[B]
  ] = js.native
  def apply[D, M, P, B /* <: js.Array[(typings.weixinApp.wx.Behavior[js.Object, js.Object, js.Object]) | String] */](
    options: ThisTypedComponentOptionsWithRecordProps[typings.weixinApp.wx.Component[D, P, B], D, M, P, B]
  ): typings.weixinApp.wx.Behavior[
    D with UnboxBehaviorsData[B], 
    P with UnboxBehaviorsProps[B], 
    M with UnboxBehaviorsMethods[B]
  ] = js.native
}

