package cz.tomasdvorak;

import cz.tomasdvorak.extension.impl.BasicExtension;
import cz.tomasdvorak.extension.impl.ExtensionWithPersistence;
import cz.tomasdvorak.extension.impl.HighPriorityExtension;
import cz.tomasdvorak.extension.ExtensionsApp;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.asset.EmptyAsset;
import org.jboss.shrinkwrap.api.spec.JavaArchive;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;

@RunWith(Arquillian.class)
public class ExtensionsAppTest {

    @Inject
    ExtensionsApp service;

    @Deployment
    public static Archive<?> createDeployment() {
        return ShrinkWrap.create(JavaArchive.class, "test.jar")
                .addPackages(true, "cz.tomasdvorak.extension")
                .addAsManifestResource(EmptyAsset.INSTANCE, "beans.xml");
    }

    @Test
    public void shouldReturnAllExtensionInfos() {
        final HashSet<String> expected = new HashSet<>(Arrays.asList(
                BasicExtension.class.getSimpleName(),
                ExtensionWithPersistence.class.getSimpleName(),
                HighPriorityExtension.class.getSimpleName()
                ));
        Assert.assertEquals(expected, service.getExtensionInfos());
    }

    @Test
    public void shouldReturnPersistableResponse() {
        final HashSet<String> expected = new HashSet<>(Collections.singletonList(ExtensionWithPersistence.class.getSimpleName()));
        Assert.assertEquals(expected, service.getExtensionsWithPersistence());
    }

    @Test
    public void shouldReturnAllWithPriorityDefined() {
        final HashSet<String> expected = new HashSet<>(Collections.singletonList(
                HighPriorityExtension.class.getSimpleName()
        ));
        Assert.assertEquals(expected, service.getExtensionsWithHighPriority());
    }
}