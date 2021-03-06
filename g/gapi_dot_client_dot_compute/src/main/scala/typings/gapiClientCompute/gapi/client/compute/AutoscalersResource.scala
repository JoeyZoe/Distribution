package typings.gapiClientCompute.gapi.client.compute

import typings.gapiClient.gapi.client.Request_
import typings.gapiClientCompute.AnonAlt
import typings.gapiClientCompute.AnonAutoscaler
import typings.gapiClientCompute.AnonFields
import typings.gapiClientCompute.AnonProject
import typings.gapiClientCompute.AnonQuotaUser
import typings.gapiClientCompute.AnonRequestId
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AutoscalersResource extends js.Object {
  /** Retrieves an aggregated list of autoscalers. */
  def aggregatedList(request: AnonAlt): Request_[AutoscalerAggregatedList]
  /** Deletes the specified autoscaler. */
  def delete(request: AnonAutoscaler): Request_[Operation]
  /** Returns the specified autoscaler resource. Get a list of available autoscalers by making a list() request. */
  def get(request: AnonProject): Request_[Autoscaler]
  /** Creates an autoscaler in the specified project using the data included in the request. */
  def insert(request: AnonQuotaUser): Request_[Operation]
  /** Retrieves a list of autoscalers contained within the specified zone. */
  def list(request: AnonFields): Request_[AutoscalerList]
  /**
    * Updates an autoscaler in the specified project using the data included in the request. This method supports PATCH semantics and uses the JSON merge
    * patch format and processing rules.
    */
  def patch(request: AnonRequestId): Request_[Operation]
  /** Updates an autoscaler in the specified project using the data included in the request. */
  def update(request: AnonRequestId): Request_[Operation]
}

object AutoscalersResource {
  @scala.inline
  def apply(
    aggregatedList: AnonAlt => Request_[AutoscalerAggregatedList],
    delete: AnonAutoscaler => Request_[Operation],
    get: AnonProject => Request_[Autoscaler],
    insert: AnonQuotaUser => Request_[Operation],
    list: AnonFields => Request_[AutoscalerList],
    patch: AnonRequestId => Request_[Operation],
    update: AnonRequestId => Request_[Operation]
  ): AutoscalersResource = {
    val __obj = js.Dynamic.literal(aggregatedList = js.Any.fromFunction1(aggregatedList), delete = js.Any.fromFunction1(delete), get = js.Any.fromFunction1(get), insert = js.Any.fromFunction1(insert), list = js.Any.fromFunction1(list), patch = js.Any.fromFunction1(patch), update = js.Any.fromFunction1(update))
  
    __obj.asInstanceOf[AutoscalersResource]
  }
}

