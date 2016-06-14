name := """td-sample"""

version := "1.0"

scalaVersion := "2.11.8"

val resolvers = Seq(
  "Sonatype OSS Snapshots" at "https://oss.sonatype.org/content/repositories/snapshots"
)
// Change this to another test framework if you prefer
libraryDependencies ++= Seq(
  "org.scalikejdbc" %% "scalikejdbc"        % "2.4.+",
  "ch.qos.logback"  %  "logback-classic"    % "1.1.+",
  "com.treasuredata" % "td-jdbc" % "0.5.7"
)
