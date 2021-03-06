organization := "org.scalablytyped"
name := "protractor-browser-logs"
version := "1.0-dt-20200226Z-a6a755"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "blocking-proxy" % "1.0.1-b7d221",
  "org.scalablytyped" %%% "node" % "13.11-dt-20200402Z-9a87f0",
  "org.scalablytyped" %%% "protractor" % "5.4.3-001880",
  "org.scalablytyped" %%% "q" % "1.5-dt-20200225Z-aa5e08",
  "org.scalablytyped" %%% "selenium-webdriver" % "4.0-dt-20200302Z-146cad",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "webdriver-js-extender" % "2.1.0-f0c718")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
