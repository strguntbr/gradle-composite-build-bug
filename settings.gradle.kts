rootProject.name = "reproducer-project"

includeBuild("library1") {
//    dependencySubstitution { substitute(module("foo:bar")).using(project(":")) }
}
