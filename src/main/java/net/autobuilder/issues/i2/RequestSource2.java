package net.autobuilder.issues.i2;


import com.google.auto.value.AutoValue;
import com.google.common.collect.ImmutableMap;
import net.autobuilder.AutoBuilder;

import java.nio.file.Path;
import java.util.UUID;

@AutoBuilder
@AutoValue
public abstract class RequestSource2 implements Source {

  @Override
  public abstract ImmutableMap<UUID, Path> files();

}
