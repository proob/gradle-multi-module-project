# Sample multi module Gradle project

****  
The purpose of this project is to use Gradle as build tool and to show some of its features like:
 * multi module project configuration
 * using some modules in others
 * creating custom tasks and task dependencies
 * adding and using plugins
 * dividing the build script into separate files

Project comes with embedded Gradle Wrapper, so use the `gradlew` command instead of `gradle` (if it is installed on the system).
 
---
Run `gradlew -q projects` to see the project and subprojects structure.

The `server-module` was created as new module using [Spring Initializr](https://start.spring.io/) generator bounded to the IDE.  
Later to make it's configuration clear and files clear, the `settings.gradle` wrapper and `.gradle` directories were removed  
from the project and few of the build script instructions were deleted to remove the boiler plate code.

The `library-module`, `data-model`, `shared` and it's submodules are having empty `build.gradle` files, because they 
take advantage of being already by root project build script.  

****  
This project was made in purpose of showing working examples of Gradle features described in this article:  
[TODO::link article when it's published](http://todo.todo.todo)  

<br /><br />
If you are having any idea or request to extend this project with other examples of using Gradle features, 
you are more than welcome to report an issue on this github repository.  

Packaging the modern javascript front-end code to the jar packaged web app will be covered in different project.

<br /><br /><br /><br />
<sub>//TODO::</sub>  
<sub>1. Add task to copy runnable `jar` files generated when building the project to the root project build directory.</sub>  
<sub>2. Show the `api` and `implementation` differences by extending `library-module`.</sub>  
<sub>3. Link the gradle repository with project covering packing front-end with java backend to single jar.</sub>  
