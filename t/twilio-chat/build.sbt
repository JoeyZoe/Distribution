organization := "org.scalablytyped"
name := "twilio-chat"
version := "3.3.4-20d6d0"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "loglevel" % "1.6.7-88dd24",
  "org.scalablytyped" %%% "node" % "13.11-dt-20200402Z-9a87f0",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "twilio-mcs-client" % "0.3.3-179590",
  "org.scalablytyped" %%% "twilio-notifications" % "0.5.8-47c893",
  "org.scalablytyped" %%% "twilio-sync" % "0.11.5-8e85d2",
  "org.scalablytyped" %%% "twilsock" % "0.5.11-bc9b04")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
