What is the archetype fp-jfx-archetype for?
* It is an archetype for the course **advanced programming** where students improve their Java programming skills.
* With the archetype you can generate a Maven project with the following properties, plugins, libraries and files:
	* Java 8
	* JavaFX-Plugin (providing goals like jfx:jar or jfx:run)
	* Checkstyle-Plugin using a project-specific checkstyle.xml
	* Encoding UTF-8
	* JUnit 4
	* .gitignore containing usful entries for Java/FX and Maven projects.
	* Generic startable JavaFX Application class
	* Generic test class.
---
Currently, the archetype is under development and not yet deployed to Maven Central.
---
Step 1: Clone the archetype project
```
git clone https://github.com/turncodr/fp-jfx-archetype.git
```

---
Step 2: Build the archetype
```
mvn clean install
```

---
Step 3: Create a new maven project using the archetype:
```
mvn archetype:generate -DarchetypeGroupId=rocks.turncodr -DarchetypeArtifactId=fp-jfx-archetype -DarchetypeVersion=0.0.1-SNAPSHOT
```