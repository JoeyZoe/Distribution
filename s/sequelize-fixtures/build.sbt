organization := "org.scalablytyped"
name := "sequelize-fixtures"
version := "0.6.0-dt-20200225Z-c297e7"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20200302Z-2fc7af",
  "org.scalablytyped" %%% "continuation-local-storage" % "3.2-dt-20200225Z-32db12",
  "org.scalablytyped" %%% "lodash" % "4.14-dt-20200331Z-8af6d1",
  "org.scalablytyped" %%% "node" % "13.11-dt-20200402Z-9a87f0",
  "org.scalablytyped" %%% "sequelize" % "4.28.0-dt-20200225Z-a394fd",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "validator" % "13.0-dt-20200407Z-bae728")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
