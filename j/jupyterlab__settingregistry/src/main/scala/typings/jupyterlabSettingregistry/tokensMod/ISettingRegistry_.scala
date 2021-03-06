package typings.jupyterlabSettingregistry.tokensMod

import org.scalablytyped.runtime.StringDictionary
import typings.jupyterlabSettingregistry.AnonComposite
import typings.jupyterlabSettingregistry.phaseinPhaseTransform
import typings.jupyterlabSettingregistry.settingregistryMod.ISchemaValidator
import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry.IPlugin
import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry.ISchema
import typings.jupyterlabSettingregistry.tokensMod.ISettingRegistry.ISettings
import typings.jupyterlabStatedb.interfacesMod.IDataConnector
import typings.luminoCoreutils.jsonMod.PartialJSONValue
import typings.luminoDisposable.mod.IDisposable
import typings.luminoSignaling.mod.ISignal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISettingRegistry_ extends js.Object {
  /**
    * The data connector used by the setting registry.
    */
  val connector: IDataConnector[IPlugin, String, String, String]
  /**
    * A signal that emits the name of a plugin when its settings change.
    */
  val pluginChanged: ISignal[this.type, String]
  /**
    * The collection of setting registry plugins.
    */
  val plugins: StringDictionary[js.UndefOr[IPlugin]]
  /**
    * The schema of the setting registry.
    */
  val schema: ISchema
  /**
    * The schema validator used by the setting registry.
    */
  val validator: ISchemaValidator
  /**
    * Get an individual setting.
    *
    * @param plugin - The name of the plugin whose settings are being retrieved.
    *
    * @param key - The name of the setting being retrieved.
    *
    * @returns A promise that resolves when the setting is retrieved.
    */
  def get(plugin: String, key: String): js.Promise[AnonComposite]
  /**
    * Load a plugin's settings into the setting registry.
    *
    * @param plugin - The name of the plugin whose settings are being loaded.
    *
    * @returns A promise that resolves with a plugin settings object or rejects
    * if the plugin is not found.
    */
  def load(plugin: String): js.Promise[ISettings]
  /**
    * Reload a plugin's settings into the registry even if they already exist.
    *
    * @param plugin - The name of the plugin whose settings are being reloaded.
    *
    * @returns A promise that resolves with a plugin settings object or rejects
    * with a list of `ISchemaValidator.IError` objects if it fails.
    */
  def reload(plugin: String): js.Promise[ISettings]
  /**
    * Remove a single setting in the registry.
    *
    * @param plugin - The name of the plugin whose setting is being removed.
    *
    * @param key - The name of the setting being removed.
    *
    * @returns A promise that resolves when the setting is removed.
    */
  def remove(plugin: String, key: String): js.Promise[Unit]
  /**
    * Set a single setting in the registry.
    *
    * @param plugin - The name of the plugin whose setting is being set.
    *
    * @param key - The name of the setting being set.
    *
    * @param value - The value of the setting being set.
    *
    * @returns A promise that resolves when the setting has been saved.
    *
    */
  def set(plugin: String, key: String, value: PartialJSONValue): js.Promise[Unit]
  /**
    * Register a plugin transform function to act on a specific plugin.
    *
    * @param plugin - The name of the plugin whose settings are transformed.
    *
    * @param transforms - The transform functions applied to the plugin.
    *
    * @returns A disposable that removes the transforms from the registry.
    *
    * #### Notes
    * - `compose` transformations: The registry automatically overwrites a
    * plugin's default values with user overrides, but a plugin may instead wish
    * to merge values. This behavior can be accomplished in a `compose`
    * transformation.
    * - `fetch` transformations: The registry uses the plugin data that is
    * fetched from its connector. If a plugin wants to override, e.g. to update
    * its schema with dynamic defaults, a `fetch` transformation can be applied.
    */
  def transform(plugin: String, transforms: phaseinPhaseTransform): IDisposable
  /**
    * Upload a plugin's settings.
    *
    * @param plugin - The name of the plugin whose settings are being set.
    *
    * @param raw - The raw plugin settings being uploaded.
    *
    * @returns A promise that resolves when the settings have been saved.
    */
  def upload(plugin: String, raw: String): js.Promise[Unit]
}

object ISettingRegistry_ {
  @scala.inline
  def apply(
    connector: IDataConnector[IPlugin, String, String, String],
    get: (String, String) => js.Promise[AnonComposite],
    load: String => js.Promise[ISettings],
    pluginChanged: ISignal[ISettingRegistry_, String],
    plugins: StringDictionary[js.UndefOr[IPlugin]],
    reload: String => js.Promise[ISettings],
    remove: (String, String) => js.Promise[Unit],
    schema: ISchema,
    set: (String, String, PartialJSONValue) => js.Promise[Unit],
    transform: (String, phaseinPhaseTransform) => IDisposable,
    upload: (String, String) => js.Promise[Unit],
    validator: ISchemaValidator
  ): ISettingRegistry_ = {
    val __obj = js.Dynamic.literal(connector = connector.asInstanceOf[js.Any], get = js.Any.fromFunction2(get), load = js.Any.fromFunction1(load), pluginChanged = pluginChanged.asInstanceOf[js.Any], plugins = plugins.asInstanceOf[js.Any], reload = js.Any.fromFunction1(reload), remove = js.Any.fromFunction2(remove), schema = schema.asInstanceOf[js.Any], set = js.Any.fromFunction3(set), transform = js.Any.fromFunction2(transform), upload = js.Any.fromFunction2(upload), validator = validator.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ISettingRegistry_]
  }
}

