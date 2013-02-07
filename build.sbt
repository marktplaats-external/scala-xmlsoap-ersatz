name := "xmlsoap-ersatz"

organization := "play2.tools.xml"

version := "0.1.MP2"

scalaVersion := "2.10.0"

libraryDependencies ++= Seq(
  "org.specs2" % "specs2_2.10" % "1.13" % "test",
  "junit" % "junit" % "4.8" % "test"  
)

publishTo := Some(Resolver.file("file",  new File(Path.userHome.absolutePath+"/.m2/repository")))

publishMavenStyle := true

publishArtifact in Test := false
