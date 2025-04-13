package fr.demo.quarkus;

import fr.demo.quarkus.resource.AliveResourceTest;
import io.quarkus.test.junit.NativeImageTest;

@NativeImageTest
public class NativeAliveResourceIT extends AliveResourceTest {
    // Execute the same tests but in native mode.
}