# Imported Java/Maven project

## Run on Replit

This project is a Java console application. Its entry point is
`src/main/java/Main.java`, which prints a greeting and then exits.

- Run the configured `Start application` workflow to execute it.
- Output appears in the Console: `Hello world JPWP2!`. The workflow then
  finishes normally; this application does not serve a web page.
- Build and test manually with `mvn test` (currently there are no active tests).
- Run the entry point directly with `javac -d . src/main/java/Main.java && java -cp . Main`.

The Java toolchain is provided by the Replit project configuration.
