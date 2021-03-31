# Gradle for Android and Java Final Project

In this project, I created an app with multiple flavors that uses
multiple libraries and Google Cloud Endpoints. 

## App consists of four modules.
- A **Java library** that provides jokes, 
- a ***Google Cloud Endpoints (GCE)** project that serves those jokes, 
- an **Android Library** containing an activity for displaying jokes, 
- and an **Android app** that fetches jokes from the GCE module and passes them to the Android Library for display.

## Project' purpose

As Android projects grow in complexity, it becomes necessary to customize the
behavior of the Gradle build tool, allowing automation of repetitive tasks.
Particularly, factoring functionality into libraries and creating product
flavors allow for much bigger projects with minimal added complexity.

## What I Learned

I learned the role of Gradle in building Android Apps and how to use
**Gradle** to manage apps of increasing complexity. I learned to:

* Add **free and paid** flavors to an app, and set up my build to share code between them
* Factor reusable functionality into a **Java library**
* Factor reusable Android functionality into an **Android library**
* Configure a multi project build to compile my libraries and app
* Use the **Gradle App Engine** plugin to deploy a backend
* Configure an integration test suite that runs against the local App Engine development server

