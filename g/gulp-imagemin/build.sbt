organization := "org.scalablytyped"
name := "gulp-imagemin"
version := "7.0-dt-20200228Z-112ffc"
scalaVersion := "2.13.1"
enablePlugins(ScalaJSPlugin)
libraryDependencies ++= Seq(
  "com.olvind" %%% "scalablytyped-runtime" % "2.1.0",
  "org.scalablytyped" %%% "imagemin" % "7.0-dt-20190909Z-cfbc70",
  "org.scalablytyped" %%% "imagemin-gifsicle" % "5.2-dt-20180825Z-412e3a",
  "org.scalablytyped" %%% "imagemin-mozjpeg" % "8.0-dt-20190924Z-dc7fa1",
  "org.scalablytyped" %%% "imagemin-optipng" % "5.2-dt-20180825Z-9f5cd1",
  "org.scalablytyped" %%% "imagemin-svgo" % "7.0-dt-20180825Z-740643",
  "org.scalablytyped" %%% "node" % "13.11-dt-20200402Z-9a87f0",
  "org.scalablytyped" %%% "std" % "3.8-a0108c",
  "org.scalablytyped" %%% "svgo" % "1.3-dt-20200331Z-7539dd")
publishArtifact in packageDoc := false
scalacOptions ++= List("-encoding", "utf-8", "-g:notailcalls", "-P:scalajs:sjsDefinedByDefault")
licenses += ("MIT", url("http://opensource.org/licenses/MIT"))
bintrayRepository := "ScalablyTyped"
resolvers += Resolver.bintrayRepo("oyvindberg", "ScalablyTyped")
