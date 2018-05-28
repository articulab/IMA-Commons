# IMA-Commons

* **Since:** 2018-05-08
* **Licensing:** Copyright (C) Carnegie Mellon University. Licensed for distribution under the Apache License 2.0: See the files `NOTICE` and `LICENSE`.

Constants and logic common to all components of [InMind's Rapport-Building Personal Assistant on Mobile Devices](http://articulab.hcii.cs.cmu.edu/projects/yahoo/), also known as the InMind Movie Agent (IMA). The agent itself is nicknamed "Sara"; note that this is *not* the same as the [Socially Aware Robot Assistant (SARA)](http://articulab.hcii.cs.cmu.edu/projects/sara/).

## Gradle artifact

To use this code as a Gradle dependency in your code, add the following to your project's `build.gradle`:

	repositories {
		maven { url "https://jitpack.io" }
	}
	dependencies {
		implementation group:'com.github.articulab', name:'IMA-Commons', version:'master-SNAPSHOT'
	}
