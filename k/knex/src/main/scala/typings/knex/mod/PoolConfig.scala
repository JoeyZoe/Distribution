package typings.knex.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PoolConfig extends js.Object {
  var Promise: js.UndefOr[js.Any] = js.undefined
  var acquireTimeoutMillis: js.UndefOr[Double] = js.undefined
  var afterCreate: js.UndefOr[js.Function] = js.undefined
  var autostart: js.UndefOr[Boolean] = js.undefined
  var evictionRunIntervalMillis: js.UndefOr[Double] = js.undefined
  var fifo: js.UndefOr[Boolean] = js.undefined
  var idleTimeoutMillis: js.UndefOr[Double] = js.undefined
  var log: js.UndefOr[js.Function2[/* message */ String, /* logLevel */ String, Unit]] = js.undefined
  var max: js.UndefOr[Double] = js.undefined
  // generic-pool v3 configs
  var maxWaitingClients: js.UndefOr[Double] = js.undefined
  var min: js.UndefOr[Double] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var numTestsPerRun: js.UndefOr[Double] = js.undefined
  var priorityRange: js.UndefOr[Double] = js.undefined
  var reapIntervalMillis: js.UndefOr[Double] = js.undefined
  var refreshIdle: js.UndefOr[Boolean] = js.undefined
  var returnToHead: js.UndefOr[Boolean] = js.undefined
  var softIdleTimeoutMillis: js.UndefOr[Double] = js.undefined
  var testOnBorrow: js.UndefOr[Boolean] = js.undefined
}

object PoolConfig {
  @scala.inline
  def apply(
    Promise: js.Any = null,
    acquireTimeoutMillis: Int | Double = null,
    afterCreate: js.Function = null,
    autostart: js.UndefOr[Boolean] = js.undefined,
    evictionRunIntervalMillis: Int | Double = null,
    fifo: js.UndefOr[Boolean] = js.undefined,
    idleTimeoutMillis: Int | Double = null,
    log: (/* message */ String, /* logLevel */ String) => Unit = null,
    max: Int | Double = null,
    maxWaitingClients: Int | Double = null,
    min: Int | Double = null,
    name: String = null,
    numTestsPerRun: Int | Double = null,
    priorityRange: Int | Double = null,
    reapIntervalMillis: Int | Double = null,
    refreshIdle: js.UndefOr[Boolean] = js.undefined,
    returnToHead: js.UndefOr[Boolean] = js.undefined,
    softIdleTimeoutMillis: Int | Double = null,
    testOnBorrow: js.UndefOr[Boolean] = js.undefined
  ): PoolConfig = {
    val __obj = js.Dynamic.literal()
    if (Promise != null) __obj.updateDynamic("Promise")(Promise.asInstanceOf[js.Any])
    if (acquireTimeoutMillis != null) __obj.updateDynamic("acquireTimeoutMillis")(acquireTimeoutMillis.asInstanceOf[js.Any])
    if (afterCreate != null) __obj.updateDynamic("afterCreate")(afterCreate.asInstanceOf[js.Any])
    if (!js.isUndefined(autostart)) __obj.updateDynamic("autostart")(autostart.asInstanceOf[js.Any])
    if (evictionRunIntervalMillis != null) __obj.updateDynamic("evictionRunIntervalMillis")(evictionRunIntervalMillis.asInstanceOf[js.Any])
    if (!js.isUndefined(fifo)) __obj.updateDynamic("fifo")(fifo.asInstanceOf[js.Any])
    if (idleTimeoutMillis != null) __obj.updateDynamic("idleTimeoutMillis")(idleTimeoutMillis.asInstanceOf[js.Any])
    if (log != null) __obj.updateDynamic("log")(js.Any.fromFunction2(log))
    if (max != null) __obj.updateDynamic("max")(max.asInstanceOf[js.Any])
    if (maxWaitingClients != null) __obj.updateDynamic("maxWaitingClients")(maxWaitingClients.asInstanceOf[js.Any])
    if (min != null) __obj.updateDynamic("min")(min.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (numTestsPerRun != null) __obj.updateDynamic("numTestsPerRun")(numTestsPerRun.asInstanceOf[js.Any])
    if (priorityRange != null) __obj.updateDynamic("priorityRange")(priorityRange.asInstanceOf[js.Any])
    if (reapIntervalMillis != null) __obj.updateDynamic("reapIntervalMillis")(reapIntervalMillis.asInstanceOf[js.Any])
    if (!js.isUndefined(refreshIdle)) __obj.updateDynamic("refreshIdle")(refreshIdle.asInstanceOf[js.Any])
    if (!js.isUndefined(returnToHead)) __obj.updateDynamic("returnToHead")(returnToHead.asInstanceOf[js.Any])
    if (softIdleTimeoutMillis != null) __obj.updateDynamic("softIdleTimeoutMillis")(softIdleTimeoutMillis.asInstanceOf[js.Any])
    if (!js.isUndefined(testOnBorrow)) __obj.updateDynamic("testOnBorrow")(testOnBorrow.asInstanceOf[js.Any])
    __obj.asInstanceOf[PoolConfig]
  }
}

