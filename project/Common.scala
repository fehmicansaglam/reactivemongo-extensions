import sbt._
import Keys._

object Common {
  lazy val prompt = { state: State =>
    val extracted = Project.extract(state)
    import extracted._

    (name in currentRef get structure.data).map { name =>
      "[" + Colors.blue(name) + "] $ "
    }.getOrElse("> ")
  }

  val reactiveMongoVersion = "0.10.5.akka23-SNAPSHOT"
  val playReactiveMongoVersion = "0.10.5.akka23-SNAPSHOT"
}
