logLevel := Level.Warn

// resolvers += Resolver.sonatypeRepo("snapshots")

addSbtPlugin("com.jsuereth" % "sbt-pgp" % "1.1.0")

addSbtPlugin("org.scala-js" % "sbt-scalajs" % "0.6.32")

addSbtPlugin("com.github.karasiq" % "sbt-scalajs-bundler" % "1.2.2")

addSbtPlugin("ch.epfl.scala" % "sbt-scalajs-bundler" % "0.12.0")

addSbtPlugin("com.typesafe.sbt" % "sbt-git" % "0.9.3")

addSbtPlugin("com.github.gseitz" % "sbt-release" % "1.0.8")

addSbtPlugin("org.portable-scala" % "sbt-scalajs-crossproject"      % "0.6.1")

libraryDependencies += "com.lihaoyi" %% "scalatags" % "0.6.2"
