
module com.reactivelayer.test {
        requires com.graph.layout;
        requires guice;
        provides com.google.inject.AbstractModule with com.emitter.test.TestConfiguration;
}
