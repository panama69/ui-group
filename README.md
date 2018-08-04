Example of using a Maven project with multiple modules.
The modules are using LeanFT and LeanFT's ApplicationModel.

In working and learning this, I discovered most of the items usually placed in the modual's pom.xml file can be placed in the project's pom.xml

Also, a dependency can be created so the project will always compile one module before another.

In this case, the audio-group and the tablets-group are dependent on the ui-model which will ensure the ui-model will be compiled before the others for execution.

To run/execute the project, you just need to perform the "AOS UI Tests" goal of "test"