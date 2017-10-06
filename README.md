# fp-javafx-archetype
A simple maven archetype for Java 8/Java FX (not yet deployed to Maven Central!)

With the archetype it is possible to generate a maven project including the following properties, plugins and files:
- Java 8
- JUnit 4
- JavaFX-Maven-plugin
- Checkstyle-Maven-Plugin with a custom checkstyle.xml
- UTF-8
- .gitignore

The generated project is executable using the command `mvn jfx:run`, since it contains a startable class.

If you want to test the archetype:
1. Clone the repository
2. Build the archtype using: mvn install
3. Create a new maven project using the archetype. E.g.:

`mvn archetype:generate -DarchetypeGroupId=rocks.turncodr -DarchetypeArtifactId=fp-jfx-archetype -DarchetypeVersion=0.0.1-SNAPSHOT`

(in the interactive mode, you'll have to enter the groupId, artifactId, package and version of your new project).

Current issues:
* The generated projects contain the folder `src/main/resources`, although the folder ist empty.
* The file `checkstyle.xml` has to be customized to the needs for the lecture.
* Find a nice domain for the groupId of the archetype before deployment to maven central.
