package typings.hystrixjs.mod

import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CommandBuilderA6[R, T, U, V, W, X, Y] extends js.Object {
  def build(): CommandA6[R, T, U, V, W, X, Y]
  def circuitBreakerErrorThresholdPercentage(value: Double): CommandBuilderA6[R, T, U, V, W, X, Y]
  def circuitBreakerForceClosed(value: Boolean): CommandBuilderA6[R, T, U, V, W, X, Y]
  def circuitBreakerForceOpened(value: Boolean): CommandBuilderA6[R, T, U, V, W, X, Y]
  def circuitBreakerRequestVolumeThreshold(value: Double): CommandBuilderA6[R, T, U, V, W, X, Y]
  def circuitBreakerSleepWindowInMilliseconds(value: Double): CommandBuilderA6[R, T, U, V, W, X, Y]
  def context(value: js.Any): CommandBuilderA6[R, T, U, V, W, X, Y]
  def errorHandler(value: js.Function1[/* error */ js.Any, Boolean]): CommandBuilderA6[R, T, U, V, W, X, Y]
  def fallbackTo(value: js.Function2[/* error */ Error, /* args */ js.Tuple6[T, U, V, W, X, Y], js.Thenable[R]]): CommandBuilderA6[R, T, U, V, W, X, Y]
  def percentileWindowLength(value: Double): CommandBuilderA6[R, T, U, V, W, X, Y]
  def percentileWindowNumberOfBuckets(value: Double): CommandBuilderA6[R, T, U, V, W, X, Y]
  def requestVolumeRejectionThreshold(value: Double): CommandBuilderA6[R, T, U, V, W, X, Y]
  def run(
    value: js.Function6[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, /* y */ Y, js.Thenable[R]]
  ): CommandBuilderA6[R, T, U, V, W, X, Y]
  def statisticalWindowLength(value: Double): CommandBuilderA6[R, T, U, V, W, X, Y]
  def statisticalWindowNumberOfBuckets(value: Double): CommandBuilderA6[R, T, U, V, W, X, Y]
  def timeout(value: Double): CommandBuilderA6[R, T, U, V, W, X, Y]
}

object CommandBuilderA6 {
  @scala.inline
  def apply[R, T, U, V, W, X, Y](
    build: () => CommandA6[R, T, U, V, W, X, Y],
    circuitBreakerErrorThresholdPercentage: Double => CommandBuilderA6[R, T, U, V, W, X, Y],
    circuitBreakerForceClosed: Boolean => CommandBuilderA6[R, T, U, V, W, X, Y],
    circuitBreakerForceOpened: Boolean => CommandBuilderA6[R, T, U, V, W, X, Y],
    circuitBreakerRequestVolumeThreshold: Double => CommandBuilderA6[R, T, U, V, W, X, Y],
    circuitBreakerSleepWindowInMilliseconds: Double => CommandBuilderA6[R, T, U, V, W, X, Y],
    context: js.Any => CommandBuilderA6[R, T, U, V, W, X, Y],
    errorHandler: js.Function1[/* error */ js.Any, Boolean] => CommandBuilderA6[R, T, U, V, W, X, Y],
    fallbackTo: js.Function2[/* error */ Error, /* args */ js.Tuple6[T, U, V, W, X, Y], js.Thenable[R]] => CommandBuilderA6[R, T, U, V, W, X, Y],
    percentileWindowLength: Double => CommandBuilderA6[R, T, U, V, W, X, Y],
    percentileWindowNumberOfBuckets: Double => CommandBuilderA6[R, T, U, V, W, X, Y],
    requestVolumeRejectionThreshold: Double => CommandBuilderA6[R, T, U, V, W, X, Y],
    run: js.Function6[/* t */ T, /* u */ U, /* v */ V, /* w */ W, /* x */ X, /* y */ Y, js.Thenable[R]] => CommandBuilderA6[R, T, U, V, W, X, Y],
    statisticalWindowLength: Double => CommandBuilderA6[R, T, U, V, W, X, Y],
    statisticalWindowNumberOfBuckets: Double => CommandBuilderA6[R, T, U, V, W, X, Y],
    timeout: Double => CommandBuilderA6[R, T, U, V, W, X, Y]
  ): CommandBuilderA6[R, T, U, V, W, X, Y] = {
    val __obj = js.Dynamic.literal(build = js.Any.fromFunction0(build), circuitBreakerErrorThresholdPercentage = js.Any.fromFunction1(circuitBreakerErrorThresholdPercentage), circuitBreakerForceClosed = js.Any.fromFunction1(circuitBreakerForceClosed), circuitBreakerForceOpened = js.Any.fromFunction1(circuitBreakerForceOpened), circuitBreakerRequestVolumeThreshold = js.Any.fromFunction1(circuitBreakerRequestVolumeThreshold), circuitBreakerSleepWindowInMilliseconds = js.Any.fromFunction1(circuitBreakerSleepWindowInMilliseconds), context = js.Any.fromFunction1(context), errorHandler = js.Any.fromFunction1(errorHandler), fallbackTo = js.Any.fromFunction1(fallbackTo), percentileWindowLength = js.Any.fromFunction1(percentileWindowLength), percentileWindowNumberOfBuckets = js.Any.fromFunction1(percentileWindowNumberOfBuckets), requestVolumeRejectionThreshold = js.Any.fromFunction1(requestVolumeRejectionThreshold), run = js.Any.fromFunction1(run), statisticalWindowLength = js.Any.fromFunction1(statisticalWindowLength), statisticalWindowNumberOfBuckets = js.Any.fromFunction1(statisticalWindowNumberOfBuckets), timeout = js.Any.fromFunction1(timeout))
  
    __obj.asInstanceOf[CommandBuilderA6[R, T, U, V, W, X, Y]]
  }
}

