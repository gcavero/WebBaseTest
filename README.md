# QA Tools


## JAVA
Java required: 11

You can download it from [here](https://www.oracle.com/java/technologies/javase/jdk11-archive-downloads.html)
* It may be necessary to install Rosetta to continue with the Java 11 installation.

* Rosetta enables Intel-based features to run on Apple Silicon Macs.

To validate that you have java installed, open terminal and execute

```
java -version
```
## GRADLE 
Currently to run automation project is not need to install gradle v.7.4 or superior. You can use gradle-wrapper
Just add "./gradle" for any command

-E.g:
  ```
  ./gradlew runWeb
  ```

Note. Make sure to user ./gradlew if gradle was not installed on your local. Otherwise install gradle to use only gradle.


## Current Browsers supported:
###Chrome
This framework downloads the Chrome selenium webDriver automatically according to the version of chrome you have installed.
