package typings.realm.Realm

import typings.realm.PartialSyncConfiguration
import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.Int8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * realm configuration
  * @see { @link https://realm.io/docs/javascript/latest/api/Realm.html#~Configuration }
  */
trait Configuration extends js.Object {
  var deleteRealmIfMigrationNeeded: js.UndefOr[Boolean] = js.undefined
  var disableFormatUpgrade: js.UndefOr[Boolean] = js.undefined
  var encryptionKey: js.UndefOr[ArrayBuffer | ArrayBufferView | Int8Array] = js.undefined
  var fifoFilesFallbackPath: js.UndefOr[String] = js.undefined
  var inMemory: js.UndefOr[Boolean] = js.undefined
  var migration: js.UndefOr[MigrationCallback] = js.undefined
  var path: js.UndefOr[String] = js.undefined
  var readOnly: js.UndefOr[Boolean] = js.undefined
  var schema: js.UndefOr[js.Array[ObjectClass | ObjectSchema]] = js.undefined
  var schemaVersion: js.UndefOr[Double] = js.undefined
  var shouldCompactOnLaunch: js.UndefOr[js.Function2[/* totalBytes */ Double, /* usedBytes */ Double, Boolean]] = js.undefined
  var sync: js.UndefOr[PartialSyncConfiguration] = js.undefined
}

object Configuration {
  @scala.inline
  def apply(
    deleteRealmIfMigrationNeeded: js.UndefOr[Boolean] = js.undefined,
    disableFormatUpgrade: js.UndefOr[Boolean] = js.undefined,
    encryptionKey: ArrayBuffer | ArrayBufferView | Int8Array = null,
    fifoFilesFallbackPath: String = null,
    inMemory: js.UndefOr[Boolean] = js.undefined,
    migration: (/* oldRealm */ typings.realm.Realm, /* newRealm */ typings.realm.Realm) => Unit = null,
    path: String = null,
    readOnly: js.UndefOr[Boolean] = js.undefined,
    schema: js.Array[ObjectClass | ObjectSchema] = null,
    schemaVersion: Int | Double = null,
    shouldCompactOnLaunch: (/* totalBytes */ Double, /* usedBytes */ Double) => Boolean = null,
    sync: PartialSyncConfiguration = null
  ): Configuration = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deleteRealmIfMigrationNeeded)) __obj.updateDynamic("deleteRealmIfMigrationNeeded")(deleteRealmIfMigrationNeeded.asInstanceOf[js.Any])
    if (!js.isUndefined(disableFormatUpgrade)) __obj.updateDynamic("disableFormatUpgrade")(disableFormatUpgrade.asInstanceOf[js.Any])
    if (encryptionKey != null) __obj.updateDynamic("encryptionKey")(encryptionKey.asInstanceOf[js.Any])
    if (fifoFilesFallbackPath != null) __obj.updateDynamic("fifoFilesFallbackPath")(fifoFilesFallbackPath.asInstanceOf[js.Any])
    if (!js.isUndefined(inMemory)) __obj.updateDynamic("inMemory")(inMemory.asInstanceOf[js.Any])
    if (migration != null) __obj.updateDynamic("migration")(js.Any.fromFunction2(migration))
    if (path != null) __obj.updateDynamic("path")(path.asInstanceOf[js.Any])
    if (!js.isUndefined(readOnly)) __obj.updateDynamic("readOnly")(readOnly.asInstanceOf[js.Any])
    if (schema != null) __obj.updateDynamic("schema")(schema.asInstanceOf[js.Any])
    if (schemaVersion != null) __obj.updateDynamic("schemaVersion")(schemaVersion.asInstanceOf[js.Any])
    if (shouldCompactOnLaunch != null) __obj.updateDynamic("shouldCompactOnLaunch")(js.Any.fromFunction2(shouldCompactOnLaunch))
    if (sync != null) __obj.updateDynamic("sync")(sync.asInstanceOf[js.Any])
    __obj.asInstanceOf[Configuration]
  }
}

