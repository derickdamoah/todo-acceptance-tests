name := """todo-acceptance-tests"""
organization := "derickdamoah.com"

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayScala)

scalaVersion := "2.13.12"

libraryDependencies += guice
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "6.0.0-RC2" % Test
libraryDependencies += "io.cucumber" %% "cucumber-scala" % "8.17.0" % Test
libraryDependencies += "org.seleniumhq.selenium" % "selenium-java" % "4.13.0"
libraryDependencies += "org.seleniumhq.selenium" % "selenium-chrome-driver" % "4.13.0"
libraryDependencies += "com.novocode"  % "junit-interface" % "0.11" % Test
libraryDependencies += "io.cucumber" % "cucumber-junit" % "7.14.0" % Test
libraryDependencies += "com.novocode" % "junit-interface" % "0.11" % Test
//libraryDependencies += "uk.gov.hmrc" %% "webdriver-factory" % "0.41.0" % Test
//libraryDependencies += "uk.gov.hmrc" %% "tax-year" % "3.0.0" % Test
libraryDependencies += "org.mockito" % "mockito-core" % "5.2.0" % Test
libraryDependencies += "org.scalatestplus.play" %% "scalatestplus-play" % "5.1.0" % Test
// Adds additional packages into Twirl
//TwirlKeys.templateImports += "derickdamoah.com.controllers._"
// Adds additional packages into conf/routes
// play.sbt.routes.RoutesKeys.routesImport += "derickdamoah.com.binders._"