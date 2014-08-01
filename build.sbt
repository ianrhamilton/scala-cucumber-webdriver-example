name := "my_first_cucumber_test"

version := "1.0"

libraryDependencies ++= Seq(
  "org.scalatest" % "scalatest_2.11" % "2.2.0" % "test",
  "org.scala-lang" % "scala-library" % "2.11.1",
  "info.cukes" % "cucumber-scala_2.11" % "1.1.8",
  "info.cukes" % "cucumber-junit" % "1.1.8",
  "info.cukes" % "cucumber-picocontainer" % "1.1.8",
  "junit" % "junit" % "4.11" % "test",
  "com.novocode" % "junit-interface" % "0.10" % "test",
  "org.seleniumhq.selenium" % "selenium-java" % "2.42.2")

    