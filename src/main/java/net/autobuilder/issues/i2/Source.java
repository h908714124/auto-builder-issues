package net.autobuilder.issues.i2;

import com.google.common.collect.ImmutableMap;

import java.nio.file.Path;
import java.util.UUID;

public interface Source {

  default ImmutableMap<UUID, Path> files() {
    return ImmutableMap.of();
  }
}
