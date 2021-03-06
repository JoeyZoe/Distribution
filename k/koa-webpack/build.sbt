organization := "org.scalablytyped"
name := "koa-webpack"
version := "5.0-dt-20180605Z-f151f1"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "accepts" % "1.3-dt-20180214Z-e5e455",
  "org.scalablytyped" %%% "anymatch" % "1.3-dt-20190212Z-d40bf1",
  "org.scalablytyped" %%% "body-parser" % "1.19-dt-20200210Z-777753",
  "org.scalablytyped" %%% "connect" % "v3.4.0-dt-20200226Z-26d1e9",
  "org.scalablytyped" %%% "content-disposition" % "0.5-dt-20200331Z-650a48",
  "org.scalablytyped" %%% "cookies" % "0.7-dt-20191002Z-344133",
  "org.scalablytyped" %%% "express" % "4.17-dt-20200331Z-79bd5c",
  "org.scalablytyped" %%% "express-serve-static-core" % "4.17-dt-20200323Z-88b703",
  "org.scalablytyped" %%% "keygrip" % "1.0-dt-20191226Z-c8bdc7",
  "org.scalablytyped" %%% "koa" % "2.11.0-dt-20200327Z-b10031",
  "org.scalablytyped" %%% "loglevel" % "1.6.7-88dd24",
  "org.scalablytyped" %%% "memory-fs" % "0.3.0-dt-20200225Z-b7c2a6",
  "org.scalablytyped" %%% "mime" % "2.0-dt-20191126Z-3b5426",
  "org.scalablytyped" %%% "node" % "13.11-dt-20200402Z-9a87f0",
  "org.scalablytyped" %%% "qs" % "6.9-dt-20200225Z-e66ac9",
  "org.scalablytyped" %%% "range-parser" % "1.2-dt-20181016Z-6ae0c0",
  "org.scalablytyped" %%% "serve-static" % "1.13-dt-20200227Z-e748ee",
  "org.scalablytyped" %%% "source-list-map" % "v0.1.6-dt-20200225Z-4dbc49",
  "org.scalablytyped" %%% "source-map" % "0.7.3-020e14",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "tapable" % "v1.0.0-dt-20200225Z-acd615",
  "org.scalablytyped" %%% "uglify-js" % "3.0-dt-20200331Z-e61abf",
  "org.scalablytyped" %%% "webpack" % "4.41-dt-20200331Z-f1543a",
  "org.scalablytyped" %%% "webpack-dev-middleware" % "3.7-dt-20200226Z-da5d53",
  "org.scalablytyped" %%% "webpack-hot-client" % "4.1-dt-20200225Z-c94570",
  "org.scalablytyped" %%% "webpack-sources" % "0.1-dt-20200323Z-7d5534",
  "org.scalablytyped" %%% "ws" % "7.2-dt-20200318Z-b44f72")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
