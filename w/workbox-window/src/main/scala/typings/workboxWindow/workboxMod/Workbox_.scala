package typings.workboxWindow.workboxMod

import typings.std.RegistrationOptions
import typings.std.ServiceWorker
import typings.std.ServiceWorkerRegistration
import typings.workboxWindow.eventTargetShimMod.EventTargetShim
import typings.workboxWindow.workboxEventMapMod.WorkboxExtendableEvent
import typings.workboxWindow.workboxEventMapMod.WorkboxMessageEvent
import typings.workboxWindow.workboxEventMapMod.WorkboxUpdatableEvent
import typings.workboxWindow.workboxEventMapMod.WorkboxWaitingEvent
import typings.workboxWindow.workboxEventMod.WorkboxEvent
import typings.workboxWindow.workboxMod.Workbox.RegisterOptions
import typings.workboxWindow.workboxWindowStrings.activated
import typings.workboxWindow.workboxWindowStrings.externalactivated
import typings.workboxWindow.workboxWindowStrings.externalinstalled
import typings.workboxWindow.workboxWindowStrings.externalwaiting
import typings.workboxWindow.workboxWindowStrings.installed
import typings.workboxWindow.workboxWindowStrings.message
import typings.workboxWindow.workboxWindowStrings.redundant
import typings.workboxWindow.workboxWindowStrings.waiting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("workbox-window/Workbox", "Workbox")
@js.native
class Workbox_ protected () extends EventTargetShim {
  def this(scriptURL: String) = this()
  def this(scriptURL: String, registerOptions: RegistrationOptions) = this()
  val active: js.Promise[ServiceWorker] = js.native
  val controlling: js.Promise[ServiceWorker] = js.native
  @JSName("addEventListener")
  def addEventListener_activated(
    `type`: activated,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WorkboxUpdatableEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_controlling(
    `type`: typings.workboxWindow.workboxWindowStrings.controlling,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WorkboxEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_externalactivated(
    `type`: externalactivated,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WorkboxExtendableEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_externalinstalled(
    `type`: externalinstalled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WorkboxExtendableEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_externalwaiting(
    `type`: externalwaiting,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WorkboxExtendableEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_installed(
    `type`: installed,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WorkboxUpdatableEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WorkboxMessageEvent, Unit]
  ): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_redundant(`type`: redundant, listener: js.ThisFunction1[/* this */ this.type, /* ev */ WorkboxEvent, Unit]): Unit = js.native
  @JSName("addEventListener")
  def addEventListener_waiting(
    `type`: waiting,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WorkboxWaitingEvent, Unit]
  ): Unit = js.native
  def getSW(): js.Promise[ServiceWorker] = js.native
  def messageSW(data: js.Any): js.Promise[_] = js.native
  def register(): js.Promise[ServiceWorkerRegistration] = js.native
  def register(options: RegisterOptions): js.Promise[ServiceWorkerRegistration] = js.native
  @JSName("removeEventListener")
  def removeEventListener_activated(
    `type`: activated,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WorkboxUpdatableEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_controlling(
    `type`: typings.workboxWindow.workboxWindowStrings.controlling,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WorkboxEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_externalactivated(
    `type`: externalactivated,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WorkboxExtendableEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_externalinstalled(
    `type`: externalinstalled,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WorkboxExtendableEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_externalwaiting(
    `type`: externalwaiting,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WorkboxExtendableEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_installed(
    `type`: installed,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WorkboxUpdatableEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_message(
    `type`: message,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WorkboxMessageEvent, Unit]
  ): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_redundant(`type`: redundant, listener: js.ThisFunction1[/* this */ this.type, /* ev */ WorkboxEvent, Unit]): Unit = js.native
  @JSName("removeEventListener")
  def removeEventListener_waiting(
    `type`: waiting,
    listener: js.ThisFunction1[/* this */ this.type, /* ev */ WorkboxWaitingEvent, Unit]
  ): Unit = js.native
}

