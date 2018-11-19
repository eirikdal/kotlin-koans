package vii_realworld._1__Converting_Java

import com.fasterxml.jackson.databind.ObjectMapper
import com.fasterxml.jackson.datatype.jdk8.Jdk8Module
import com.fasterxml.jackson.module.kotlin.KotlinModule
import junit.framework.Assert.assertEquals
import org.glassfish.jersey.client.ClientConfig
import org.glassfish.jersey.server.ResourceConfig
import org.glassfish.jersey.test.JerseyTest
import org.junit.Test
import javax.ws.rs.core.Application
import javax.ws.rs.ext.ContextResolver

class N43HelloWorldResourceKtTest : JerseyTest() {

    override fun configure(): Application {
        val resource = HelloWorldResource(
                "Hello %s",
                "Stranger"
        )

        return ResourceConfig()
                .registerInstances(resource)
                .register(ContextResolver<ObjectMapper> { ObjectMapper()
                        .registerModule(KotlinModule())
                        .registerModule(Jdk8Module())
                })
    }

    override fun configureClient(config: ClientConfig?) {
        config!!.register(ContextResolver<ObjectMapper> { ObjectMapper()
                .registerModule(KotlinModule())
                .registerModule(Jdk8Module())
        })

        super.configureClient(config)
    }

    @Test
    fun sayHelloDefaultName() {
        task43()
        val response = target("/helloworld")
                .request()
                .get()

        val entity = response.readEntity(Saying::class.java)
        assertEquals(entity.content, "Hello Stranger")
    }

    @Test
    fun sayHelloWorld() {
        task43()
        val response = target("/helloworld")
                .queryParam("name", "10xdev")
                .request()
                .get()

        val entity = response.readEntity(Saying::class.java)
        assertEquals(entity.content, "Hello 10xdev")
    }
}
