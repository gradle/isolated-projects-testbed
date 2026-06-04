# Isolated Projects Benchmarks

Projects and scenarios for benchmarking Isolated Projects.

## Android Studio Sync

Various scenarios for Sync are located in [android-sync.scenarios](./android-sync.scenarios).

They require:

- [Gradle Profiler](https://github.com/gradle/gradle-profiler#installing) `v0.25.0` or later
- Java 21 toolchain

Run Sync benchmarks from the root of this repository, and not from the project directory.
You want the Gradle User Home directory used for benchmarks to be located outside of the project directory.
By default it is created relative to the current directory (where you run Gradle Profiler from).

```bash
gradle-profiler --benchmark \
  --scenario-file perf.scenarios \
  --project-dir android-100-kts \
  --studio-install-dir '/path/to/Applications/Android Studio.app' \
  --gradle-version 9.6.0-rc-1 \
  --csv-format long \
  perf_sync_st_scr_change_mode_pip
```

Pass `--build-ops-trace` if you want to capture build operations trace.

Use `--group resync_st_scr_change_warm` instead of a scenario name to run all scenarios in the group.
See available groups in the scenario file.

To run Sync benchmarks on projects with Groovy DSL, modify the scenario file by replacing
`settings.gradle.kts` with `settings.gradle` and `build.gradle.kts` with `build.gradle`.
