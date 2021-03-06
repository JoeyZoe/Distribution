organization := "org.scalablytyped"
name := "testing-library__vue"
version := "2.0-dt-20200401Z-7ad97f"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "pretty-format" % "25.2.6-f4d625",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "testing-library__dom" % "7.0-dt-20200401Z-354460",
  "org.scalablytyped" %%% "vue" % "2.6.11-d66de9",
  "org.scalablytyped" %%% "vue-router" % "3.1.6-ca943c",
  "org.scalablytyped" %%% "vuex" % "3.1.3-fc1b0e")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
