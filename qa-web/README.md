#QA WEB Module

## How to Run tests
Note. Make sure to user ./gradlew if gradle was not installed in your local environment

- Command to execute scenarios according to the tag put in the gradle.properties file
  ####- Make sure that tag to be executed is set on qa-web > gradle.properties > 'tags'
    ```
    ./gradlew runWeb
    ```


## Open Reports generated after execution

Navigate to:

reports > \qa-web\report\cucumber-html-report.html
