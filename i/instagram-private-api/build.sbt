organization := "org.scalablytyped"
name := "instagram-private-api"
version := "1.39.2-945e80"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "bluebird" % "3.5-dt-20200302Z-2fc7af",
  "org.scalablytyped" %%% "caseless" % "0.12-dt-20190311Z-31fe0d",
  "org.scalablytyped" %%% "chance" % "1.0-dt-20200402Z-72e999",
  "org.scalablytyped" %%% "form-data" % "3.0.0-c2310a",
  "org.scalablytyped" %%% "lifeomic__attempt" % "3.0.0-c18770",
  "org.scalablytyped" %%% "luxon" % "1.22-dt-20200322Z-703c40",
  "org.scalablytyped" %%% "node" % "13.11-dt-20200402Z-9a87f0",
  "org.scalablytyped" %%% "request" % "2.48-dt-20191217Z-146f98",
  "org.scalablytyped" %%% "rxjs" % "6.5.5-f8c277",
  "org.scalablytyped" %%% "rxjs-compat" % "6.5.5-708450",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "tough-cookie" % "4.0-dt-20200331Z-3578e6",
  "org.scalablytyped" %%% "ts-custom-error" % "2.2.2-f3fc01",
  "org.scalablytyped" %%% "ts-xor" % "1.0.8-5d8dbb",
  "org.scalablytyped" %%% "utility-types" % "2.1.0-e51a28")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
