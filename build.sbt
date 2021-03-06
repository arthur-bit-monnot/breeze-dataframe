name := "breeze-dataframe"

version := "0.1-SNAPSHOT"

scalaVersion := "2.12.3"



libraryDependencies ++= Seq(
  "org.scalanlp" %% "breeze" % "0.13.2",
  "com.chuusai" %% "shapeless" % "2.3.2",
  "com.lihaoyi" %% "utest" % "0.5.4" % "test"
)

testFrameworks += new TestFramework("utest.runner.Framework")
