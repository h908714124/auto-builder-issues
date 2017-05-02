package net.autobuilder.issues.i2;

import com.google.auto.value.AutoValue;
import com.google.common.collect.ImmutableMap;

import java.nio.file.Path;
import java.util.Map;
import java.util.UUID;

@AutoValue
public abstract class RequestSource implements Source {

  @Override
  public abstract ImmutableMap<UUID, Path> files();

  @AutoValue.Builder
  abstract static class Builder {

    public abstract Builder files(Map<UUID, Path> files);

    public abstract RequestSource build();
  }
}
