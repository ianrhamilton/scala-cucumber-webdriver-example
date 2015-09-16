name := "my_first_cucumber_test"

scalaVersion := "2.11.5"

libraryDependencies ++= Seq(
  "org.seleniumhq.selenium" % "selenium-java" % "2.46.0",
  "org.scalatest" % "scalatest_2.11" % "2.2.1",
  "org.pegdown" % "pegdown" % "1.4.2" % "test",
  "org.scala-lang" % "scala-library" % "2.11.2",
  "info.cukes" % "cucumber-scala_2.11" % "1.2.2",
  "info.cukes" % "cucumber-junit" % "1.2.2",
  "info.cukes" % "cucumber-picocontainer" % "1.2.2",
  "junit" % "junit" % "4.11" % "test",
  "com.novocode" % "junit-interface" % "0.10" % "test"
  )
