import java.io.File;
import java.io.FileFilter;

/**
 * Java 8 lambda expressions are just another way of writing
 * instances of anonymous classes that are easier to read and
 * write
 */
public class Introduction {

    /**
     * Eg: How a normal anonymous class is written.
     * The purpose of using Lambda expression is to make instances
     * of anonymous classes easier to read and write.
     */
    FileFilter fileFilter = new FileFilter() {
        @Override
        public boolean accept(File pathname) {
            return pathname.getName().endsWith(".java");
        }
    };

    /**
     * How to write lambda expression for anonymous classes
     * 1. Take the parameters
     * 2. Add the arrow pointer
     * 3. Write the return block
     */
    FileFilter fileFilterLambda = (file) -> file.getName().endsWith(".java");
}
