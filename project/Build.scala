import sbt._
import Keys._
import PlayProject._

object ApplicationBuild extends Build {

    val appName         = "play2airbrake"
    val appVersion      = "1.0-SNAPSHOT"

    val appDependencies = Seq(
      "eu.teamon" %% "play-airbrake" % "0.1.1"
    )

    val main = PlayProject(appName, appVersion, appDependencies, mainLang = JAVA).settings(
      resolvers += "scalajars.org repo" at "http://scalajars.org/repository"
    )

}
