package com.github.rmannibucau.bug.surefire;

import org.junit.jupiter.api.Test;

class DemoTest {
    @Test
    void run() {
        // no-op but the output is corrupted cause log4j2 uses FileDescriptor.out
    }
}
