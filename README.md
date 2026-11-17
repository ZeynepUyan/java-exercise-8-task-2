# Exercise 8 — Packages and Interfaces

Task 2 extends the existing multi-level `Animal` hierarchy in package `task2`.

| Interface | Method | How it works |
| --- | --- | --- |
| `AnimalBehavior` | `sleep()` | An abstract method implemented by `Dog`, `Pigeon`, and `Blowfish`. `Main` calls each implementation through an indexed `AnimalBehavior[]` reference. |
| `AnimalMove` | `move()` | A default method inherited through `Animal`. It prints the runtime class name and a general movement message. The three leaf classes override it with specific movements. |
| `AnimalName` | `name(String name)` | A static method called directly on `AnimalName`. The loop passes each animal's `getName()` result. |

Compile and run from the repository root using JDK 8 or newer.

```sh
javac -d out src/task2/*.java
java -cp out task2.Main
```
