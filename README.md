# Java Interface Addition

A small Java example demonstrating an `Addition` interface and two implementations.

## Files
- `src/javaapps/math/Addition.java` — declares the `add()` method.
- `src/javaapps/math/IntAddition.java` — adds two `int` values.
- `src/javaapps/math/LongAddition.java` — adds two `long` values.
- `src/javaapps/math/AdditionOperation.java` — calls implementations through the interface.
- `src/javaapps/math/MainProgram.java` — program entry point.

## Run in VS Code
1. Open this repository folder in VS Code.
2. Install the Extension Pack for Java and ensure a JDK is installed.
3. Open `src/javaapps/math/MainProgram.java`.
4. Click **Run** above `main()`.

Expected output:
```text
Result of adding two int numbers: 14
Result of adding two long numbers: 17
```

This example intentionally has no `module-info.java`, avoiding the named-module package issue.
