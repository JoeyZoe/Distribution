package typings.staleLruCache.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CacheOptions[K, V] extends js.Object {
  var getSize: js.UndefOr[js.Function2[/* value */ V, /* key */ K, Double]] = js.undefined
  var maxAge: js.UndefOr[Double] = js.undefined
  var maxSize: js.UndefOr[Double] = js.undefined
  var revalidate: js.UndefOr[RevalidationCallback[K, V]] = js.undefined
  var staleWhileRevalidate: js.UndefOr[Double] = js.undefined
}

object CacheOptions {
  @scala.inline
  def apply[K, V](
    getSize: (/* value */ V, /* key */ K) => Double = null,
    maxAge: Int | Double = null,
    maxSize: Int | Double = null,
    revalidate: (K, /* callback */ OptionsCallback[K, V]) => Unit = null,
    staleWhileRevalidate: Int | Double = null
  ): CacheOptions[K, V] = {
    val __obj = js.Dynamic.literal()
    if (getSize != null) __obj.updateDynamic("getSize")(js.Any.fromFunction2(getSize))
    if (maxAge != null) __obj.updateDynamic("maxAge")(maxAge.asInstanceOf[js.Any])
    if (maxSize != null) __obj.updateDynamic("maxSize")(maxSize.asInstanceOf[js.Any])
    if (revalidate != null) __obj.updateDynamic("revalidate")(js.Any.fromFunction2(revalidate))
    if (staleWhileRevalidate != null) __obj.updateDynamic("staleWhileRevalidate")(staleWhileRevalidate.asInstanceOf[js.Any])
    __obj.asInstanceOf[CacheOptions[K, V]]
  }
}

