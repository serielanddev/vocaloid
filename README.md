### Gradle

Add the dependency below to your module's `build.gradle` file:

```gradle
dependencies {
    implementation "io.github.serielanddev:vocaloid:1.0.0"
}
```

## Usage

```kotlin
val vocaloid = Vocaloid.instance
vocaloid.init(Context, Audio, List<Audio>, Boolean, () -> Unit)
vocaloid.play()
vocaloid.pause()
vocaloid.stop()
vocaloid.observeVocaloidStatus(LifecycleOwner, Observer<VocaloidStatus>)
````