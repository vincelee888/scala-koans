# Scala Koans
Koans are small lessons on the path to enlightenment. The aim of the Scala Koans project is to provide an easy learning environment in Scala. Your insight will be derived by encountering failing tests and fixing them so that they pass. A testing framework is used to simplify this process and to get you off to a good start with using Scala.

This project is based on the many versions of ScalaKoans I have found. I wanted to bring this up to current (2.12.x) standards so others can benefit from this. I am no way affiliated with the original authors. Please see [ScalaKoans.org](https://www.scalakoans.org) for more info.

[![Scala Koans](https://github.com/bsamaripa/scala-koans/workflows/Scala%20Koans/badge.svg?branch=master)](https://github.com/bsamaripa/scala-koans/actions)

## Requirements
The [Java 8 JDK](https://www.oracle.com/technetwork/java/javase/downloads/index.html) and [sbt 1.x](https://www.scala-sbt.org/download.html) are required to build this project. Included is an `sbt` script that should run without installing sbt on your system.
The koans can be run using either the sbt shell or an IDE of your choice, though sbt is preferred because of its simpler setup.

## Usage
```
# (using sbt)
sbt namaste
# or
sbt "~testOnly org.scalakoans.Koans"

# run a single test suite
sbt "~testOnly org.scalakoans.<name of test suite>"
```

## Contributing
I would love to make this test suite more useful and welcome all Pull Requests.

### TODO
* [ ] New Scala Koans domain and site
* [ ] Improve logging
* [ ] Reconsider koan order
* [ ] Expand beyond original set of koans
* [ ] Suppress some warnings during compilation

## Original Versions
* https://bitbucket.org/dmarsh/scalakoansexercises/
* https://bitbucket.org/dickwall/scala-koans

## LICENSE

Scala Koans is licensed under Creative Commons [CC BY-NC-SA 3.0](http://creativecommons.org/licenses/by-nc-sa/3.0)
