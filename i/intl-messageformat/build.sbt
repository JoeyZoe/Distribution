organization := "org.scalablytyped"
name := "intl-messageformat"
version := "7.8.4-41569a"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "formatjs__intl-unified-numberformat" % "3.2.0-3a616d",
  "org.scalablytyped" %%% "formatjs__intl-utils" % "2.2.0-c390d6",
  "org.scalablytyped" %%% "intl-messageformat-parser" % "3.6.4-c9c832",
  "org.scalablytyped" %%% "std" % "3.8-a0108c")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
