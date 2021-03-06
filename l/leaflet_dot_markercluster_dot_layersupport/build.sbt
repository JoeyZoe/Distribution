organization := "org.scalablytyped"
name := "leaflet_dot_markercluster_dot_layersupport"
version := "1.0-dt-20180214Z-b134cc"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "geojson" % "7946.0-dt-20190925Z-8ecd0a",
  "org.scalablytyped" %%% "leaflet" % "1.5-dt-20200320Z-6f500b",
  "org.scalablytyped" %%% "leaflet_dot_markercluster" % "1.4-dt-20191223Z-d23919",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
