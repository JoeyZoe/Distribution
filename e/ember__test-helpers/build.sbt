organization := "org.scalablytyped"
name := "ember__test-helpers"
version := "0.7-dt-20200328Z-b31808"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "ember__application" % "3.0-dt-20200328Z-d89f8a",
  "org.scalablytyped" %%% "ember__component" % "3.0-dt-20200328Z-82fc93",
  "org.scalablytyped" %%% "ember__controller" % "3.0-dt-20200328Z-e4bb95",
  "org.scalablytyped" %%% "ember__engine" % "3.0-dt-20200328Z-2cdd8c",
  "org.scalablytyped" %%% "ember__error" % "3.0-dt-20200328Z-d80471",
  "org.scalablytyped" %%% "ember__object" % "3.1-dt-20200328Z-2bba69",
  "org.scalablytyped" %%% "ember__routing" % "3.0-dt-20200225Z-d33307",
  "org.scalablytyped" %%% "jquery" % "3.3-dt-20200326Z-2318d7",
  "org.scalablytyped" %%% "rsvp" % "4.0-dt-20200225Z-c58757",
  "org.scalablytyped" %%% "sizzle" % "2.3-dt-20181006Z-3d9ead",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
