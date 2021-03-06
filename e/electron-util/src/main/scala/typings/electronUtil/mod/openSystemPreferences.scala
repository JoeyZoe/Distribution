package typings.electronUtil.mod

import typings.electronUtil.electronUtilStrings.Advanced
import typings.electronUtil.electronUtilStrings.Captioning
import typings.electronUtil.electronUtilStrings.Dictation
import typings.electronUtil.electronUtilStrings.FDE
import typings.electronUtil.electronUtilStrings.Firewall
import typings.electronUtil.electronUtilStrings.General
import typings.electronUtil.electronUtilStrings.Hearing
import typings.electronUtil.electronUtilStrings.Internet
import typings.electronUtil.electronUtilStrings.Keyboard
import typings.electronUtil.electronUtilStrings.Media_Descriptions
import typings.electronUtil.electronUtilStrings.Mouse
import typings.electronUtil.electronUtilStrings.Privacy
import typings.electronUtil.electronUtilStrings.Privacy_Accessibility
import typings.electronUtil.electronUtilStrings.Privacy_AllFiles
import typings.electronUtil.electronUtilStrings.Privacy_Assistice
import typings.electronUtil.electronUtilStrings.Privacy_Calendars
import typings.electronUtil.electronUtilStrings.Privacy_Contacts
import typings.electronUtil.electronUtilStrings.Privacy_DesktopFolder
import typings.electronUtil.electronUtilStrings.Privacy_Diagnostics
import typings.electronUtil.electronUtilStrings.Privacy_DocumentsFolder
import typings.electronUtil.electronUtilStrings.Privacy_DownloadsFolder
import typings.electronUtil.electronUtilStrings.Privacy_LocationServices
import typings.electronUtil.electronUtilStrings.Privacy_Microphone
import typings.electronUtil.electronUtilStrings.Privacy_Reminders
import typings.electronUtil.electronUtilStrings.Privacy_ScreenCapture
import typings.electronUtil.electronUtilStrings.Seeing_Display
import typings.electronUtil.electronUtilStrings.Seeing_VoiceOver
import typings.electronUtil.electronUtilStrings.Seeing_Zoom
import typings.electronUtil.electronUtilStrings.Services_ARDService
import typings.electronUtil.electronUtilStrings.Services_BluetoothSharing
import typings.electronUtil.electronUtilStrings.Services_PersonalFileSHaring
import typings.electronUtil.electronUtilStrings.Services_PrinterSharing
import typings.electronUtil.electronUtilStrings.Services_RemoteAppleEvent
import typings.electronUtil.electronUtilStrings.Services_RemoteLogin
import typings.electronUtil.electronUtilStrings.Services_ScreenSharing
import typings.electronUtil.electronUtilStrings.SpeakableItems
import typings.electronUtil.electronUtilStrings.Switch
import typings.electronUtil.electronUtilStrings.TTS
import typings.electronUtil.electronUtilStrings.security
import typings.electronUtil.electronUtilStrings.sharing
import typings.electronUtil.electronUtilStrings.speech
import typings.electronUtil.electronUtilStrings.universalaccess
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("electron-util", "openSystemPreferences")
@js.native
object openSystemPreferences extends js.Object {
  def apply(): js.Promise[Unit] = js.native
  def apply(
    pane: security,
    section: Advanced | FDE | Firewall | General | Privacy | Privacy_Accessibility | Privacy_Assistice | Privacy_Calendars | Privacy_Contacts | Privacy_Diagnostics | Privacy_LocationServices | Privacy_Microphone | Privacy_Reminders | Privacy_ScreenCapture | Privacy_DesktopFolder | Privacy_DocumentsFolder | Privacy_DownloadsFolder | Privacy_AllFiles
  ): js.Promise[Unit] = js.native
  def apply(pane: sharing, section: Internet): js.Promise[Unit] = js.native
  def apply(pane: sharing, section: Services_ARDService): js.Promise[Unit] = js.native
  def apply(pane: sharing, section: Services_BluetoothSharing): js.Promise[Unit] = js.native
  def apply(pane: sharing, section: Services_PersonalFileSHaring): js.Promise[Unit] = js.native
  def apply(pane: sharing, section: Services_PrinterSharing): js.Promise[Unit] = js.native
  def apply(pane: sharing, section: Services_RemoteAppleEvent): js.Promise[Unit] = js.native
  def apply(pane: sharing, section: Services_RemoteLogin): js.Promise[Unit] = js.native
  def apply(pane: sharing, section: Services_ScreenSharing): js.Promise[Unit] = js.native
  def apply(pane: speech, section: Dictation): js.Promise[Unit] = js.native
  def apply(pane: speech, section: TTS): js.Promise[Unit] = js.native
  def apply(
    pane: universalaccess,
    section: Captioning | Hearing | Keyboard | Media_Descriptions | Mouse | Seeing_Display | Seeing_VoiceOver | Seeing_Zoom | SpeakableItems | Switch
  ): js.Promise[Unit] = js.native
}

