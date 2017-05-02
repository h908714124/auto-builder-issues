package net.autobuilder.issues.i2;

import com.google.common.collect.ImmutableMap;
import org.junit.Test;

import java.nio.file.Paths;
import java.util.UUID;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class RequestSourceTest {

  @Test
  public void testAutoValue() throws Exception {
    UUID uuid = UUID.randomUUID();
    RequestSource requestSource = new AutoValue_RequestSource.Builder()
        .files(ImmutableMap.of(uuid, Paths.get("/tmp"))).build();
    assertThat(requestSource.files().size(), is(1));
    assertThat(requestSource.files().get(uuid),
        is(Paths.get("/tmp")));
  }

  @Test
  public void testAutoBuilder() throws Exception {
    UUID uuid = UUID.randomUUID();
    RequestSource2 requestSource = RequestSource2_Builder.builder()
        .files(ImmutableMap.of(uuid, Paths.get("/tmp")))
        .build();
    assertThat(requestSource.files().size(), is(1));
    assertThat(requestSource.files().get(uuid),
        is(Paths.get("/tmp")));
  }
}