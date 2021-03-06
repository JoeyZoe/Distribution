organization := "org.scalablytyped"
name := "rsocket-tcp-client"
version := "0.0-dt-20191126Z-1b1807"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "node" % "13.11-dt-20200402Z-9a87f0",
  "org.scalablytyped" %%% "rsocket-core" % "0.0-dt-20200218Z-7b3527",
  "org.scalablytyped" %%% "rsocket-flowable" % "0.0-dt-20200404Z-cbb347",
  "org.scalablytyped" %%% "rsocket-types" % "0.0-dt-20200225Z-e39633",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
