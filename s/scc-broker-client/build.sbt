organization := "org.scalablytyped"
name := "scc-broker-client"
version := "7.0-dt-20200205Z-a7368a"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ag-channel" % "4.0-dt-20200205Z-60de29",
  "org.scalablytyped" %%% "async-stream-emitter" % "3.0-dt-20200205Z-b339e3",
  "org.scalablytyped" %%% "consumable-stream" % "1.0-dt-20200205Z-d59548",
  "org.scalablytyped" %%% "expirymanager" % "0.9-dt-20181130Z-5ff1b8",
  "org.scalablytyped" %%% "fleximap" % "0.9-dt-20181205Z-b5ca0a",
  "org.scalablytyped" %%% "jsonwebtoken" % "8.3-dt-20200407Z-199d48",
  "org.scalablytyped" %%% "ncom" % "1.0-dt-20200205Z-894e2a",
  "org.scalablytyped" %%% "node" % "13.11-dt-20200402Z-9a87f0",
  "org.scalablytyped" %%% "sc-auth" % "5.0-dt-20200407Z-444795",
  "org.scalablytyped" %%% "sc-broker" % "8.0-dt-20200205Z-6a2d8e",
  "org.scalablytyped" %%% "sc-errors" % "1.4-dt-20200205Z-9fe276",
  "org.scalablytyped" %%% "socketcluster-client" % "15.1-dt-20200330Z-a855d3",
  "org.scalablytyped" %%% "socketcluster-server" % "15.0-dt-20200214Z-17831a",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "stream-demux" % "7.0-dt-20200205Z-5bc9c9",
  "org.scalablytyped" %%% "writable-consumable-stream" % "1.1-dt-20200205Z-b35dee",
  "org.scalablytyped" %%% "ws" % "7.2-dt-20200318Z-b44f72")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
