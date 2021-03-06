package typings.grpcGrpcJs

import typings.grpcGrpcJs.loadBalancerMod.ChannelControlHelper
import typings.grpcGrpcJs.loadBalancerMod.LoadBalancer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@grpc/grpc-js/build/src/load-balancer-round-robin", JSImport.Namespace)
@js.native
object loadBalancerRoundRobinMod extends js.Object {
  @js.native
  class RoundRobinLoadBalancer protected () extends LoadBalancer {
    def this(channelControlHelper: ChannelControlHelper) = this()
    var calculateAndUpdateState: js.Any = js.native
    var channelControlHelper: js.Any = js.native
    var currentReadyPicker: js.Any = js.native
    var currentState: js.Any = js.native
    var resetSubchannelList: js.Any = js.native
    var subchannelStateCounts: js.Any = js.native
    var subchannelStateListener: js.Any = js.native
    var subchannels: js.Any = js.native
    var updateState: js.Any = js.native
  }
  
  def setup(): Unit = js.native
}

